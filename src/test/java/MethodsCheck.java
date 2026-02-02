
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.JsonPath;

public class MethodsCheck {
    public String userId;
    public static String response = "{\"accounting\":[{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":23},{\"firstName\":\"Mary\",\"lastName\":\"Smith\",\"age\":32}],\"sales\":[{\"firstName\":\"Sally\",\"lastName\":\"Green\",\"age\":27},{\"firstName\":\"Jim\",\"lastName\":\"Galley\",\"age\":41}]}";


    public void getMethod() {
        Response response = given().baseUri("").header("Authorization", "Bearer ")
                .contentType(ContentType.JSON)
                .when().get("")
                .then().statusCode(200).extract().response();
        userId = response.jsonPath().get("id");
    }

    public void sendPostRequest() {
        given().baseUri("")
                .when().post("/users/" + userId)
                .then().statusCode(204);
    }


    public static void main(String[] args) {

        JsonPath jsonPath = new JsonPath(response);
       // String firstName = jsonPath.getString("accounting[0].firstName");
       // System.out.println(firstName);
        int size = jsonPath.getInt("accounting.size()");
        System.out.println(size);
        for(int i=0;i<size;i++){
            String firstName = jsonPath.getString("accounting["+i+"].firstName");
            int age = jsonPath.getInt("accounting["+i+"].age");
            if(firstName.equalsIgnoreCase("John") && age == 23){
                System.out.println(jsonPath.getString("accounting["+i+"].firstName"));
                System.out.println(jsonPath.getString("accounting["+i+"].lastName"));
                System.out.println(jsonPath.getInt("accounting["+i+"].age"));
            }
            if( age < 30){
                System.out.println(jsonPath.getString("accounting["+i+"].firstName"));
                System.out.println(jsonPath.getString("accounting["+i+"].lastName"));
                System.out.println(jsonPath.getInt("accounting["+i+"].age"));
            }
        }

        /*
        1. name is john age should be 23
2. users who has age below 30.

         */
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValues()




        // Read values
    }
}
