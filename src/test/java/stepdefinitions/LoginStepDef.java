package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class LoginStepDef {

   @Steps
   LoginSteps loginSteps;

   @Given("^a user with valid credentials$")
    public void aUserWithValidCredentials()  {

       loginSteps.checkCredentials();
    }

    @When("^Tries to login$") public void triesToLogin(){

       loginSteps.login("test","123");

    }

    @Then("^User should be able to login successfully$")

    public void userShouldBeAbleToLoginSuccessfully()
    {
        loginSteps.checkLogin();

    }
}
