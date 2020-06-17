package support;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends  Web{

    protected WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
    }


    public <T> T selectComboBoxById(String value, String id, T type){
        if (value != null) {
            WebElement chooseOption = driver.findElement(By.id(id));
            new Select(chooseOption).selectByVisibleText(value);
        }
        return type;
    }

    public <T> T clickButtonByXpath(String xpath, T type){
        driver.findElement(By.xpath(xpath)).click();
        return type;
    }

    public void clickButtonByID(String id){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id(id)).click();
    }

    public void clickButtonByLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


    public void typeFieldById(String value, String id) {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void clickCombobox(String id){
        driver.findElement(By.id(id)).click();
    }

    public void selectComboBoxItem(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void getAlertMessage(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

    }


}

