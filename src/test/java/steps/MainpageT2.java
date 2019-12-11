package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import runners.CommonT2;

public class MainpageT2 extends CommonT2 {
    private By response = By.xpath("//pre");
    private String websiteResponse;

    public String getWebsiteRespnse() {
        return websiteResponse;
    }

    public void setWebsiteRespnse(String websiteRespnse) {
        this.websiteResponse = websiteRespnse;
    }

    @Then("^I get (.*) response$")
    public void responseAssert(String expectedResponse) throws InterruptedException {
        Thread.sleep(2000);
        setWebsiteRespnse(CommonT2.driver.findElement(response).getText().split("[${}]+")[1]);
        System.out.println(getWebsiteRespnse());
        Assert.assertEquals(expectedResponse, getWebsiteRespnse());
        Thread.sleep(5000);
        CommonT2.driver.quit();
    }
}
