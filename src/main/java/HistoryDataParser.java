import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonArray;
import org.json.simple.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoryDataParser {
    private static final String VALUE = "value";
    private static final String DATE = "date";

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

        security1.put(DATE, "1-jan-21");
        security1.put(VALUE, security1.get(VALUE));

        security2.put(DATE, "1-feb-21");
        security2.put(VALUE, security2.get(VALUE));

        security3.put(DATE, "1-mar-21");
        security3.put(VALUE, security3.get(VALUE));

        security4.put(DATE, "1-apr-21");
        security4.put(VALUE, security4.get(VALUE));

        security5.put(DATE, "1-may-21");
        security5.put(VALUE, security5.get(VALUE));

        List<ObjectNode> list = new ArrayList<>();
        list.add(security1);
        list.add(security2);
        list.add(security3);
        list.add(security4);
        list.add(security5);

        String json = JSONArray.toJSONString(list);

        try{
            FileWriter writer = new FileWriter("historyData.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
