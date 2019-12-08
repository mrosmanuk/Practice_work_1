package thirdTest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import thirdTest.helper.Helper;
import thirdTest.model.Screenshot;
import thirdTest.runners.Common;

import java.io.IOException;

public class Homepage extends Common {
    Helper helper = new Helper();

    @Given("^I navigate to (.*)$")
    public void navigateToWebsite(String website){
        setDriver();
        driver.get(website);
    }

    @Then("^I verify that main image matches (.*) image with (.*)% threshold$")
    public void compareScreenshots(String imageName, int ratio) throws IOException {
    Screenshot.setImageName(imageName);
    Screenshot.setRatio(ratio);
    helper.takeScreenshotAndCompare();
    }

    @And("I close webdriver")
    public void closeWebdriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
