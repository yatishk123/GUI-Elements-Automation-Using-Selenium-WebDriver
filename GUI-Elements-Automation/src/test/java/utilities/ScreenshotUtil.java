package utilities;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static void captureScreenshot(
            WebDriver driver,
            String screenshotName) {

        try {

            String timestamp =
                    new SimpleDateFormat(
                    "yyyyMMdd_HHmmss")
                    .format(new Date());

            File src =
                    ((TakesScreenshot) driver)
                    .getScreenshotAs(
                    OutputType.FILE);

            File dest =
                    new File(
                    "./screenshots/"
                    + screenshotName
                    + "_"
                    + timestamp
                    + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println(
                    "Screenshot Saved: "
                    + dest.getAbsolutePath());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}