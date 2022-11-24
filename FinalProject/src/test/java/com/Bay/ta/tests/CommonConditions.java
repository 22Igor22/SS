package com.Bay.ta.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {

    protected WebDriver driver;
    private static final String RESOURCES_PATH = "src\\test\\resources\\";

    @BeforeMethod()
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        driver.quit();
    }
}
