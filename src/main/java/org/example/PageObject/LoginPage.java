package org.example.PageObject;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;

//------------------------------------------------
    public void setEmail(String usrName) {
        email.sendKeys(usrName);
    }

    public void setPassword(String psword) {
        password.sendKeys(psword);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

}