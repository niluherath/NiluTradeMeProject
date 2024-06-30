package testframe.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;


public class WaitUtility {
    private static WebDriver driver;

    public WaitUtility(){

    }


    public void waitUntilElementToBeClickable(By element) {

        WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementToBeVisible(By element) {

        WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void waitUntilElementsToBeVisible(By element) {

        List<WebElement> webElements = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }

    public static boolean waitForElementsToLoadAndValidatePage(By element, String title) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
            return driver.getTitle().contains(title);
        } catch (Exception var) {
            return false;
        }
    }


    public void waitForElementToLoadAndValidatePage(By element) {


    }

    public void waitForPageToLoad(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    public void waitForIFrameToLoad(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//iframe[@class='tm-auth-service-login-iframe__iframe ng-star-inserted']"));
        driver.switchTo().frame(element);


    }



}
