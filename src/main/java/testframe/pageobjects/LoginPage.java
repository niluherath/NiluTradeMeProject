package testframe.pageobjects;

import testframe.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testframe.utils.WaitUtility;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WaitUtility waitUtility;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitUtility = new WaitUtility();
        waitUtility.waitForIFrameToLoad(driver);

    }

    By userName = By.xpath("//input[@name='Email']");

    By password = By.xpath("//input[@name='Password']");

    By loginBtn = By.xpath("//button[@value='login']");


    public void enterUsername() {
        driver.findElement(userName).sendKeys(ConfigLoader.getInstance().getUserName());
    }

    public void enterPassword() {
        driver.findElement(password).sendKeys(ConfigLoader.getInstance().getPassWord());
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }



}
