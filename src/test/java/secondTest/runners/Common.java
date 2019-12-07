package secondTest.runners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Common {
    public static ChromeDriver driver;
   public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        String driverPath = ("src/test/resources/");
        System.setProperty("webdriver.chrome.driver", driverPath + "secondTest/chromedriver.exe");
        options.setBinary("C:\\chromeBetav79/chrome.exe"); //path to Chrome Beta 79, as current version 78 not displaying basic auth popup due to bug (https://bugs.chromium.org/p/chromedriver/issues/detail?id=3209)
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
}
