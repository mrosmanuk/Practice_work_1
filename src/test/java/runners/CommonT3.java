package runners;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonT3 {
    public static ChromeDriver driver;

    public void setDriver() {
        String driverPath = ("src/test/resources/");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriverV78.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
