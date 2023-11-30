package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    LoginPage loginPage = new LoginPage(driver);
    @Given("User open the website siHalal")
    public void userOpenTheWebsiteSiHalal() {
        Assert.assertTrue(loginPage.emailDisplayed());
    }

    @When("User input {string} as a email {string} as a password before click Login")
    public void userInputAsAEmailAsAPassword(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User click Tutup on information popup")
    public void userClickTutupOnInformationPopup() {
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.buttonClose));
        loginPage.closeBtnLoginSuccess();
    }

    @When("User input {} as email {} as password")
    public void userInputAsEmailAsPassword(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User see popup error message and message contain {string}")
    public void userSeePopupErrorMessage() {
        Assert.assertTrue(loginPage.errorPassword());
    }


}
