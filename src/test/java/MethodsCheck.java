import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MethodsCheck {

    public void getMethod(){
      Response response =  given().baseUri("").header("Authorization", "Bearer ")
                .contentType(ContentType.JSON)
                .when().get("")
                .then().statusCode(200).extract().response();
    }
}
