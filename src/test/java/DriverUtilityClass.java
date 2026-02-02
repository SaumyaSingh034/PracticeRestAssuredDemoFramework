import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverUtilityClass {
    public WebDriver initializeWebDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            return new EdgeDriver();

        }

        return null;
    }
}
