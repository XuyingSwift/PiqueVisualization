import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HistoryDataParser {
    private static final String VALUE = "value";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode file1 = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\Vi-project\\src\\main\\resources\\qualityModel_ISO25010CSharpQualityModel.json"));
        JsonNode file2 = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\PiqueVisualization\\src\\main\\resources\\qualityModel_fake2.json"));
        JsonNode file3 = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\PiqueVisualization\\src\\main\\resources\\qualityModel_fake3.json"));
        JsonNode file4 = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\PiqueVisualization\\src\\main\\resources\\qualityModel_fake4.json"));
        JsonNode file5 = mapper.readTree(new File("C:\\Users\\xuyin\\IdeaProjects\\PiqueVisualization\\src\\main\\resources\\qualityModel_fake5.json"));

        ObjectNode root = mapper.createObjectNode();
        ObjectNode security1 = NodeHelper.getSecurity(file1, mapper);
        ObjectNode security2 = NodeHelper.getSecurity(file2, mapper);
        ObjectNode security3 = NodeHelper.getSecurity(file3, mapper);
        ObjectNode security4 = NodeHelper.getSecurity(file4, mapper);
        ObjectNode security5 = NodeHelper.getSecurity(file5, mapper);

        root.put("date", "value");
        root.put("2015", security1.get(VALUE));
        root.put("2016", security2.get(VALUE));
        root.put("2017", security3.get(VALUE));
        root.put("2018", security4.get(VALUE));
        root.put("2019", security5.get(VALUE));

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);

        try{
            FileWriter writer = new FileWriter("historyData.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
