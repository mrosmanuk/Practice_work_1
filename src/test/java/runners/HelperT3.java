package runners;

import model.ScreenshotT3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelperT3 extends CommonT3 {
    ScreenshotT3 scr = new ScreenshotT3();
    private By logoElement = By.xpath("//div[contains(@id,'hplogo')]|//img");

    public void takeScreenshotAndCompare() throws IOException {
        WebElement logo = CommonT3.driver.findElement(logoElement);
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(CommonT3.driver, logo);
        File actualFile = new File("src/test/resources/screenshot.jpeg");
        ImageIO.write(screenshot.getImage(), "jpeg", actualFile);
        scr.setScreenshotPixels(screenshot.getImage().getHeight() * screenshot.getImage().getWidth());

        Screenshot expectedScreenshot = new Screenshot(ImageIO.read(new File("src/test/resources/" + ScreenshotT3.getImageName())));
        scr.setExpectedScreenshotPixels(expectedScreenshot.getImage().getHeight() * expectedScreenshot.getImage().getWidth());
        ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, screenshot);
        assertThat(diff.withDiffSizeTrigger(scr.getScreenshotPixels() / 100 * ScreenshotT3.getRatio()).hasDiff(), is(false));
    }
}
