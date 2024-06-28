package PageObjects;
import Utils.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    WaitUtility waitUtility;

    public LandingPage(WebDriver driver) {
        this.driver=driver;
        this.exists();
    }
    By LoginBtn = By.xpath("//a[contains(text(), 'Log in')]");

    //Method to click login button
    public void clickLogin() {
        driver.findElement(LoginBtn).click();
    }

    public boolean exists(){
        waitUtility = new WaitUtility();
        boolean  hasPage = waitUtility.dynamicExists(LoginBtn, "Buy & Sell on NZ's #1 Auction & Classifieds Site | Trade Me");
        return hasPage;
    }

}
