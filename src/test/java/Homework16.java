import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class Homework16 {

 @Test
public static void registrationNavigation(){

     // open Chrome Browser
     WebDriver driver = new ChromeDriver();
     //wait 10 seconds for an element to load before failing a test
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //navigate, opens a URL
     String url = "https://bbb.testpro.io/";
     driver.get(url);
     //click to Registration link
     WebElement registrationLink = driver.findElement(By.cssSelector("#hel"));
     registrationLink.click();
     //Assert Registration page is Displayed
     WebElement registrationPage = driver.findElement(By.xpath(("//div[@class='login-wrapper']")));
     Assert.assertTrue(registrationPage.isDisplayed());
     //close the browser
     driver.quit();

 }


}
