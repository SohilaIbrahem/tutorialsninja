package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_RegistrationPage {
    private WebDriver driver;

    //Constructor
    public P01_RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By MyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    private final By registration = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    private final By FirstName = By.xpath("//input[@name=\"firstname\"]");
    private final By LasttName = By.xpath("//input[@name=\"lastname\"]");
    private final By Email = By.xpath("//input[@name=\"email\"]");
    private final By telephone = By.xpath("//input[@name=\"telephone\"]");
    private final By password = By.xpath("//input[@name=\"password\"]");
    private final By confPass = By.xpath("//input[@name=\"confirm\"]");
    private final By checkBox = By.xpath("//input[@type=\"checkbox\"]");
    private final By ContinueButton = By.xpath("//input[@type=\"submit\"]");
    private final By CofirmationMessage = By.xpath("//div[@id=\"content\"]");

    public P01_RegistrationPage UserClickOnMyAccount() {
        driver.findElement(this.MyAccount).click();
        return this;
    }

    public P01_RegistrationPage UserSelectRegistration() {
        driver.findElement(this.registration).click();
        return this;
    }

    public P01_RegistrationPage UserAddFirstName(String FName) {
        driver.findElement(this.FirstName).sendKeys(FName);
        return this;
    }

    public P01_RegistrationPage UserAddLasttName(String LName) {
        driver.findElement(this.LasttName).sendKeys(LName);
        return this;
    }

    public P01_RegistrationPage UserAddEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }

    public P01_RegistrationPage UserAddTelephone(String phone) {
        driver.findElement(this.telephone).sendKeys(phone);
        return this;
    }

    public P01_RegistrationPage UserAddPassword(String pass) {
        driver.findElement(this.password).sendKeys(pass);
        return this;
    }

    public P01_RegistrationPage UserAddConfPass(String cofPass) {
        driver.findElement(this.confPass).sendKeys(cofPass);
        return this;
    }

    public P01_RegistrationPage UserClickOnCheckBox() {
        driver.findElement(this.checkBox).click();
        return this;
    }

    public P01_RegistrationPage UserClickOnContinueButton() {
        driver.findElement(this.ContinueButton).click();
        return this;
    }
    public Boolean RefistrationConfirm()
    {
        return driver.findElement(this.CofirmationMessage).getText().equals("Congratulations! Your new account has been successfully created!");
    }


}
