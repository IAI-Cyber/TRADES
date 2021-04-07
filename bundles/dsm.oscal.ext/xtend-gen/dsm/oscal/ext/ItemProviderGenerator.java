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
 */
package dsm.oscal.ext;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
@SuppressWarnings("all")
public class ItemProviderGenerator {
  private static final String MARKUP_LINE = "MarkupLineType";
  
  private static final String MARKUP_MULTILINE = "MarkupMultilneType";
  
  private Path genFolder;
  
  private Path manFolder;
  
  private String header;
  
  private BiFunction<String, String, String> imageProvider;
  
  /**
   * @param genFolder path the src-gen folder
   * @param manFolder path to the src-man folder
   * @param header optional header to add in the generated sources
   */
  public ItemProviderGenerator(final Path genFolder, final Path manFolder, final String header, final BiFunction<String, String, String> imageProvider) {
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
  public void generate(final GenClassImpl genClass) {
    try {
      final GenFeature labelFeature = this.getLabelGenFeature(genClass);
      final String imagePath = this.imageProvider.apply(genClass.getGenPackage().getEcorePackage().getName(), genClass.getName());
      if (((labelFeature == null) && (imagePath == null))) {
        return;
      }
      final String classQName = genClass.getQualifiedProviderClassName();
      final String packageName = classQName.substring(0, classQName.lastIndexOf("."));
      final String pathString = packageName.replace(".", "/");
      String _providerClassName = genClass.getProviderClassName();
      final String baseCustomClassName = (_providerClassName + "BaseCustomImpl");
      final Path targetPath = this.genFolder.resolve(pathString).resolve((baseCustomClassName + ".java"));
      final File parentFolder = targetPath.getParent().toFile();
      boolean _exists = parentFolder.exists();
      boolean _not = (!_exists);
      if (_not) {
        parentFolder.mkdirs();
      }
      Files.writeString(targetPath, this.generateBaseClassContent(genClass, packageName, baseCustomClassName, imagePath), 
        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      String _providerClassName_1 = genClass.getProviderClassName();
      final String customClassName = (_providerClassName_1 + "CustomImpl");
      final Path customTargetPath = this.manFolder.resolve(pathString).resolve((customClassName + ".java"));
      boolean _exists_1 = customTargetPath.toFile().exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        customTargetPath.getParent().toFile().mkdirs();
        Files.writeString(customTargetPath, 
          this.generateCustomClassContent(genClass, packageName, customClassName, baseCustomClassName), 
          StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String generateCustomClassContent(final GenClassImpl genClass, final String packageName, final String className, final String superClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.header != null)) {
        _builder.append(this.header);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.notify.AdapterFactory;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" extends ");
    _builder.append(superClass);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append("(AdapterFactory adapterFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(adapterFactory);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateBaseClassContent(final GenClassImpl genClass, final String packageName, final String className, final String imagePath) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.header != null)) {
        _builder.append(this.header);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.notify.AdapterFactory;");
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedInterfaceName = genClass.getQualifiedInterfaceName();
    _builder.append(_qualifiedInterfaceName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" extends ");
    String _providerClassName = genClass.getProviderClassName();
    _builder.append(_providerClassName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append("(AdapterFactory adapterFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(adapterFactory);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final GenFeature labelFeature = this.getLabelGenFeature(genClass);
    _builder.newLineIfNotEmpty();
    {
      if ((labelFeature != null)) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public String getText(Object object) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _name = genClass.getName();
        _builder.append(_name, "\t\t");
        _builder.append(" element = (");
        String _name_1 = genClass.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(") object;");
        _builder.newLineIfNotEmpty();
        {
          boolean _equals = String.class.getName().equals(labelFeature.getType(genClass));
          if (_equals) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return element.get");
            String _accessorName = labelFeature.getAccessorName();
            _builder.append(_accessorName, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _isMarkupType = this.isMarkupType(labelFeature);
            if (_isMarkupType) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("if(element.get");
              String _accessorName_1 = labelFeature.getAccessorName();
              _builder.append(_accessorName_1, "\t\t");
              _builder.append("() != null){");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return element.get");
              String _accessorName_2 = labelFeature.getAccessorName();
              _builder.append(_accessorName_2, "\t\t\t");
              _builder.append("().toMarkdown();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}else {");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return \"\";");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            } else {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("if(element.get");
              String _accessorName_3 = labelFeature.getAccessorName();
              _builder.append(_accessorName_3, "\t\t");
              _builder.append("() != null){");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return element.get");
              String _accessorName_4 = labelFeature.getAccessorName();
              _builder.append(_accessorName_4, "\t\t\t");
              _builder.append("().toString();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}else {");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return \"\";");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if ((imagePath != null)) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Object getImage(Object object) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return overlayImage(object, getResourceLocator().getImage(\"");
        _builder.append(imagePath, "\t\t");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private GenFeature getLabelGenFeature(final GenClass genClass) {
    final GenFeature genFeature = this.getFeature(genClass, "name").orElse(
      this.getFeature(genClass, "title").orElse(
        this.getFeature(genClass, "label").orElse(
          this.getFeature(genClass, "id").orElse(
            this.getFirstLineOfType(genClass, ItemProviderGenerator.MARKUP_LINE).orElse(null)))));
    if ((genFeature != null)) {
      String _name = genFeature.getName();
      String _plus = ("Using " + _name);
      String _plus_1 = (_plus + " for eclass ");
      String _name_1 = genClass.getName();
      String _plus_2 = (_plus_1 + _name_1);
      InputOutput.<String>println(_plus_2);
    } else {
      String _name_2 = genClass.getName();
      String _plus_3 = ("No label feature found for " + _name_2);
      InputOutput.<String>println(_plus_3);
    }
    return genFeature;
  }
  
  private Optional<GenFeature> getFeature(final GenClass genClass, final String name) {
    final Predicate<GenFeature> _function = new Predicate<GenFeature>() {
      public boolean test(final GenFeature it) {
        return name.equalsIgnoreCase(it.getName());
      }
    };
    return genClass.getAllGenFeatures().stream().filter(_function).findFirst();
  }
  
  private Optional<GenFeature> getFirstLineOfType(final GenClass genClass, final String type) {
    List<GenFeature> _allGenFeatures = genClass.getAllGenFeatures();
    for (final GenFeature genfeature : _allGenFeatures) {
      GenDataType _typeGenDataType = genfeature.getTypeGenDataType();
      boolean _tripleNotEquals = (_typeGenDataType != null);
      if (_tripleNotEquals) {
        final EStructuralFeature feature = genfeature.getEcoreFeature();
        boolean _isMany = feature.isMany();
        boolean _not = (!_isMany);
        if (_not) {
          final String featureType = feature.getEType().getName();
          boolean _equals = featureType.equals(type);
          if (_equals) {
            return Optional.<GenFeature>of(genfeature);
          }
        }
      }
    }
    return Optional.<GenFeature>empty();
  }
  
  private boolean isMarkupType(final GenFeature genFeature) {
    GenDataType _typeGenDataType = genFeature.getTypeGenDataType();
    boolean _tripleNotEquals = (_typeGenDataType != null);
    if (_tripleNotEquals) {
      final EStructuralFeature feature = genFeature.getEcoreFeature();
      final String featureType = feature.getEType().getName();
      return (featureType.equals(ItemProviderGenerator.MARKUP_MULTILINE) || featureType.equals(ItemProviderGenerator.MARKUP_LINE));
    }
    return false;
  }
}
