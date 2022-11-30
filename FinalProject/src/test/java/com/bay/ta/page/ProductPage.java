package com.bay.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends AbstractPage
{
    private final String BASE_URL = "https://www.nike.com";
    private final Logger logger = LogManager.getRootLogger();

    public ProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ProductPage openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();
        return this;
    }

    public ProductPage addToBag(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"css-xf3ahq\"]")));
        driver.findElement(By.xpath("//*[@class=\"css-xf3ahq\"]")).click();
        logger.info("Successful sizing");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,700)", "");
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Add to Bag']")));
        driver.findElement(By.xpath("//button[@aria-label='Add to Bag']")).click();
        logger.info("Element add success");
        return this;
    }
}