package Next_BaseResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Next_ProjectBase {
	public static WebDriver driver;
	public static  Properties prop;
	public static WebDriver initializeDriver() throws IOException{
		 prop= new Properties();
		
		 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Next_properties\\data.properties");
		prop.load(fis);
		Long implicit = Long.parseLong(prop.getProperty("implicitWait"));
		Long pageLoad = Long.parseLong(prop.getProperty("pageLoad"));
		String url = prop.getProperty("url");
		
		String browserName =prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(implicit,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageLoad, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
}
	public String getScreenShot(String testCaseName, WebDriver driver
			) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+ "\\FailScreenshotreport\\"+testCaseName+" .png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
	}
	
}
