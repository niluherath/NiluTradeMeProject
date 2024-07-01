package testframe.pageobjects;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testframe.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testframe.utils.WaitUtil;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WaitUtil waitUtility;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitUtility = new WaitUtil();
        waitUtility.waitForIFrameToLoad(driver);
    }

    By userName = By.xpath("//input[@name='Email']");

    By password = By.xpath("//input[@name='Password']");

    By loginBtn = By.xpath("//button[@value='login']");


    public void enterUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys(ConfigLoader.getInstance().getUserName());
    }

    public void enterPassword() {
        driver.findElement(password).sendKeys(ConfigLoader.getInstance().getPassWord());
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

}
