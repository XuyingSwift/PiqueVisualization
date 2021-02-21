import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class NodeHelper {

    public static final String SECURITY = "Security";
    public static final String TQI = "tqi";
    public static final String WEIGHTS = "weights";
    public static final String FUNCTIONAL_SYNTAX = "Functional Syntax";
    public static final String CHARACTERISTICS = "characteristics";
    public static final String PROPERTIES= "properties";

    public static final String FORMAT = "Format";
    public static final String RESOURCE_HANDLING = "Resource Handling";
    public static final String DATA_TYPE_INTEGRITY = "Data Type Integrity";
    public static final String DOCUMENTATION = "Documentation";
    public static final String EXCEPTION_HANDLING = "Exception Handling";
    public static final String ENCRYPTION = "Encryption";
    public static final String INPUT_OUTPUT_HANDLING = "Input Output Handling";
    public static final String STRUCTURE = "Structure";
    public static final String FUNCTIONAL_SEMANTICS = "Functional Semantics";
    public static final String MEASURE = "measure";
    public static final String DIAGNOSTICS = "diagnostics";
    private static final String POSITIVE = "positive";
    private static final String THRESHOLDS = "thresholds";
    private static final String NAME = "name";
    private static final String VALUE = "value";

    public static ObjectNode getSecurity(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode security = objectMapper.createObjectNode();
        security.put(VALUE, root.path(TQI).path(WEIGHTS).path(SECURITY));
        return security;
    }

    // Functional Syntax
    public static ObjectNode getFunctionalSyntaxValue(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode functionalSyntax = objectMapper.createObjectNode();
        functionalSyntax.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(FUNCTIONAL_SYNTAX));
        functionalSyntax.put(POSITIVE, root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(POSITIVE));
        functionalSyntax.put(THRESHOLDS, root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(THRESHOLDS));
        return functionalSyntax;
    }

    public static ObjectNode getFunctionalSyntaxMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getFunctionalSyntaxDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // get format info
    public static ObjectNode getFormatValue(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode format = objectMapper.createObjectNode();
        format.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(FORMAT));
        format.put(POSITIVE, root.path(PROPERTIES).path(FORMAT).path(POSITIVE));
        format.put(THRESHOLDS, root.path(PROPERTIES).path(FORMAT).path(THRESHOLDS));
        return format;
    }

    public static ObjectNode getFormatMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(FORMAT).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(FORMAT).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getFormatDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(FUNCTIONAL_SYNTAX).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // get Resource Handling
    public static ObjectNode getResourceHandling(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode resourceHandling = objectMapper.createObjectNode();
        resourceHandling.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(RESOURCE_HANDLING));
        resourceHandling.put(POSITIVE, root.path(PROPERTIES).path(RESOURCE_HANDLING).path(POSITIVE));
        resourceHandling.put(THRESHOLDS, root.path(PROPERTIES).path(RESOURCE_HANDLING).path(THRESHOLDS));
        return resourceHandling;
    }

    public static ObjectNode getResourceHandlingMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(RESOURCE_HANDLING).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(RESOURCE_HANDLING).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getResourceHandlingDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(RESOURCE_HANDLING).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // get Data Type Integrity
    public static ObjectNode getDataTypeIntegrity(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode dataTypeIntegrity = objectMapper.createObjectNode();
        dataTypeIntegrity.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(DATA_TYPE_INTEGRITY));
        dataTypeIntegrity.put(POSITIVE, root.path(PROPERTIES).path(DATA_TYPE_INTEGRITY).path(POSITIVE));
        dataTypeIntegrity.put(THRESHOLDS, root.path(PROPERTIES).path(DATA_TYPE_INTEGRITY).path(THRESHOLDS));
        return dataTypeIntegrity;
    }

    public static ObjectNode getDataTypeIntegrityMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(DATA_TYPE_INTEGRITY).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(DATA_TYPE_INTEGRITY).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getDataTypeIntegrityDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(DATA_TYPE_INTEGRITY).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Documentation
    public static ObjectNode getDocumentation(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode documentation = objectMapper.createObjectNode();
        documentation.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(DOCUMENTATION));
        documentation.put(POSITIVE, root.path(PROPERTIES).path(DOCUMENTATION).path(POSITIVE));
        documentation.put(THRESHOLDS, root.path(PROPERTIES).path(DOCUMENTATION).path(THRESHOLDS));
        return documentation;
    }

    public static ObjectNode getDocumentationMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(DOCUMENTATION).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(DOCUMENTATION).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getDocumentationDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(DOCUMENTATION).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Exception Handling
    public static ObjectNode getExceptionHandling(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode documentation = objectMapper.createObjectNode();
        documentation.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(EXCEPTION_HANDLING));
        documentation.put(POSITIVE, root.path(PROPERTIES).path(EXCEPTION_HANDLING).path(POSITIVE));
        documentation.put(THRESHOLDS, root.path(PROPERTIES).path(EXCEPTION_HANDLING).path(THRESHOLDS));
        return documentation;
    }

    public static ObjectNode getExceptionHandlingMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(EXCEPTION_HANDLING).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(EXCEPTION_HANDLING).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getExceptionHandlingDiagnostics(JsonNode root, ObjectMapper objectMapper ) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(EXCEPTION_HANDLING).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Encryption
    public static ObjectNode getEncryption(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode documentation = objectMapper.createObjectNode();
        documentation.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(ENCRYPTION));
        documentation.put(POSITIVE, root.path(PROPERTIES).path(ENCRYPTION).path(POSITIVE));
        documentation.put(THRESHOLDS, root.path(PROPERTIES).path(ENCRYPTION).path(THRESHOLDS));
        return documentation;
    }

    public static ObjectNode getEncryptionMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(ENCRYPTION).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(ENCRYPTION).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getEncryptionDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(ENCRYPTION).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Input Output Handling
    public static ObjectNode getInputOutputHandling(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode documentation = objectMapper.createObjectNode();
        documentation.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(INPUT_OUTPUT_HANDLING));
        documentation.put(POSITIVE, root.path(PROPERTIES).path(INPUT_OUTPUT_HANDLING).path(POSITIVE));
        documentation.put(THRESHOLDS, root.path(PROPERTIES).path(INPUT_OUTPUT_HANDLING).path(THRESHOLDS));
        return documentation;
    }

    public static ObjectNode getInputOutputHandlingMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(INPUT_OUTPUT_HANDLING).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(INPUT_OUTPUT_HANDLING).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getInputOutputHandlingDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(INPUT_OUTPUT_HANDLING).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Structure
    public static ObjectNode getStructure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode documentation = objectMapper.createObjectNode();
        documentation.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(STRUCTURE));
        documentation.put(POSITIVE, root.path(PROPERTIES).path(STRUCTURE).path(POSITIVE));
        documentation.put(THRESHOLDS, root.path(PROPERTIES).path(STRUCTURE).path(THRESHOLDS));
        return documentation;
    }

    public static ObjectNode getStructureMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(STRUCTURE).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(STRUCTURE).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getStructureDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(STRUCTURE).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }

    // Functional Semantics
    public static ObjectNode getFunctionalSemantics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode functionalSemantics = objectMapper.createObjectNode();
        functionalSemantics.put(VALUE, root.path(CHARACTERISTICS).path(SECURITY).path(WEIGHTS).path(FUNCTIONAL_SEMANTICS));
        functionalSemantics.put(POSITIVE, root.path(PROPERTIES).path(FUNCTIONAL_SEMANTICS).path(POSITIVE));
        functionalSemantics.put(THRESHOLDS, root.path(PROPERTIES).path(FUNCTIONAL_SEMANTICS).path(THRESHOLDS));
        return functionalSemantics;
    }

    public static ObjectNode getFunctionalSemanticsMeasure(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode measure = objectMapper.createObjectNode();
        measure.put(NAME,root.path(PROPERTIES).path(FUNCTIONAL_SEMANTICS).path(MEASURE).path(NAME));
        measure.put(VALUE, root.path(PROPERTIES).path(FUNCTIONAL_SEMANTICS).path(MEASURE).path(VALUE));
        return measure;
    }

    public static ObjectNode getFunctionalSemanticsDiagnostics(JsonNode root, ObjectMapper objectMapper) {
        ObjectNode diagnostics = objectMapper.createObjectNode();
        diagnostics.put(DIAGNOSTICS, root.path(PROPERTIES).path(FUNCTIONAL_SEMANTICS).path(MEASURE).path(DIAGNOSTICS));
        return diagnostics;
    }
}
