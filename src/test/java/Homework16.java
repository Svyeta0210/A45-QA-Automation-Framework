import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class Homework16 extends BaseTest{

     @Test
     public static void registrationNavigation() throws InterruptedException {

          //      Added ChromeOptions argument below to fix websocket error
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--remote-allow-origins=*");


          // open Chrome Browser
          WebDriver driver = new ChromeDriver(options);
          //wait 10 seconds for an element to load before failing a test
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          //navigate, opens a URL
          String url = "https://bbb.testpro.io/";
          driver.get(url);
          //click to Registration link
          WebElement registrationLink = driver.findElement(By.cssSelector("a[id='hel']"));
          registrationLink.click();
          //Assert Registration page is Displayed
          String registrationUrl = "https://bbb.testpro.io/registration.php";
          Assert.assertEquals(driver.getCurrentUrl(), registrationUrl);

          WebElement registrationPage = driver.findElement(By.cssSelector("div[class='login-wrapper']"));
          Assert.assertTrue(registrationPage.isDisplayed());
          Thread.sleep(3000);
          //close the browser
          driver.quit();

 }


}
