package model;

public class ScreenshotT3 {
    public static int screenshotPixels;
    public static String imageName;
    public static int ratio;

    public int getScreenshotPixels() {
        return screenshotPixels;
    }

    public static void setImageName(String imageName) {
        ScreenshotT3.imageName = imageName;
    }

    public static void setRatio(int ratio) {
        ScreenshotT3.ratio = ratio;
    }

    public static String getImageName() {
        return imageName;
    }

    public void setScreenshotPixels(int screenshotPixels) {
        ScreenshotT3.screenshotPixels = screenshotPixels;
    }

    public static int getRatio() {
        return ratio;
    }
}
