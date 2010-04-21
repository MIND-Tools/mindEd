package org.ow2.fractal.mind.ide;

import org.objectweb.fractal.adl.arguments.ArgumentErrors;
import org.objectweb.fractal.adl.attributes.AttributeErrors;
import org.objectweb.fractal.adl.bindings.BindingErrors;
import org.objectweb.fractal.adl.components.ComponentErrors;
import org.objectweb.fractal.adl.error.GenericErrors;
import org.objectweb.fractal.adl.implementations.ImplementationErrors;
import org.objectweb.fractal.adl.interfaces.InterfaceErrors;
import org.objectweb.fractal.adl.types.TypeErrors;
import org.objectweb.fractal.adl.xml.XMLErrors;


/**
 * Generated form fractal adl version 2.6 and mindc version 0.2
 * <pre> - org.objectweb.fractal.adl.ADLErrors, 
 - org.ow2.mind.adl.ADLErrors
 - org.objectweb.fractal.adl.arguments.ArgumentErrors
 - org.objectweb.fractal.adl.attributes.AttributeErrors
 - org.objectweb.fractal.adl.bindings.BindingErrors
 - org.objectweb.fractal.adl.components.ComponentErrors
 - org.objectweb.fractal.adl.error.GenericErrors
 - org.objectweb.fractal.adl.implementations.ImplementationErrors
 - org.objectweb.fractal.adl.interfaces.InterfaceErrors
 - org.objectweb.fractal.adl.types.TypeErrors
 - org.objectweb.fractal.adl.xml.XMLErrors
 </pre>
 *
 */
public class MindcErrorCodes {
	public static final int ADL_ADL_NOT_FOUND = 0;
	public static final int ADL_IO_ERROR = 4;
	public static final int ADL_PARSE_ERROR = 3;
	public static final int ADL_TASK_EXECUTION_ERROR = 1;
	public static final int ADL_WRONG_DEFINITION_NAME = 2;
	public static final int ARG_EMPTY_ARGUMENT_NAME = 2;
	public static final int ARG_INVALID_ARGNAME = 3;
	public static final int ARG_INVALID_ARGUMENT_VALUE_LIST = 0;
	public static final int ARG_INVALID_ARGUMENT_VALUE_SPECIFICATION = 1;
	public static final int ARG_INVALID_PATTERN_DEFAULT_VALUE = 6;
	public static final int ARG_INVALID_PATTERN_SYNTAX_ERROR = 5;
	public static final int ARG_INVALID_VALUE_NOT_A_STRING = 9;
	public static final int ARG_NO_VALUE = 4;
	public static final int ARG_UNDEFINED_ARGUMENT = 8;
	public static final int ARG_UNKNOWN_PREFIX = 7;
	public static final int ATT_INVALID_BOOLEAN_VALUE = 13;
	public static final int ATT_INVALID_BYTE_VALUE = 10;
	public static final int ATT_INVALID_CHAR_VALUE = 11;
	public static final int ATT_INVALID_DOUBLE_VALUE = 9;
	public static final int ATT_INVALID_FLOAT_VALUE = 8;
	public static final int ATT_INVALID_INTEGER_VALUE = 6;
	public static final int ATT_INVALID_LONG_VALUE = 7;
	public static final int ATT_INVALID_SHORT_VALUE = 12;
	public static final int ATT_NAME_MISSING = 1;
	public static final int ATT_NO_SUCH_ATTRIBUTE = 3;
	public static final int ATT_SIGNATURE_MISSING = 0;
	public static final int ATT_UNEXPECTED_ATTRIBUTE_TYPE = 5;
	public static final int ATT_UNSUPPORTED_ATTRIBUTE_TYPE = 4;
	public static final int ATT_VALUE_MISSING = 2;
	public static final int BDG_DUPLICATED_BINDING = 0;
	public static final int BDG_INVALID_FROM_INTERNAL = 7;
	public static final int BDG_INVALID_FROM_NOT_A_CLIENT = 8;
	public static final int BDG_INVALID_FROM_SYNTAX = 3;
	public static final int BDG_INVALID_ITF_NO_SUCH_COMPONENT = 5;
	public static final int BDG_INVALID_ITF_NO_SUCH_INTERFACE = 6;
	public static final int BDG_INVALID_MANDATORY_TO_OPTIONAL = 11;
	public static final int BDG_INVALID_SIGNATURE = 12;
	public static final int BDG_INVALID_TO_INTERNAL = 9;
	public static final int BDG_INVALID_TO_NOT_A_SERVER = 10;
	public static final int BDG_INVALID_TO_SYNTAX = 4;
	public static final int BDG_MISSING_FROM = 1;
	public static final int BDG_MISSING_TO = 2;
	public static final int BDG_UNBOUND_CLIENT_INTERFACE = 13;
	public static final int BDG_UNBOUND_COMPOSITE_SERVER_INTERFACE = 14;
	public static final int CMP_COMPONENT_NAME_MISSING = 1;
	public static final int CMP_DEFINITION_CYCLE = 0;
	public static final int CMP_DUPLICATED_COMPONENT_NAME = 2;
	public static final int CMP_INVALID_PATH = 3;
	public static final int CMP_MERGE_ERROR = 5;
	public static final int CMP_SHARED_WITH_DIFFERENT_NAME = 4;
	public static final int GEN_GENERIC_ERROR = 0;
	public static final int GEN_INTERNAL_ERROR = 1;
	public static final String GROUP_ID_ADL = "ADL";
	public static final String GROUP_ID_ARG = "ARG";
	public static final String GROUP_ID_ATT = "ATT";
	public static final String GROUP_ID_BDG = "BDG";
	public static final String GROUP_ID_CMP = "CMP";
	public static final String GROUP_ID_GEN = "GEN";
	public static final String GROUP_ID_IMP = "IMP";
	public static final String GROUP_ID_ITF = "ITF";
	public static final String GROUP_ID_MADL = "MADL";
	public static final String GROUP_ID_TYP = "TYP";
	public static final String GROUP_ID_XML = "XML";
	public static final int IMP_CLASS_DOES_NOT_IMPLEMENT_ATTR_CTRL = 3;
	public static final int IMP_CLASS_DOES_NOT_IMPLEMENT_INTERFACE = 2;
	public static final int IMP_IMPLEMENTATION_MISSING = 0;
	public static final int IMP_IMPLEMENTATION_NOT_FOUND = 1;
	public static final int IMP_MISSING_CONTROLLER_DESC = 4;
	public static final int ITF_DUPLICATED_INTERFACE_NAME = 2;
	public static final int ITF_INTERFACE_NAME_MISSING = 0;
	public static final int ITF_INTERFACE_NOT_FOUND = 1;
	public static final int MADL_DO_NOT_OVERRIDE = 54;
	public static final int MADL_DUPLICATED_ARGUMENT_VARIABLE_NAME = 75;
	public static final int MADL_DUPLICATED_ATTRIBUTE_NAME = 62;
	public static final int MADL_DUPLICATED_TEMPALTE_VARIABLE_NAME = 27;
	public static final int MADL_INCOMPATIBLE_ARGUMENT_TYPE = 76;
	public static final int MADL_INCOMPATIBLE_ARGUMENT_VALUE = 77;
	public static final int MADL_INCOMPATIBLE_ATTRIBUTE_VALUE = 78;
	public static final int MADL_INSTANTIATE_ARGUMENT_DEFINIITON = 102;
	public static final int MADL_INSTANTIATE_TEMPLATE_DEFINIITON = 101;
	public static final int MADL_INSTANTIATE_TYPE_DEFINIITON = 100;
	public static final int MADL_INVALID_ANY_TEMPLATE_VALUE = 23;
	public static final int MADL_INVALID_ATTRIBUTE_MISSING_TYPE = 60;
	public static final int MADL_INVALID_ATTRIBUTE_OVERRIDE_INHERITED_ATTRIBUTE_TYPE = 56;
	public static final int MADL_INVALID_ATTRIBUTE_VALUE_INCOMPATIBLE_TYPE = 61;
	public static final int MADL_INVALID_EXTENDS_COMPOSITE_EXTENDS_PRIMITIVE = 53;
	public static final int MADL_INVALID_EXTENDS_PRIMITIVE_EXTENDS_COMPOSITE = 52;
	public static final int MADL_INVALID_EXTENDS_TYPE_EXTENDS_COMPOSITE = 51;
	public static final int MADL_INVALID_EXTENDS_TYPE_EXTENDS_PRIMITIVE = 50;
	public static final int MADL_INVALID_FACTORY_OF_ABSTRACT = 91;
	public static final int MADL_INVALID_FACTORY_OF_REFERENCED_SINGLETON = 92;
	public static final int MADL_INVALID_FACTORY_OF_SINGLETON = 90;
	public static final int MADL_INVALID_INTERFACE_NAME_OVERRIDE_INHERITED_INTERFACE = 55;
	public static final int MADL_INVALID_PATH = 65;
	public static final int MADL_INVALID_REFERENCE_ANY_TEMPLATE_VALUE = 22;
	public static final int MADL_INVALID_REFERENCE_FOR_SUB_COMPONENT = 3;
	public static final int MADL_INVALID_REFERENCE_MISSING_ARGUMENT = 71;
	public static final int MADL_INVALID_REFERENCE_MISSING_TEMPLATE_VALUE = 20;
	public static final int MADL_INVALID_REFERENCE_NOT_A_COMPOSITE = 1;
	public static final int MADL_INVALID_REFERENCE_NOT_A_PRIMITIVE = 2;
	public static final int MADL_INVALID_REFERENCE_NOT_A_TYPE = 0;
	public static final int MADL_INVALID_REFERENCE_NO_PARAMETER = 70;
	public static final int MADL_INVALID_REFERENCE_NO_SUCH_PARAMETER = 73;
	public static final int MADL_INVALID_REFERENCE_NO_SUCH_TEMPLATE_VARIABLE = 24;
	public static final int MADL_INVALID_REFERENCE_NO_TEMPLATE_VARIABLE = 25;
	public static final int MADL_INVALID_REFERENCE_TOO_MANY_ARGUMENT = 72;
	public static final int MADL_INVALID_REFERENCE_TOO_MANY_TEMPLATE_VALUE = 21;
	public static final int MADL_INVALID_SUB_COMPONENT = 10;
	public static final int MADL_INVALID_SUB_COMPONENT_DUPLICATE_SINGLETON = 11;
	public static final int MADL_INVALID_TEMPLATE_VALUE_CLIENT_INTERFACE_MUST_BE_OPTIONAL = 31;
	public static final int MADL_INVALID_TEMPLATE_VALUE_MISSING_CLIENT_INTERFACE = 30;
	public static final int MADL_INVALID_TEMPLATE_VALUE_MISSING_SERVER_INTERFACE = 29;
	public static final int MADL_INVALID_TEMPLATE_VALUE_TYPE_DEFINITON = 28;
	public static final int MADL_MISSING_SOURCE = 67;
	public static final int MADL_SINGLETON_WITH_DIFFERENT_NAME = 93;
	public static final int MADL_SOURCE_NOT_FOUND = 66;
	public static final int MADL_UNDEFINED_PARAMETER = 74;
	public static final int MADL_UNDEFINED_TEMPALTE_VARIABLE = 26;
	public static final int MADL_UNKNOWN_IMPORT = 110;
	public static final int TYP_INVALID_CARDINALITY = 4;
	public static final int TYP_INVALID_CONTINGENCY = 3;
	public static final int TYP_INVALID_ROLE = 2;
	public static final int TYP_ROLE_MISSING = 1;
	public static final int TYP_SIGNATURE_MISSING = 0;
	public static final int XML_DEFINTION_NAME_MISSING = 0;
}