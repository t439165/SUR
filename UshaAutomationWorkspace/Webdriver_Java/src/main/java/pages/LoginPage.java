package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    //constructor to pass LoginPage class driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //create fields found in the page
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    //create method to send the user entered username value.no return value as it does not lead to any new page
    public void setUsernameField(String usernameField) {
        driver.findElement(usernameField).sendKeys();
    }

    //create method to send the user entered password value.no return value as it does not lead to any new page
    public void setPasswordField(String passwordField) {
        driver.findElement(passwordField).sendKeys();
    }

    //create method to click

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
