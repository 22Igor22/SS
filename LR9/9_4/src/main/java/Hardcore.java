import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Hardcore {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://yopmail.com/en");
        driver.findElement(By.xpath("//a[@href='email-generator']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='cprnd']")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://cloud.google.com/products/calculator");
        WebElement element = driver.findElement(By.xpath("//iframe[contains(@name,'goog_')]"));
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        WebElement numberOfInstancesField = driver.findElement(  By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']"));
        numberOfInstancesField.sendKeys("4");
        Thread.sleep(2000);
        WebElement Series= driver.findElement(By.xpath("//*[@id=\"select_value_label_85\"]"));
        Series.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-option[@id='select_option_201']")).click();
        Thread.sleep(2000);
        WebElement Machine_Family= driver.findElement(By.xpath("//*[@id=\"select_value_label_86\"]"));
        Machine_Family.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-checkbox[@aria-label='Add GPUs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-select[@placeholder='GPU type']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_474']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-select[@placeholder='Number of GPUs']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_477']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//md-select[@placeholder='Local SSD']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_450']")).click();
        driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_128']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Email']")).click();
        driver.findElement(By.xpath("//input[@type='email']"))
                .sendKeys(Keys.CONTROL+ "v");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Send Email']")).click();
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/button[2]/span")).click();

    }
}