package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;

    //locator for the text in the secure page
    private By StatusAlert =By.id("flash");

    public void SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }

    //method to get the text using the locator
    public String getAlertText(){
        return driver.findElement(StatusAlert).getText();
    }
}
