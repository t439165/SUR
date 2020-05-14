//create new package
package base;

//import drivers
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

//Create new class
public class BaseTests {

    //create new Webdriver object
    private WebDriver driver;
    protected HomePage homePage;
    //create new method for the class
    public void setUp() {

        //calling the driver exe
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        //creating new instance of webdriver
        driver=new ChromeDriver();

        //instantiate the class home page
        homePage =new HomePage(driver);

        //"Using methods of the webdriver instance to open the browser
        driver.get("https://the-internet.herokuapp.com/");



        //fullscreen window
        /*driver.manage().window().fullscreen();

        //setting size of window screen
        driver.manage().window().setSize(new Dimension( 20, 40));

        //maximize the window
        driver.manage().window().maximize();

        //printing window title
        System.out.println(driver.getTitle());

        // Webelements to find elements in page.can  be singular or plural

        //finding element "Inputs" in the browser .So create variable of webelement and call webdriver instance to
        // use findelement singular method to find the element using the method linktext.Then take action on
        // that element

        //WebElement inputlink = driver.findElement( By.linkText("Inputs"));
        //inputlink.click();

        // use findelement plural  method so create List element to store all list found and prnt the total
        //List<WebElement> totallinks =driver.findElements(By.tagName("a"));
        //System.out.println(totallinks.size());


        WebElement shiftlink = driver.findElement(By.linkText("Shifting Content"));
        shiftlink.click();
        WebElement menu1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu1.click();
        List<WebElement> menuitemlinks =driver.findElements(By.tagName("li"));
        System.out.println(menuitemlinks.size());*/


        driver.quit();
            }//end of BaseTests class

    public static void main(String args[]){

        //Create new instance of BaseTest class
        BaseTests test = new BaseTests();

        //call the method set up
        test.setUp();
    }
}
