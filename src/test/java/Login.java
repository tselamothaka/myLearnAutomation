import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.sql.Driver;

public class Login {
    WebDriver driver;
    Select select;
    @BeforeTest
    public void launcBrower() throws InterruptedException {
       driver = new ChromeDriver();

    }
    @Test
    public void startBrowser() throws InterruptedException {
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @Test(priority = 1)
    public void verifyHomePageisDisplayed() throws InterruptedException {
    driver.findElements(By.id("//*[@id=\"overview-hero\"]/h2"));
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void clickLearningMatarial() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='nav-btn-practice']")).click();



    }
    @Test(priority = 3)
    public void enterEmail()
    {
        driver.findElements(By.xpath("//*[@id=\"login-email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("tselamothaka@gmail.com");

    }
    @Test(priority = 4)
    public void enterPasswor()
    {
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("%$*RPc712");
    }
    @Test(priority = 5)
    public void clickOnLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void welcomeBack()
    {
        driver.findElement(By.xpath("//*[@id=\"practice-heading\"]"));

    }
    @Test(priority = 7)
    public void clickWebAtomationBasicForm()
    {
        driver.findElement(By.id("tab-btn-password")).click();
    }@Test(priority = 8)
    public void captureFullName()
    {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Pius");
    }
    @Test(priority = 9)
    public void emailAddress()
    {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tselamothaka@gmail.com");
    }
    @Test(priority = 10)
    public void captureAge() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("52");
        Thread.sleep(1000);
    }
    @Test(priority = 11)
    public void selectGender()
    {
        WebElement genderDropdown = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        select = new Select(genderDropdown);
        select.selectByVisibleText("Male");

    }
    public void selectCountry()
    {}
    public void selectExperienceLevel()
    {}
    public void selectSkill()
    {}
    public void captureAdditionalComments()
    {}
    public void clickAcceptTermsAndConditions()
    {}
    public void clickSubmitForm()
    {}
}
