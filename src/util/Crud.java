package util;

import org.json.JSONObject;

public class Crud {
    public void retrieveJson() {
        String jsonString = "{\"name\":\"John\", \"age\":30}";
        JSONObject jsonObject = new JSONObject(jsonString);

    }

}
