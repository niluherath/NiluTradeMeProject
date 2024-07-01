package testframe.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;


public class WaitUtility {

    public void waitForPageToLoad(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitForIFrameToLoad(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element = driver.findElement(By.xpath("//iframe[@class='tm-auth-service-login-iframe__iframe ng-star-inserted']"));
        driver.switchTo().frame(element);
    }
}
