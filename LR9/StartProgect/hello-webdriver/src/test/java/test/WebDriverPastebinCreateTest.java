package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.PastebinHomePagePF;

public class WebDriverPastebinCreateTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();
    }

    @Test(description = "Test creating pastbin")
    public void createPastebin(){
        Assert.assertTrue(new PastebinHomePagePF(driver)
                .openPage()
                .createPastebin("Hello from WebDriver"
                        , "helloweb"));
    }

    @AfterMethod(alwaysRun = true)
    public void browserShutdown(){
        driver.quit();
    }
}
