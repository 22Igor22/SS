package com.bay.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoesPage extends AbstractPage
{
    private final String BASE_URL = "https://www.nike.com/w/mens-shoes-nik1zy7ok";
    private final Logger logger = LogManager.getRootLogger();

    public ShoesPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShoesPage openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();
        logger.info("open success");
        return this;
    }

    public ProductPage chooseTheFirstPair(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='product-card__img-link-overlay']")));
        driver.findElement(By.xpath("//a[@data-testid='product-card__img-link-overlay']")).click();
        logger.info("choose pair success");
        return new ProductPage(driver);
    }
    public ShoesPage chooseSort(){
        driver.findElement(By.xpath("//button[@id='dropdown-btn']")).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='newest']")));
        driver.findElement(By.xpath("//button[@value='newest']")).click();
        logger.info("choose sort success");
        return this;
    }

    public ShoesPage chooseFilter(){
        driver.findElement(By.xpath("//a[@aria-label='Category for Lifestyle']")).click();
        logger.info("choose filter success");
        return this;
    }
}