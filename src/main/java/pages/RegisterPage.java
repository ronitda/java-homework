package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstName = By.name("customer.firstName");
    private By lastName = By.name("customer.lastName");
    private By street = By.name("customer.address.street");
    private By city = By.name("customer.address.city");
    private By state = By.name("customer.address.state");
    private By zipCode = By.name("customer.address.zipCode");
    private By phoneNumber = By.name("customer.phoneNumber");
    private By ssn = By.name("customer.ssn");
    private By username = By.name("customer.username");
    private By password = By.name("customer.password");
    private By repeatedPassword = By.name("repeatedPassword");
    private By registerButton = By.xpath("//input[@value='Register']");

    public void fillRegistrationForm(String fName, String lName, String streetAddress, String cityName,
                                     String stateName, String zip, String phone, String ssnValue,
                                     String user, String pass, String repeatPass) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(street).sendKeys(streetAddress);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(phoneNumber).sendKeys(phone);
        driver.findElement(ssn).sendKeys(ssnValue);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(repeatedPassword).sendKeys(repeatPass);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
}

