package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage  {
    public static WebDriver webDriver;
    public UserDashboardPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[contains(.,'Dashboard')]")
    public static WebElement homePage;

    //------------------------------------------------
    public void clickButtonDashboard() {
        homePage.click();
    }

    public boolean verifyUserOnHomePage(){
        return homePage.isDisplayed();
    }
}
