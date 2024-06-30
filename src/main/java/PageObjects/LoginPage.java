package PageObjects;

import testframe.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        System.out.println("exists method is called");
        this.exists();

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

    public void exists() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement element = driver.findElement(By.xpath("//iframe[@class='tm-auth-service-login-iframe__iframe ng-star-inserted']"));
        driver.switchTo().frame(element);

    }

}
