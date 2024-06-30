package testframe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testframe.utils.WaitUtility;
import org.openqa.selenium.support.ui.Select;

public class CarsForSalePage {

    private WebDriver driver;
    private WaitUtility waitUtility;

    public CarsForSalePage(WebDriver driver) {
        this.driver=driver;
        waitUtility = new WaitUtility();
        waitUtility.waitForPageToLoad(driver, carsForSaleText);
    }
    By carsForSaleText = By.xpath("//h1[contains(text(), 'Cars for sale NZ')]");
    By viewListings = By.xpath("//button[@type='submit']");

    By searchResults = By.xpath("//h3[@class='tm-search-header-result-count__heading ng-star-inserted']");

    public void selectCar(String carMake){
        Select selectedMake = new Select(driver.findElement(By.name("selectedMake")));
        selectedMake.selectByValue(carMake);

    }

    public void clickViewListings(){
        driver.findElement(viewListings).click();
    }

    public String getSearchResults(){
        return driver.findElement(searchResults).getText();
    }








}
