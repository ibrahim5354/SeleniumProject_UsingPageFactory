package Next_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Next_BaseResource.Next_ProjectBase;
import Next_HomePage.Register;

public class Next_ResgisterTest  extends Next_ProjectBase{
	 public WebDriver driver;
	Register rg;
	
	@BeforeTest
	public void initia() throws IOException{
		driver=initializeDriver();
		rg = new Register();
		
	}
	
	@Test
	public void Registation() throws InterruptedException{
		rg.reg();
	}
	
	@AfterTest
	public void TearDown(){
		driver.close();
	}

}
