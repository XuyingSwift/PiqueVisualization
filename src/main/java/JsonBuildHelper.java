import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonBuildHelper {
    public static ObjectNode buildFunctionalSyntax(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode functionalSyntax = NodeHelper.getFunctionalSyntaxValue(file, objectMapper);
        ObjectNode functionalSyntaxMeasure = NodeHelper.getFunctionalSyntaxMeasure(file, objectMapper);
        ObjectNode functionalSyntaxDiagnostics = NodeHelper.getFunctionalSyntaxDiagnostics(file, objectMapper);

        functionalSyntaxMeasure.put(NodeHelper.DIAGNOSTICS, functionalSyntaxDiagnostics);
        functionalSyntax.put(NodeHelper.MEASURE, functionalSyntaxMeasure);

        return functionalSyntax;
    }

    public static ObjectNode buildFormat(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode format = NodeHelper.getFormatValue(file, objectMapper);
        ObjectNode formatMeasure = NodeHelper.getFormatMeasure(file, objectMapper);
        ObjectNode formatDiagnostics = NodeHelper.getFormatDiagnostics(file, objectMapper);

        formatMeasure.put(NodeHelper.DIAGNOSTICS, formatDiagnostics);
        format.put(NodeHelper.MEASURE, formatMeasure);

        return format;
    }

    public static ObjectNode buildResourceHandling(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode resourceHandling = NodeHelper.getResourceHandling(file, objectMapper);
        ObjectNode resourceHandlingMeasure = NodeHelper.getResourceHandlingMeasure(file, objectMapper);
        ObjectNode resourceHandlingDiagnostics = NodeHelper.getResourceHandlingDiagnostics(file, objectMapper);

        resourceHandlingMeasure.put(NodeHelper.DIAGNOSTICS, resourceHandlingDiagnostics);
        resourceHandling.put(NodeHelper.MEASURE, resourceHandlingMeasure);

        return resourceHandling;
    }

    public static ObjectNode buildDataTypeIntegrity(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode dataTypeIntegrity = NodeHelper.getDataTypeIntegrity(file, objectMapper);
        ObjectNode dataTypeIntegrityMeasure = NodeHelper.getDataTypeIntegrityMeasure(file, objectMapper);
        ObjectNode dataTypeIntegrityDiagnostics = NodeHelper.getDataTypeIntegrityDiagnostics(file, objectMapper);

        dataTypeIntegrityMeasure.put(NodeHelper.DIAGNOSTICS, dataTypeIntegrityDiagnostics);
        dataTypeIntegrity.put(NodeHelper.MEASURE, dataTypeIntegrityMeasure);

        return dataTypeIntegrity;
    }

    public static ObjectNode buildDocumentation(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode documentation = NodeHelper.getDocumentation(file, objectMapper);
        ObjectNode documentationMeasure = NodeHelper.getDocumentationMeasure(file, objectMapper);
        ObjectNode documentationDiagnostics = NodeHelper.getDocumentationDiagnostics(file, objectMapper);

        documentationMeasure.put(NodeHelper.DIAGNOSTICS, documentationDiagnostics);
        documentation.put(NodeHelper.MEASURE, documentationMeasure);

        return documentation;
    }

    public static ObjectNode buildExceptionHandling(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode exceptionHandling = NodeHelper.getExceptionHandling(file, objectMapper);
        ObjectNode exceptionHandlingMeasure = NodeHelper.getExceptionHandlingMeasure(file, objectMapper);
        ObjectNode exceptionHandlingDiagnostics = NodeHelper.getExceptionHandlingDiagnostics(file, objectMapper);
        exceptionHandlingMeasure.put(NodeHelper.DIAGNOSTICS, exceptionHandlingDiagnostics);
        exceptionHandling.put(NodeHelper.MEASURE, exceptionHandlingMeasure);

        return exceptionHandling;
    }

    public static ObjectNode buildEncryption(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode encryption = NodeHelper.getEncryption(file, objectMapper);
        ObjectNode encryptionMeasure = NodeHelper.getEncryptionMeasure(file, objectMapper);
        ObjectNode encryptionDiagnostics = NodeHelper.getEncryptionDiagnostics(file, objectMapper);
        encryptionMeasure.put(NodeHelper.DIAGNOSTICS, encryptionDiagnostics);
        encryption.put(NodeHelper.MEASURE, encryptionMeasure);

        return encryption;
    }

    public static ObjectNode buildInputOutputHandling(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode inputOutputHandling = NodeHelper.getInputOutputHandling(file, objectMapper);
        ObjectNode inputOutputHandlingMeasure = NodeHelper.getInputOutputHandlingMeasure(file, objectMapper);
        ObjectNode inputOutputHandlingDiagnostics = NodeHelper.getInputOutputHandlingDiagnostics(file, objectMapper);
        inputOutputHandlingMeasure.put(NodeHelper.DIAGNOSTICS, inputOutputHandlingDiagnostics);
        inputOutputHandling.put(NodeHelper.MEASURE, inputOutputHandlingMeasure);

        return inputOutputHandling;
    }

    public static ObjectNode buildStructure(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode structure = NodeHelper.getStructure(file, objectMapper);
        ObjectNode structureMeasure = NodeHelper.getStructureMeasure(file, objectMapper);
        ObjectNode structureDiagnostics = NodeHelper.getStructureDiagnostics(file, objectMapper);
        structureMeasure.put(NodeHelper.DIAGNOSTICS, structureDiagnostics);
        structure.put(NodeHelper.MEASURE, structureMeasure);

        return structure;
    }

    public static ObjectNode buildFunctionalSemantics(JsonNode file, ObjectMapper objectMapper) {
        ObjectNode functionalSemantics = NodeHelper.getFunctionalSemantics(file, objectMapper);
        ObjectNode functionalSemanticsMeasure = NodeHelper.getFunctionalSemanticsMeasure(file, objectMapper);
        ObjectNode functionalSemanticsDiagnostics = NodeHelper.getFunctionalSemanticsDiagnostics(file, objectMapper);
        functionalSemanticsMeasure.put(NodeHelper.DIAGNOSTICS, functionalSemanticsDiagnostics);
        functionalSemantics.put(NodeHelper.MEASURE, functionalSemanticsMeasure);

        return functionalSemantics;
    }
}
