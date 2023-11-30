package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='tbUser']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='tbPassword']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='btnLogin']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-header']")
    private WebElement errorNotification;
    @FindBy(xpath = "(//h5[@id='myModalHead']")
    private WebElement errorMsgLogin;
    @FindBy(xpath = "//input[@id='btnOK']")
    public static WebElement buttonClose;

//------------------------------------------------
    public void setEmail(String usrName) {
        email.sendKeys(usrName);
    }

    public boolean emailDisplayed() {
        return email.isDisplayed();
    }

    public void setPassword(String psword) {
        password.sendKeys(psword);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public boolean errorNotif() {
        return errorMsgLogin.isDisplayed();
    }

//    public String  errorMessageLogin() {
//        return errorMsgLogin.getText();
//    }

    public void closeBtnLoginSuccess() {
        buttonClose.click();
    }

}