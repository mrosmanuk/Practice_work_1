package steps;

import cucumber.api.java.en.Given;
import model.UserT2;
import runners.CommonT2;
import runners.HelperT2;

import java.awt.*;

public class LoginpageT2 extends CommonT2 {
    HelperT2 helperT2 = new HelperT2();

    @Given("^I authenticate at (.*) using username: (.*) and password: (.*)$")
    public void navigateAndLogin(String website, String userName, String userPassword) throws InterruptedException, AWTException {
        UserT2.setUserName(userName);
        UserT2.setUserPassword(userPassword);

        setDriver();
        CommonT2.driver.get(website);

        helperT2.robotName();
        helperT2.robotTab();
        helperT2.robotPassword();
        helperT2.robotEnter();
    }
}
