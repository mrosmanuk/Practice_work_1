package thirdTest.runners;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
    public static ChromeDriver driver;

    public void setDriver() {
        String driverPath = ("src/test/resources/thirdTest/");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
