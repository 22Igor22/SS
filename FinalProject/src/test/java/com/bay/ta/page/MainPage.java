package com.bay.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage
{
    private final String BASE_URL = "https://www.nike.com";

    public MainPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public MainPage openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();
        return this;
    }

    public SearchPage openSearchPage()
    {
        driver.findElement(By.xpath("//a[@data-path='men']")).click();
        return new SearchPage(driver);
    }
}
