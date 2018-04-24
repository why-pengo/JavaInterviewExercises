package whypengo;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;

/**
 * JSON Simple exercise
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("main: calling readJSON()" + readJSON() );
    }

    public static boolean writeJSON() {
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
            return false;
        }

        System.out.println("writeJSON: jsonObject" + jsonObject);

        return true;
    }

    public static boolean readJSON() {
        String rawJSON = null;
        try {
            rawJSON = getJSON();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("readJSON: rawJSON = " + rawJSON);
        //{
        //  "name": "Millennium Falcon",
        //  "model": "YT-1300 light freighter",
        //  "manufacturer": "Corellian Engineering Corporation",
        //  "cost_in_credits": "100000",
        //  "length": "34.37",
        //  "max_atmosphering_speed": "1050",
        //  "crew": "4",
        //  "passengers": "6",
        //  "cargo_capacity": "100000",
        //  "consumables": "2 months",
        //  "hyperdrive_rating": "0.5",
        //  "MGLT": "75",
        //  "starship_class": "Light freighter",
        //  "pilots": [
        //    "https://swapi.co/api/people/13/",
        //    "https://swapi.co/api/people/14/",
        //    "https://swapi.co/api/people/25/",
        //    "https://swapi.co/api/people/31/"
        //  ],
        //  "films": [
        //    "https://swapi.co/api/films/2/",
        //    "https://swapi.co/api/films/7/",
        //    "https://swapi.co/api/films/3/",
        //    "https://swapi.co/api/films/1/"
        //  ],
        //  "created": "2014-12-10T16:59:45.094000Z",
        //  "edited": "2014-12-22T17:35:44.464156Z",
        //  "url": "https://swapi.co/api/starships/10/"
        //}

        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(rawJSON);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println("readJSON: jsonObject = " +  jsonObject);
        String name = (String) jsonObject.get("name");
        System.out.println("readJSON: name = " + name);

        return true;
    }

    private static String getJSON() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://swapi.co/api/starships/10/");
        CloseableHttpResponse response = null;
        String content = null;

        try {
            response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity);
            }
        } finally {
            response.close();
        }

        return content;
    }
}
