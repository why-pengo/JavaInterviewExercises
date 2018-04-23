package whypengo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

/**
 * JSON Simple exercise
 *
 */
public class App {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "why-pengo");
        jsonObject.put("integer", 100);

        JSONArray list = new JSONArray();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");

        jsonObject.put("items", list);

        try (FileWriter file = new FileWriter("test.json")) {
            file.write(jsonObject.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("main: jsonObject" + jsonObject);
    }
}
