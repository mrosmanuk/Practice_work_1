package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import model.ScreenshotT3;
import runners.CommonT3;
import runners.HelperT3;

import java.io.IOException;

public class HomepageT3 extends CommonT3 {
    HelperT3 helperT3 = new HelperT3();

    @Given("^I navigate to (.*)$")
    public void navigateToWebsite(String website) {
        setDriver();
        CommonT3.driver.get(website);
    }

    @Then("^I verify that main image matches (.*) image with (.*)% threshold$")
    public void compareScreenshots(String imageName, int ratio) throws IOException, InterruptedException {
        ScreenshotT3.setImageName(imageName);
        ScreenshotT3.setRatio(ratio);
        helperT3.takeScreenshotAndCompare();
        Thread.sleep(5000);
        CommonT3.driver.quit();
    }
}
