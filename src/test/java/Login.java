import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Login {
    WebDriver driver;
    @BeforeTest
    public void launcBrower()
    {
       driver = new ChromeDriver();
    }
    @Test
    public void startBrowser() throws InterruptedException {
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

}
