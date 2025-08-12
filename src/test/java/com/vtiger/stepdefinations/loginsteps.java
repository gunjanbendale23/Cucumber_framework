package com.vtiger.stepdefinations;

import com.vtiger.pages.Homepage;
import com.vtiger.pages.loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginsteps extends Basesteps {

    @Before
    public  void getScenario(Scenario scenario)
    {
        TCName=scenario.getName();
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
        driver.quit();
    }



    @Given("user should be on login page")
    public void user_should_be_on_login_page() {
    LaunchApp();
    }
    @When("user enters valid Userid")
    public void user_enters_valid_userid() {

        getLoginPage().setUsername(prop.getProperty("username"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        getLoginPage().setpassword(prop.getProperty("password"));
       // Assert.assertEquals(false,true);

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        getLoginPage().clicklogin();

    }
    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
        getHomePage().HomeDisplay();
    }
    @Then("user can see the logout link on home page")
    public void user_can_see_the_logout_link_on_home_page() {

        getHomePage().LogoutDisplay();

    }



    @When("user enters invalid Userid")
    public void user_enters_invalid_userid() {
        getLoginPage().setUsername("admin12");
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        getLoginPage().setpassword("3455");
    }

    @Then("user should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {
        getLoginPage().Displaypassword();
    }
    @Then("user can see the error massage on login page")
    public void user_can_see_the_error_massage_on_login_page() {
    getLoginPage().DisplayErrorMsg();
    }


    @When("user enters  Userid as {string}")
    public void user_enters_userid_as(String uid) {
        getLoginPage().setUsername(uid);


    }
    @When("user enters  password as {string}")
    public void user_enters_password_as(String pwd) {
        getLoginPage().setpassword(pwd);
    }






}
