package testframe.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testframe.utils.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LandingPage {

    private WebDriver driver;
    private WaitUtility waitUtility;

    public LandingPage(WebDriver driver) {
        this.driver=driver;
        waitUtility = new WaitUtility();
        waitUtility.waitForPageToLoad(driver, LoginBtn);
    }
    By LoginBtn = By.xpath("//a[contains(text(), 'Log in')]");

    By motorsTab = By.xpath("//li[@class='tm-homepage-search-header__vertical-links-list-item'][3]");

    //Method to click login button
    public void clickLogin() {
        driver.findElement(LoginBtn).click();
    }
    public void clickMotorsTab() {
        driver.findElement(motorsTab).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }




}
