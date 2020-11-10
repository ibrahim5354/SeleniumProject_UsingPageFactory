package Next_BaseResource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporter {
	
	static ExtentReports extent;
	 static public ExtentReports ExtendReportObject(){
		String path=System.getProperty("user.dir")+"\\ExtendTestReports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Next web-Aapplication Result");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ibrahim Azeez");
		
		return extent;
		}
	 }
