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

import gov.nist.secauto.metaschema.codegen.type.DataType
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.List
import java.util.function.BiFunction

import static java.util.stream.Collectors.toList

/**
 * Generator that create an helper class to handle custom data types
 */
class OscalDataTypeHandlerGenerator {

	val String CLASS_NAME = "OSCALDataTypeHandler";

	val String packageName;
	
	val String header;
	
	/**
	 * <Message,Exception variable> -> java code to log
	 */
	val BiFunction<String, String, String> logExpressionProvider;

	List<gov.nist.secauto.metaschema.model.definitions.DataType> types

	/**
	 * @param packageName The package name of this class 
	 * @param logExpressionProvider a provider of log function code <error message, name of the exception variable> -> the code that log the error
	 * @param types the list of types to generate
	 */
	new(String packageName, BiFunction<String, String, String> logExpressionProvider,
		List<gov.nist.secauto.metaschema.model.definitions.DataType> types,String header) {
		this.packageName = packageName;
		this.logExpressionProvider = logExpressionProvider;
		this.types = types;
		this.header = header;
	}

	/**
	 * @param srcFolder the path to the src folder that will own the new class
	 */
	def generate(Path srcFolder) {
		val Path packageFolder = srcFolder.resolve(packageName.replace('.', '/'));
		if (!packageFolder.toFile.exists) {
			packageFolder.toFile.mkdirs
		}

		val file = packageFolder.resolve(CLASS_NAME + ".java");
		Files.writeString(file, generateClassContent(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)
	}

	private def String generateClassContent() '''
	
«IF header !== null»
«header»
«ENDIF»

package «packageName»;

«FOR dataType : getGenTypes()»
	«IF dataType.javaTypeAdapterClass !== null»
		import «dataType.javaTypeAdapterClass.name»;
	«ENDIF»
«ENDFOR»
import java.lang.String;

public class «CLASS_NAME» {
	
	public static final «CLASS_NAME» INSTANCE = new «packageName».«CLASS_NAME»CustomImpl();
	
	«FOR dataType : getGenTypes()»
		«IF dataType.javaTypeAdapterClass !== null»
		private static «dataType.javaTypeAdapterClass.simpleName» «dataType.attrName» = new «dataType.javaTypeAdapterClass.simpleName»();
		«ENDIF»
	«ENDFOR»
	
	«FOR dataType : types»
	
	«dataType.generaToStringMethod»
	
	«dataType.generaToValueMethod»
	«ENDFOR»
	
}
	'''

	private def List<DataType> getGenTypes() {
		types.stream.map[DataType.lookupByDatatype(it)].collect(toList)
	}

	/**
	 * Gets the code to convert the given data type to a String
	 */
	def String getToStringCode(gov.nist.secauto.metaschema.model.definitions.DataType dataType) {
		var genDataType = DataType.lookupByDatatype(dataType)
		if (genDataType.javaTypeAdapterClass !== null) {
			return '''return «packageName».«CLASS_NAME».INSTANCE.«genDataType.toStringMethodName»(it);'''
		} else {
			return "return null;";
		}
	}

	/**
	 * Gets the code to convert from a String to an instance of the given data type
	 */
	def String getFromStringCode(gov.nist.secauto.metaschema.model.definitions.DataType dataType) {
		var genDataType = DataType.lookupByDatatype(dataType)
		if (genDataType.javaTypeAdapterClass !== null) {
			return '''return «packageName».«CLASS_NAME».INSTANCE.«genDataType.getFromStringMethodName»(it);'''
		} else {
			return "return null;";
		}
	}

	private def String getToStringMethodName(
		DataType genType) '''save«NameHelper.getProperEDataTypeName(genType)»ToString'''

	private def String getFromStringMethodName(
		DataType genType) '''load«NameHelper.getProperEDataTypeName(genType)»FromString'''

	private def String generaToStringMethod(gov.nist.secauto.metaschema.model.definitions.DataType dataType) {
		var genDataType = DataType.lookupByDatatype(dataType)
		if (genDataType.javaTypeAdapterClass !== null) {
			return '''
				/**
				* @generated
				*/
				public String «genDataType.getToStringMethodName»(«genDataType.getTypeName().toString()» value){
					return «genDataType.attrName».asString(value);
				}
			'''
		} else {
			return "";
		}
	}

	private def String generaToValueMethod(gov.nist.secauto.metaschema.model.definitions.DataType dataType) {
		var genDataType = DataType.lookupByDatatype(dataType)
		if (genDataType.javaTypeAdapterClass !== null) {
			return '''
				/**
				* @generated
				*/
				public «genDataType.getTypeName().toString()» «genDataType.fromStringMethodName»(String value){
					if(value == null){
						return null;
					}
					try {
						return «genDataType.attrName».parse(value);
					} catch (java.lang.Exception e){
						«logExpressionProvider.apply('''Unable to parse data type «NameHelper.getProperEDataTypeName(genDataType)»''',"e")»;
						return null;
					}
				}
			'''
		} else {
			return "";
		}
	}

	private def String attrName(DataType dataType) '''adapter«NameHelper.getProperEDataTypeName(dataType)»'''
}
