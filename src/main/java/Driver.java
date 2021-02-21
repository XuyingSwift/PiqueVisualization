import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode file = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\Vi-project\\src\\main\\resources\\qualityModel_ISO25010CSharpQualityModel.json"));

        ObjectNode root = mapper.createObjectNode();
        ObjectNode security = NodeHelper.getSecurity(file, mapper);

        security.put(NodeHelper.FUNCTIONAL_SYNTAX, JsonBuildHelper.buildFunctionalSyntax(file, mapper));
        security.put(NodeHelper.FORMAT, JsonBuildHelper.buildFormat(file, mapper));
        security.put(NodeHelper.RESOURCE_HANDLING, JsonBuildHelper.buildResourceHandling(file, mapper));
        security.put(NodeHelper.DATA_TYPE_INTEGRITY, JsonBuildHelper.buildDataTypeIntegrity(file, mapper));
        security.put(NodeHelper.DOCUMENTATION, JsonBuildHelper.buildDocumentation(file, mapper));
        security.put(NodeHelper.EXCEPTION_HANDLING, JsonBuildHelper.buildExceptionHandling(file, mapper));
        security.put(NodeHelper.ENCRYPTION, JsonBuildHelper.buildEncryption(file, mapper));
        security.put(NodeHelper.INPUT_OUTPUT_HANDLING, JsonBuildHelper.buildInputOutputHandling(file, mapper));
        security.put(NodeHelper.STRUCTURE, JsonBuildHelper.buildStructure(file, mapper));
        security.put(NodeHelper.FUNCTIONAL_SEMANTICS, JsonBuildHelper.buildFunctionalSemantics(file, mapper));

        root.put(NodeHelper.SECURITY, security);

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);

        try{
            FileWriter writer = new FileWriter("output.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
