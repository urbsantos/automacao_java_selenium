package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.BasePage;

public class AddCustomerPage extends BasePage {

    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }

    public AddCustomerPage typeFirstName(String firstName){
        return typeFieldById(firstName, "field-customerName", this);
    }

    public AddCustomerPage typeLastName(String lastName){
        return typeFieldById(lastName, "field-contactLastName", this);
    }

    public AddCustomerPage typePhone(String phone){
        return typeFieldById(phone, "field-phone", this);
    }

    public AddCustomerPage typeAddressLine1(String addressLine1){
        return typeFieldById(addressLine1, "field-addressLine1", this);
    }

    public AddCustomerPage typeAddressLine2(String addressLine2){
        return typeFieldById(addressLine2, "field-addressLine2", this);
    }

    public AddCustomerPage typeCity(String city){
        return typeFieldById(city, "field-city", this);
    }

    public AddCustomerPage typeState(String state){
        return typeFieldById(state, "field-state", this);
    }

    public AddCustomerPage typePostalCode(String postalCode){
        return typeFieldById(postalCode, "field-postalCode", this);
    }

    public AddCustomerPage typePostalCountry(String country){
        return typeFieldById(country, "field-country", this);
    }

    public AddCustomerPage selectEmployer(){
        clickCombobox("field_salesRepEmployeeNumber_chosen", this);
        return selectComboBoxItem("//div[@class='chosen-drop']//ul[@class='chosen-results']/li[1]",this);
    }

    public AddCustomerPage typeCreditLimit(String creditLimit){
        return typeFieldById(creditLimit, "field-creditLimit", this);
    }

    public AddCustomerPage setAddCustomer(String firstName, String lastName, String phone, String addressLine1,
                                          String addressLine2, String city, String state, String postalCode,
                                          String country, String creditLimit){
        typeFirstName(firstName);
        typeLastName(lastName);
        typePhone(phone);
        typeAddressLine1(addressLine1);
        typeAddressLine2(addressLine2);
        typeCity(city);
        typeState(state);
        typePostalCode(postalCode);
        typePostalCountry(country);
        selectEmployer();
        typeCreditLimit(creditLimit);

        return this;
    }

    public BootstrapV4ThemePage clickSaveAndGoBackToListButton(){
        return clickButtonByID("save-and-go-back-button", new BootstrapV4ThemePage(driver));
    }

}
