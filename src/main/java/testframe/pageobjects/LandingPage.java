package testframe.pageobjects;
import testframe.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    private WebDriver driver;
    private WaitUtil waitUtility;

    public LandingPage(WebDriver driver) {
        this.driver=driver;
        waitUtility = new WaitUtil();
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
