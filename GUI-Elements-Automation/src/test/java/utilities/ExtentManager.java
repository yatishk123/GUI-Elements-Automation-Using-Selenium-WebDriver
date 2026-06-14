package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            new File("Reports").mkdirs();

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "Reports/myExtentReport.html");

            spark.config().setReportName(
                    "GUI Automation Report");

            spark.config().setDocumentTitle(
                    "Automation Test Results");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Tester", "Yatish Kumar");

            extent.setSystemInfo(
                    "Environment", "QA");
        }

        return extent;
    }
}