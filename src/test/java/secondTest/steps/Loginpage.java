package secondTest.steps;

import cucumber.api.java.en.Given;
import secondTest.Helpers.Helper;
import secondTest.model.User;
import secondTest.runners.Common;
import java.awt.*;

public class Loginpage extends Common {
    Helper helper = new Helper();

    @Given("^I authenticate at (.*) using username (.*) and password (.*)$")
    public void navigateAndLogin(String website, String userName, String userPassword) throws InterruptedException, AWTException {
        User.setUserName(userName);
        User.setUserPassword(userPassword);

        setDriver();
        driver.get(website);

        helper.robotName();
        helper.robotTab();
        helper.robotPassword();
        helper.robotEnter();
    }
}
