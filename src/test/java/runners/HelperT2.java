package runners;

import model.UserT2;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class HelperT2 {

    public void robotName() throws InterruptedException, AWTException {
        Robot robotName = new Robot();
        StringSelection selectName = new StringSelection(UserT2.getUserName());
        Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard1.setContents(selectName, selectName);

        Thread.sleep(1000);
        robotName.keyPress(KeyEvent.VK_CONTROL);
        robotName.keyPress(KeyEvent.VK_V);
        robotName.keyRelease(KeyEvent.VK_V);
        robotName.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void robotPassword() throws InterruptedException, AWTException{
        Robot robotPassword = new Robot();
        StringSelection selectPassword = new StringSelection(UserT2.getUserPassword());
        Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard2.setContents(selectPassword, selectPassword);

        Thread.sleep(1000);
        robotPassword.keyPress(KeyEvent.VK_CONTROL);
        robotPassword.keyPress(KeyEvent.VK_V);
        robotPassword.keyRelease(KeyEvent.VK_V);
        robotPassword.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void robotTab() throws InterruptedException, AWTException {
        Robot robotTab = new Robot();
        Thread.sleep(1000);
        robotTab.keyPress(KeyEvent.VK_TAB);
        robotTab.keyRelease(KeyEvent.VK_TAB);
    }

    public void robotEnter() throws InterruptedException, AWTException {
        Robot robotEnter = new Robot();
        Thread.sleep(1000);
        robotEnter.keyPress(KeyEvent.VK_ENTER);
        robotEnter.keyRelease(KeyEvent.VK_ENTER);
    }

}
