package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinHomePagePF {

    private static final String HOMEPAGE_URL = "https://pastebin.com";
    private WebDriver driver;
    private String pasteName;

    @FindBy(xpath = "//*[@id='postform-text']")
    private WebElement textAreaInput;
    @FindBy(xpath = "//*[@id='select2-postform-expiration-container']")
    private WebElement pasteExpirationInput;
    @FindBy(xpath = "//*[@id='select2-postform-format-container']")
    private WebElement formatInput;
    @FindBy(xpath = "//*[@id='postform-name']")
    private WebElement pasteNameInput;
    @FindBy(xpath = "//*[@class='btn -big']")
    private WebElement btnConfirm;

    public PastebinHomePagePF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PastebinHomePagePF openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public boolean createPastebin(String textArea, String pasteName){
        textAreaInput.sendKeys(textArea);
        pasteExpirationInput.click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        pasteNameInput.sendKeys(pasteName);
        btnConfirm.click();
        return true;
    }

    public boolean createPastebinWithFormat(String textArea, String pasteName){
        this.pasteName = pasteName;
        textAreaInput.sendKeys(textArea);
        formatInput.click();
        driver.findElement(By.xpath("//li[text()='Bash']")).click();
        pasteExpirationInput.click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        pasteNameInput.sendKeys(pasteName);
        btnConfirm.click();
        return true;
    }

    public boolean verifyContentPaste(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//h1[text()='how to gain dominance among developers']")).equals("how to gain dominance among developers");
    }
}
