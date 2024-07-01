package testframe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testframe.utils.ConfigLoader;
import testframe.utils.WaitUtil;

public class HomePage {

    private WebDriver driver;
    private WaitUtil waitUtility;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitUtility = new WaitUtil();
        waitUtility.waitForPageToLoad(driver, motorsTab);

    }

    By userName = By.xpath("//input[@name='Email']");

    By password = By.xpath("//input[@name='Password']");

    By loginBtn = By.xpath("//button[@value='login']");

    By motorsTab = By.xpath("//li[@class='tm-homepage-search-header__vertical-links-list-item'][3]");


    public String getTitle() {
        return driver.getTitle();
    }

    public void enterPassword() {
        driver.findElement(password).sendKeys(ConfigLoader.getInstance().getPassWord());
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }



}
