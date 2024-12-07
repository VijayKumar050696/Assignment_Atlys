package Utils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseClass {
    public  WebDriver driver;
    public final Logger log = Logger.getLogger(String.valueOf(BaseClass.class));
    @BeforeClass
    public  void setup()
    {
    Reporter.log("=====Browser Session Started=====", true);
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver");
    ChromeOptions option = new ChromeOptions();
    option.setPageLoadStrategy(PageLoadStrategy.NONE);
    driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    }


    @AfterClass
    public void closeApplication()
    {
        driver.close();
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);
    }
}
