package Next_HomePage;

import org.openqa.selenium.support.PageFactory;

import Next_PageObjectsTest.pageFactory_Login;

public class Login extends pageFactory_Login {
	public Login(){
		PageFactory.initElements(driver, this);
}
	/******************click login*************************/
	public void logIn(){
		  clickAcct.click();
	      loginEmail.sendKeys("smith53546057@gmail.com");
		  loginPassword.sendKeys("tesco5354");
		  submit.click();
		  changeDetail.click();
	
		}
	}
