package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    @Step
    public void checkCredentials()
    {
        System.out.println("Check users credentials");
    }

    @Step
    public void login(String username,String password)
    {
        loginPage.login(username,password);
    }

    @Step
    public void checkLogin()
    {
        System.out.println("check if user is successfully logged in");
    }
}
