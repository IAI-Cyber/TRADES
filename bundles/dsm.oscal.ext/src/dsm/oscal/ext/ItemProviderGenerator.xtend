/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.oscal.ext

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.Optional
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl
import java.util.function.BiFunction

/**
 * Generator that generate two classes
 * 
 * <p>
 * <ul>
 * <li> One in the <i>src-gen</i> folder name ${EClass}BaseCustomImpl. This class is <b>always generated</b> </li>
 * <li> One in the <i>src-man</i> folder name ${EClass}CustomImpl. This class is only generated if missing. It inherits from the first EClass. It used with EMF LoopHolde to provide fine grain customization </li>
 * </ul>
 * </p>
 */
class ItemProviderGenerator {

	static final String MARKUP_LINE = "MarkupLineType"
	static final String MARKUP_MULTILINE = "MarkupMultilneType"

	Path genFolder

	Path manFolder

	String header
	
	BiFunction<String, String, String> imageProvider

	/**
	 * @param genFolder path the src-gen folder
	 * @param manFolder path to the src-man folder
	 * @param header optional header to add in the generated sources
	 */
	new(Path genFolder, Path manFolder, String header,BiFunction<String,String,String> imageProvider) {
		this.genFolder = genFolder;
		this.manFolder = manFolder;
		this.header = header;
		this.imageProvider = imageProvider;
	}

	/**
	 * Generates the item provider class
	 * 
	 * @param genClass the GenClass to generate the item from
	 */
	def void generate(GenClassImpl genClass) {
		
		val labelFeature = genClass.getLabelGenFeature;
		val imagePath = imageProvider.apply(genClass.genPackage.getEcorePackage().getName(), genClass.getName())
		
		if(labelFeature === null && imagePath === null){
			// Nothing to generate
			return
		}
		
		
		
		val classQName = genClass.qualifiedProviderClassName
		val packageName = classQName.substring(0, classQName.lastIndexOf('.'));
		
		val pathString = packageName.replace('.', '/');
		
		// Generate the BaseCustom imple class
		val baseCustomClassName = genClass.providerClassName + "BaseCustomImpl"
		val targetPath = genFolder.resolve(pathString).resolve(baseCustomClassName + ".java");
		val parentFolder = targetPath.parent.toFile;
		if (!parentFolder.exists) {
			parentFolder.mkdirs
		}
		Files.writeString(targetPath, genClass.generateBaseClassContent(packageName, baseCustomClassName, imagePath),
			StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)

		// generate the custom class if no existing
		val customClassName = genClass.providerClassName + "CustomImpl"
		val customTargetPath = manFolder.resolve(pathString).resolve(customClassName + ".java");
		if (!customTargetPath.toFile.exists) {
			customTargetPath.parent.toFile.mkdirs
			Files.writeString(customTargetPath,
				genClass.generateCustomClassContent(packageName, customClassName, baseCustomClassName),
				StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)

		}
	}

	private def String generateCustomClassContent(GenClassImpl genClass, String packageName, String className,
		String superClass) '''
		«IF header !== null»
			«header»
		«ENDIF»
		package «packageName»;
				
		import org.eclipse.emf.common.notify.AdapterFactory;
		
		public class «className» extends «superClass» {
			
			public «className»(AdapterFactory adapterFactory) {
				super(adapterFactory);
			}
		
			
		}
	'''

	private def String generateBaseClassContent(GenClassImpl genClass, String packageName, String className,
		String imagePath) '''
		«IF header !== null»
			«header»
		«ENDIF»
		package «packageName»;
		
		import org.eclipse.emf.common.notify.AdapterFactory;
		import «genClass.qualifiedInterfaceName»;
		
		public class «className» extends «genClass.providerClassName» {
			
			public «className»(AdapterFactory adapterFactory) {
				super(adapterFactory);
			}
			
			«val labelFeature = genClass.getLabelGenFeature»
			«IF labelFeature !== null»
				/**
				 * @generated
				 */
				@Override
				public String getText(Object object) {
					«genClass.name» element = («genClass.name») object;
					«IF String.name.equals(labelFeature.getType(genClass)) »
						return element.get«labelFeature.accessorName»();
					«ELSEIF labelFeature.isMarkupType»
						if(element.get«labelFeature.accessorName»() != null){
							return element.get«labelFeature.accessorName»().toMarkdown();
						}else {
							return "";
						}
					«ELSE»
						if(element.get«labelFeature.accessorName»() != null){
							return element.get«labelFeature.accessorName»().toString();
						}else {
							return "";
						}
					«ENDIF»
				}
			«ENDIF»
			
			«IF imagePath !== null»
				/**
				   * @generated
				   */
				@Override
				public Object getImage(Object object) {
					return overlayImage(object, getResourceLocator().getImage("«imagePath»"));
				}
			«ENDIF»
			
		}
	'''

	private def GenFeature getLabelGenFeature(GenClass genClass) {
		val genFeature = genClass.getFeature("name") //
		.orElse(genClass.getFeature("title") //
		.orElse(genClass.getFeature("label") //
		.orElse(genClass.getFeature("id") //
		.orElse(genClass.getFirstLineOfType(MARKUP_LINE) //
		.orElse(null)))))
		
		if (genFeature !== null) {
			println("Using " + genFeature.name + " for eclass " + genClass.name)
		} else {
			println("No label feature found for " + genClass.name)
		}

		return genFeature;

	}

	private def Optional<GenFeature> getFeature(GenClass genClass, String name) {
		return genClass.allGenFeatures.stream.filter[name.equalsIgnoreCase(it.name)].findFirst
	}

	private def Optional<GenFeature> getFirstLineOfType(GenClass genClass, String type) {
		for (GenFeature genfeature : genClass.allGenFeatures) {
			if (genfeature.typeGenDataType !== null) {
				val feature = genfeature.ecoreFeature
				if (!feature.isMany) {
					val featureType = feature.EType.name;
					if (featureType.equals(type)) {
						return Optional.of(genfeature)
					}
				}
			}
		}
		return Optional.empty
	}

	private def boolean isMarkupType(GenFeature genFeature) {
		if (genFeature.typeGenDataType !== null) {
			val feature = genFeature.ecoreFeature
			val featureType = feature.EType.name;
			return featureType.equals(MARKUP_MULTILINE) || featureType.equals(MARKUP_LINE);
		}
		return false;
	}

}
