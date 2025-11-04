package cucumber8.Base;

import java.io.IOException;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber8.Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    public static BaseClass base;
    public static  ExtentReports reports;
    public static  ExtentSparkReporter sparkReport;
    public static  ExtentTest test;

    @Before
    public void setUp(Scenario scenario) throws IOException {
        
        reports = new ExtentReports();
        sparkReport = new ExtentSparkReporter("./reports/report.html");
        reports.attachReporter(sparkReport);
        sparkReport.config().setDocumentTitle("Automation Report");
        sparkReport.config().setTheme(Theme.DARK);
        sparkReport.config().setReportName("Test Report");
        reports.setSystemInfo("OS", System.getProperty("os.version"));
        reports.setSystemInfo("java-version", System.getProperty("java.version"));
        test = reports.createTest("Test1", "Report Generated");
        base = new BaseClass();
        base.setupDriver();
        base.launchUrl();
        
    }

    @After
    public void tearDown(Scenario scenario) {
    	
    	if(scenario.isFailed())
    	{
    		System.out.println("Scenario failed: " + scenario.getName());
    		test.log(Status.FAIL, MarkupHelper.createLabel("Test Failed", ExtentColor.RED));
    	}
    	else
    	{
    		System.out.println("Scenario passed: " + scenario.getName());
    		test.log(Status.PASS, MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN));
    	}
        base.tearDown();
    }
    @AfterAll
    public static void before_or_after_all()
    {
    	reports.flush();
    }
}
