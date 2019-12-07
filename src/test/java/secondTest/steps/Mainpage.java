package secondTest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import secondTest.runners.Common;

public class Mainpage extends Common {
    private By response = By.xpath("//pre");
    private String websiteRespnse;

    public String getWebsiteRespnse() {
        return websiteRespnse;
    }

    public void setWebsiteRespnse(String websiteRespnse) {
        this.websiteRespnse = websiteRespnse;
    }

    @Then("^I get (.*) response$")
    public void responseAssert(String expectedResponse){
        setWebsiteRespnse(driver.findElement(response).getText().split("[${}]+")[1]);
        System.out.println(getWebsiteRespnse());
        Assert.assertEquals(expectedResponse,getWebsiteRespnse());
    }

    @And("I close webdriver")
    public void closeWebdriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
