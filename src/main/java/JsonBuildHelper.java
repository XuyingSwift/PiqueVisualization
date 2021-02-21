import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonBuildHelper {
    public static ObjectNode buildFunctionalSyntax(JsonNode file) {
        ObjectNode functionalSyntax = NodeHelper.getFunctionalSyntaxValue(file);
        ObjectNode functionalSyntaxMeasure = NodeHelper.getFunctionalSyntaxMeasure(file);
        ObjectNode functionalSyntaxDiagnostics = NodeHelper.getFunctionalSyntaxDiagnostics(file);

        functionalSyntaxMeasure.put(NodeHelper.DIAGNOSTICS, functionalSyntaxDiagnostics);
        functionalSyntax.put(NodeHelper.MEASURE, functionalSyntaxMeasure);

        return functionalSyntax;
    }

    public static ObjectNode buildFormat(JsonNode file) {
        ObjectNode format = NodeHelper.getFormatValue(file);
        ObjectNode formatMeasure = NodeHelper.getFormatMeasure(file);
        ObjectNode formatDiagnostics = NodeHelper.getFormatDiagnostics(file);

        formatMeasure.put(NodeHelper.DIAGNOSTICS, formatDiagnostics);
        format.put(NodeHelper.MEASURE, formatMeasure);

        return format;
    }

    public static ObjectNode buildResourceHandling(JsonNode file) {
        ObjectNode resourceHandling = NodeHelper.getResourceHandling(file);
        ObjectNode resourceHandlingMeasure = NodeHelper.getResourceHandlingMeasure(file);
        ObjectNode resourceHandlingDiagnostics = NodeHelper.getResourceHandlingDiagnostics(file);

        resourceHandlingMeasure.put(NodeHelper.DIAGNOSTICS, resourceHandlingDiagnostics);
        resourceHandling.put(NodeHelper.MEASURE, resourceHandlingMeasure);

        return resourceHandling;
    }

    public static ObjectNode buildDataTypeIntegrity(JsonNode file) {
        ObjectNode dataTypeIntegrity = NodeHelper.getDataTypeIntegrity(file);
        ObjectNode dataTypeIntegrityMeasure = NodeHelper.getDataTypeIntegrityMeasure(file);
        ObjectNode dataTypeIntegrityDiagnostics = NodeHelper.getDataTypeIntegrityDiagnostics(file);

        dataTypeIntegrityMeasure.put(NodeHelper.DIAGNOSTICS, dataTypeIntegrityDiagnostics);
        dataTypeIntegrity.put(NodeHelper.MEASURE, dataTypeIntegrityMeasure);

        return dataTypeIntegrity;
    }

    public static ObjectNode buildDocumentation(JsonNode file) {
        ObjectNode documentation = NodeHelper.getDocumentation(file);
        ObjectNode documentationMeasure = NodeHelper.getDocumentationMeasure(file);
        ObjectNode documentationDiagnostics = NodeHelper.getDocumentationDiagnostics(file);

        documentationMeasure.put(NodeHelper.DIAGNOSTICS, documentationDiagnostics);
        documentation.put(NodeHelper.MEASURE, documentationMeasure);

        return documentation;
    }

    public static ObjectNode buildExceptionHandling(JsonNode file) {
        ObjectNode exceptionHandling = NodeHelper.getExceptionHandling(file);
        ObjectNode exceptionHandlingMeasure = NodeHelper.getExceptionHandlingMeasure(file);
        ObjectNode exceptionHandlingDiagnostics = NodeHelper.getExceptionHandlingDiagnostics(file);
        exceptionHandlingMeasure.put(NodeHelper.DIAGNOSTICS, exceptionHandlingDiagnostics);
        exceptionHandling.put(NodeHelper.MEASURE, exceptionHandlingMeasure);

        return exceptionHandling;
    }

    public static ObjectNode buildEncryption(JsonNode file) {
        ObjectNode encryption = NodeHelper.getEncryption(file);
        ObjectNode encryptionMeasure = NodeHelper.getEncryptionMeasure(file);
        ObjectNode encryptionDiagnostics = NodeHelper.getEncryptionDiagnostics(file);
        encryptionMeasure.put(NodeHelper.DIAGNOSTICS, encryptionDiagnostics);
        encryption.put(NodeHelper.MEASURE, encryptionMeasure);

        return encryption;
    }

    public static ObjectNode buildInputOutputHandling(JsonNode file) {
        ObjectNode inputOutputHandling = NodeHelper.getInputOutputHandling(file);
        ObjectNode inputOutputHandlingMeasure = NodeHelper.getInputOutputHandlingMeasure(file);
        ObjectNode inputOutputHandlingDiagnostics = NodeHelper.getInputOutputHandlingDiagnostics(file);
        inputOutputHandlingMeasure.put(NodeHelper.DIAGNOSTICS, inputOutputHandlingDiagnostics);
        inputOutputHandling.put(NodeHelper.MEASURE, inputOutputHandlingMeasure);

        return inputOutputHandling;
    }

    public static ObjectNode buildStructure(JsonNode file) {
        ObjectNode structure = NodeHelper.getStructure(file);
        ObjectNode structureMeasure = NodeHelper.getStructureMeasure(file);
        ObjectNode structureDiagnostics = NodeHelper.getStructureDiagnostics(file);
        structureMeasure.put(NodeHelper.DIAGNOSTICS, structureDiagnostics);
        structure.put(NodeHelper.MEASURE, structureMeasure);

        return structure;
    }

    public static ObjectNode buildFunctionalSemantics(JsonNode file) {
        ObjectNode functionalSemantics = NodeHelper.getFunctionalSemantics(file);
        ObjectNode functionalSemanticsMeasure = NodeHelper.getFunctionalSemanticsMeasure(file);
        ObjectNode functionalSemanticsDiagnostics = NodeHelper.getFunctionalSemanticsDiagnostics(file);
        functionalSemanticsMeasure.put(NodeHelper.DIAGNOSTICS, functionalSemanticsDiagnostics);
        functionalSemantics.put(NodeHelper.MEASURE, functionalSemanticsMeasure);

        return functionalSemantics;
    }
}
