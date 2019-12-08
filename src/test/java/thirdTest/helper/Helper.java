package thirdTest.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import thirdTest.runners.Common;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Helper extends Common {
    thirdTest.model.Screenshot scr = new thirdTest.model.Screenshot();
    private By logoElement = By.xpath("//img[@alt='Google']");

    public void takeScreenshotAndCompare() throws IOException {
        int ratio = 20;

        WebElement logo = driver.findElement(logoElement);
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,logo);
        File actualFile = new File("src/test/resources/thirdTest/screenshot.jpeg");
        ImageIO.write(screenshot.getImage(), "jpeg", actualFile);
        scr.setScreenshotHeight(screenshot.getImage().getHeight());
        scr.setScreenshotWidth(screenshot.getImage().getWidth());
        scr.setScreenshotPixels(scr.getScreenshotHeight()*scr.getScreenshotWidth());

        Screenshot expectedScreenshot = new Screenshot (ImageIO.read(new File("src/test/resources/thirdTest/test.jpeg")));
        scr.setExpectedScreenshotHeight(expectedScreenshot.getImage().getHeight());
        scr.setExpectedScreenshotWidth(expectedScreenshot.getImage().getWidth());
        scr.setExpectedScreenshotPixels(scr.getExpectedScreenshotHeight()*scr.getExpectedScreenshotWidth());
        ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, screenshot);
        assertThat(diff.withDiffSizeTrigger(scr.getScreenshotPixels()/100*ratio).hasDiff(), is(false));
    }
}
