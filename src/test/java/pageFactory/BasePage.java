package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected static WebDriverWait wait;
    protected Actions actions;
    public BasePage (WebDriver givenDriver){
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
    public static void click(WebElement locator){wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static WebElement findElement(WebElement locator){
        return wait.until(ExpectedConditions.visibilityOf(locator));
    }
    public void contextClick(WebElement locator){
        actions.contextClick(findElement(locator)).perform();
    }
    public void doubleClick(WebElement locator){
        actions.doubleClick(findElement(locator)).perform();
    }
}


