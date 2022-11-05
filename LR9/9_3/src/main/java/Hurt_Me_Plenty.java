import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hurt_Me_Plenty {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        driver.findElement((By.xpath("//div[@class='devsite-search-container']"))).click();
        WebElement Search = driver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']"));
        Search.click();
        Search.sendKeys("Google Cloud Pricing Calculator");
        Search.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//b[text()='Google Cloud Pricing Calculator']/parent::a")).click();
        Thread.sleep(10000);
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

    }
}
