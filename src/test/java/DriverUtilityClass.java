import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static io.restassured.RestAssured.given;

public class DriverUtilityClass {
    public WebDriver initializeWebDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            return new EdgeDriver();

        }

        return null;
    }


    public void clickOnAllButtons(){
        WebDriver driver = new ChromeDriver();
       List<WebElement> button =  driver.findElements(By.tagName("button"));
       for(WebElement b : button){
           b.click();
       }
    }

    public void parameters(){
        given().pathParam("id",5)
                .queryParam("page", 2)
                .when().get("/users/{id}")
                .then().statusCode(200);
    }
}
