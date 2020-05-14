package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    //instatiate driver
    private WebDriver driver;

    //locator to locate the element
    private By formAuthenticationLink =  By.linkText("Form Authentication");

    //constructor to pass driver
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    //method for click action
    public LoginPage ( ) {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
}




}