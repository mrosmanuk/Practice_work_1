package thirdTest.model;

public class Screenshot {
    public static int screenshotPixels;
    public static int expectedScreenshotPixels;
    public static String imageName;
    public static int ratio;

    public int getScreenshotPixels() {
        return screenshotPixels;
    }

    public void setScreenshotPixels(int screenshotPixels) {
        Screenshot.screenshotPixels = screenshotPixels;
    }

    public int getExpectedScreenshotPixels() {
        return expectedScreenshotPixels;
    }

    public void setExpectedScreenshotPixels(int expectedScreenshotPixels) {
        Screenshot.expectedScreenshotPixels = expectedScreenshotPixels;
    }

    public static String getImageName() {
        return imageName;
    }

    public static void setImageName(String imageName) {
        Screenshot.imageName = imageName;
    }

    public static int getRatio() {
        return ratio;
    }

    public static void setRatio(int ratio) {
        Screenshot.ratio = ratio;
    }
}
