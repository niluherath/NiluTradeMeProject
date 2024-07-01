package testframe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testframe.utils.WaitUtil;

import java.time.Duration;

public class CarsListingPage {

    private WebDriver driver;
    private WaitUtil waitUtility;

    public CarsListingPage(WebDriver driver) {
        this.driver=driver;
    }
    By newCarShowroomLink = By.xpath("//a[contains(text(), 'New Car Showroom')]");

    By searchResults = By.xpath("//h3[@class='tm-search-header-result-count__heading ng-star-inserted']");


    public String getSearchResults(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));
        return driver.findElement(searchResults).getText();
    }






}
