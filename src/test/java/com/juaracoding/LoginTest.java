package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    public WebDriver driver;

    public LoginPage loginPage;

    @BeforeAll
    public void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();

        loginPage = new LoginPage();
    }

    @AfterAll
    public void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Given("User access the link saucedemo com")
    public void user_access_the_link_saucedemo_com(){
        String url = "https://www.saucedemo.com/\n";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @When("Display the login page")
    public void display_the_login_page(){
    }

    @When("Login with valid account")
    public void login_with_valid_account(){
    }

    @And("Enter a valid username and password")
    public void enter_a_valid_username_and_password(){
        loginPage.username("standa_user");
        loginPage.password("secret_sauce")
    }

    @And("Click the login button")
    public void click_the_login_button(){
        loginPage.btnLogin();
    }

    @And("Input invalid username and password")
    public void input_invalid_username_and_password(){
    }

    @And("Disconnect the internet network")
    public void disconnect_the_internet_network(){
    }

    @And("Click register logout")
    public void click_register_logout(){
    }

    @Then("Login fails and displays the message username and password are invalid")
    public void login_fails_and_displays_the_message_username_and_password_are_invalid(){
    }

    @Then("Login fail and displays the message Username is required")
    public void login_fail_and_displays_the_message_username_is_required(){
    }

    @Then("The site or page does not respond")
    public void the_site_or_page_does_not_respond(){
    }

    @Then("The page displays a notification No internet")
    public void the_page_displays_a_notification_no_internet(){
    }

}
