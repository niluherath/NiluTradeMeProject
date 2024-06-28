package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;


public class WaitUtility {
    WebDriver driver;

    public void waitUntilElementToBeClickable(By element){

        WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementToBeVisible(By element){

        WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void waitUntilElementsToBeVisible(By element){

        List<WebElement> webElements = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }

    public boolean dynamicExists(By element, String title){
        try{
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
            return driver.getTitle().contains(title);
        }
        catch(Exception var){
            return false;
        }
    }
}
