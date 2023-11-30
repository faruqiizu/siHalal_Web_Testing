package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.UserDashboardPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserDashboardSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);

    //------------------------------------------------
    @Then("User click button dashboard")
    public void userClickButtonDashboard() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(UserDashboardPage.homePage));
        userDashboardPage.clickButtonDashboard();
    }

    @And("User already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        Assert.assertTrue(userDashboardPage
                .verifyUserOnHomePage());
    }
}
