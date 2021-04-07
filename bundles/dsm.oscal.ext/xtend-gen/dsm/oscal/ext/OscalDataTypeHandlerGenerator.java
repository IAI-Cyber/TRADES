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

import dsm.oscal.ext.NameHelper;
import gov.nist.secauto.metaschema.datatypes.adapter.JavaTypeAdapter;
import gov.nist.secauto.metaschema.model.definitions.DataType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generator that create an helper class to handle custom data types
 */
@SuppressWarnings("all")
public class OscalDataTypeHandlerGenerator {
  private final String CLASS_NAME = "OSCALDataTypeHandler";
  
  private final String packageName;
  
  private final String header;
  
  /**
   * <Message,Exception variable> -> java code to log
   */
  private final BiFunction<String, String, String> logExpressionProvider;
  
  private List<DataType> types;
  
  /**
   * @param packageName The package name of this class
   * @param logExpressionProvider a provider of log function code <error message, name of the exception variable> -> the code that log the error
   * @param types the list of types to generate
   */
  public OscalDataTypeHandlerGenerator(final String packageName, final BiFunction<String, String, String> logExpressionProvider, final List<DataType> types, final String header) {
    this.packageName = packageName;
    this.logExpressionProvider = logExpressionProvider;
    this.types = types;
    this.header = header;
  }
  
  /**
   * @param srcFolder the path to the src folder that will own the new class
   */
  public Path generate(final Path srcFolder) {
    try {
      Path _xblockexpression = null;
      {
        final Path packageFolder = srcFolder.resolve(this.packageName.replace(".", "/"));
        boolean _exists = packageFolder.toFile().exists();
        boolean _not = (!_exists);
        if (_not) {
          packageFolder.toFile().mkdirs();
        }
        final Path file = packageFolder.resolve((this.CLASS_NAME + ".java"));
        _xblockexpression = Files.writeString(file, this.generateClassContent(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String generateClassContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    {
      if ((this.header != null)) {
        _builder.append(this.header);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<gov.nist.secauto.metaschema.codegen.type.DataType> _genTypes = this.getGenTypes();
      for(final gov.nist.secauto.metaschema.codegen.type.DataType dataType : _genTypes) {
        {
          Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass = dataType.getJavaTypeAdapterClass();
          boolean _tripleNotEquals = (_javaTypeAdapterClass != null);
          if (_tripleNotEquals) {
            _builder.append("import ");
            String _name = dataType.getJavaTypeAdapterClass().getName();
            _builder.append(_name);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("import java.lang.String;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.CLASS_NAME);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final ");
    _builder.append(this.CLASS_NAME, "\t");
    _builder.append(" INSTANCE = new ");
    _builder.append(this.packageName, "\t");
    _builder.append(".");
    _builder.append(this.CLASS_NAME, "\t");
    _builder.append("CustomImpl();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      List<gov.nist.secauto.metaschema.codegen.type.DataType> _genTypes_1 = this.getGenTypes();
      for(final gov.nist.secauto.metaschema.codegen.type.DataType dataType_1 : _genTypes_1) {
        {
          Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass_1 = dataType_1.getJavaTypeAdapterClass();
          boolean _tripleNotEquals_1 = (_javaTypeAdapterClass_1 != null);
          if (_tripleNotEquals_1) {
            _builder.append("\t");
            _builder.append("private static ");
            String _simpleName = dataType_1.getJavaTypeAdapterClass().getSimpleName();
            _builder.append(_simpleName, "\t");
            _builder.append(" ");
            String _attrName = this.attrName(dataType_1);
            _builder.append(_attrName, "\t");
            _builder.append(" = new ");
            String _simpleName_1 = dataType_1.getJavaTypeAdapterClass().getSimpleName();
            _builder.append(_simpleName_1, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      for(final DataType dataType_2 : this.types) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _generaToStringMethod = this.generaToStringMethod(dataType_2);
        _builder.append(_generaToStringMethod, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _generaToValueMethod = this.generaToValueMethod(dataType_2);
        _builder.append(_generaToValueMethod, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private List<gov.nist.secauto.metaschema.codegen.type.DataType> getGenTypes() {
    final Function<DataType, gov.nist.secauto.metaschema.codegen.type.DataType> _function = new Function<DataType, gov.nist.secauto.metaschema.codegen.type.DataType>() {
      public gov.nist.secauto.metaschema.codegen.type.DataType apply(final DataType it) {
        return gov.nist.secauto.metaschema.codegen.type.DataType.lookupByDatatype(it);
      }
    };
    return this.types.stream().<gov.nist.secauto.metaschema.codegen.type.DataType>map(_function).collect(Collectors.<gov.nist.secauto.metaschema.codegen.type.DataType>toList());
  }
  
  /**
   * Gets the code to convert the given data type to a String
   */
  public String getToStringCode(final DataType dataType) {
    gov.nist.secauto.metaschema.codegen.type.DataType genDataType = gov.nist.secauto.metaschema.codegen.type.DataType.lookupByDatatype(dataType);
    Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass = genDataType.getJavaTypeAdapterClass();
    boolean _tripleNotEquals = (_javaTypeAdapterClass != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return ");
      _builder.append(this.packageName);
      _builder.append(".");
      _builder.append(this.CLASS_NAME);
      _builder.append(".INSTANCE.");
      String _toStringMethodName = this.getToStringMethodName(genDataType);
      _builder.append(_toStringMethodName);
      _builder.append("(it);");
      return _builder.toString();
    } else {
      return "return null;";
    }
  }
  
  /**
   * Gets the code to convert from a String to an instance of the given data type
   */
  public String getFromStringCode(final DataType dataType) {
    gov.nist.secauto.metaschema.codegen.type.DataType genDataType = gov.nist.secauto.metaschema.codegen.type.DataType.lookupByDatatype(dataType);
    Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass = genDataType.getJavaTypeAdapterClass();
    boolean _tripleNotEquals = (_javaTypeAdapterClass != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return ");
      _builder.append(this.packageName);
      _builder.append(".");
      _builder.append(this.CLASS_NAME);
      _builder.append(".INSTANCE.");
      String _fromStringMethodName = this.getFromStringMethodName(genDataType);
      _builder.append(_fromStringMethodName);
      _builder.append("(it);");
      return _builder.toString();
    } else {
      return "return null;";
    }
  }
  
  private String getToStringMethodName(final gov.nist.secauto.metaschema.codegen.type.DataType genType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("save");
    String _properEDataTypeName = NameHelper.getProperEDataTypeName(genType);
    _builder.append(_properEDataTypeName);
    _builder.append("ToString");
    return _builder.toString();
  }
  
  private String getFromStringMethodName(final gov.nist.secauto.metaschema.codegen.type.DataType genType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("load");
    String _properEDataTypeName = NameHelper.getProperEDataTypeName(genType);
    _builder.append(_properEDataTypeName);
    _builder.append("FromString");
    return _builder.toString();
  }
  
  private String generaToStringMethod(final DataType dataType) {
    gov.nist.secauto.metaschema.codegen.type.DataType genDataType = gov.nist.secauto.metaschema.codegen.type.DataType.lookupByDatatype(dataType);
    Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass = genDataType.getJavaTypeAdapterClass();
    boolean _tripleNotEquals = (_javaTypeAdapterClass != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append("* @generated");
      _builder.newLine();
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public String ");
      String _toStringMethodName = this.getToStringMethodName(genDataType);
      _builder.append(_toStringMethodName);
      _builder.append("(");
      String _string = genDataType.getTypeName().toString();
      _builder.append(_string);
      _builder.append(" value){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("return ");
      String _attrName = this.attrName(genDataType);
      _builder.append(_attrName, "\t");
      _builder.append(".asString(value);");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    } else {
      return "";
    }
  }
  
  private String generaToValueMethod(final DataType dataType) {
    gov.nist.secauto.metaschema.codegen.type.DataType genDataType = gov.nist.secauto.metaschema.codegen.type.DataType.lookupByDatatype(dataType);
    Class<? extends JavaTypeAdapter<?>> _javaTypeAdapterClass = genDataType.getJavaTypeAdapterClass();
    boolean _tripleNotEquals = (_javaTypeAdapterClass != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append("* @generated");
      _builder.newLine();
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public ");
      String _string = genDataType.getTypeName().toString();
      _builder.append(_string);
      _builder.append(" ");
      String _fromStringMethodName = this.getFromStringMethodName(genDataType);
      _builder.append(_fromStringMethodName);
      _builder.append("(String value){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("if(value == null){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return ");
      String _attrName = this.attrName(genDataType);
      _builder.append(_attrName, "\t\t");
      _builder.append(".parse(value);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("} catch (java.lang.Exception e){");
      _builder.newLine();
      _builder.append("\t\t");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unable to parse data type ");
      String _properEDataTypeName = NameHelper.getProperEDataTypeName(genDataType);
      _builder_1.append(_properEDataTypeName);
      String _apply = this.logExpressionProvider.apply(_builder_1.toString(), "e");
      _builder.append(_apply, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    } else {
      return "";
    }
  }
  
  private String attrName(final gov.nist.secauto.metaschema.codegen.type.DataType dataType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("adapter");
    String _properEDataTypeName = NameHelper.getProperEDataTypeName(dataType);
    _builder.append(_properEDataTypeName);
    return _builder.toString();
  }
}
