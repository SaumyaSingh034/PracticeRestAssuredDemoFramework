import io.restassured.path.json.JsonPath;

import java.util.List;

public class JsonParsing {
    public static void main(String[] args){
        String response = "{\"employees\":[{\"id\":101,\"name\":\"John\"},{\"id\":102,\"name\":\"David\"}]}";
        JsonPath js = new JsonPath(response);
        List<String> names = js.getList("employees.name");
        System.out.println(names);
        for(String name : names){
            if("John".equalsIgnoreCase(name)){
                System.out.println(name);
            }
        }
        for(Object id: js.getList("employees.id")){
            System.out.println(id);
        }
    }
}
