package com.bay.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractPage
{
    private final String BASE_URL = "https://www.nike.com/men";

    public SearchPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SearchPage openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();
        return this;
    }

    public ShoesPage openShoesPage()
    {
        driver.findElement(By.xpath("//a[@aria-label='Shoes']")).click();
        return new ShoesPage(driver);
    }
}