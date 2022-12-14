package com.bay.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindAStore extends AbstractPage
{
    private final String BASE_URL = "https://www.nike.com/retail";

    public FindAStore(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public FindAStore openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();
        return this;
    }

    public FindAStore findAStore()
    {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brest");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        return this;
    }
}
