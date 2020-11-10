package Next_PageObjectsTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Next_BaseResource.Next_ProjectBase;

public class pageFactory_Login extends Next_ProjectBase{
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	protected
	WebElement clickAcct;
	
	@FindBy(xpath="//*[@id='EmailOrAccountNumber']")
	 protected
	 WebElement loginEmail;
	 
	 @FindBy(id="Password")
	 protected
	 WebElement loginPassword;
	 
	 @FindBy(name="SignInNow")
	 protected
	 WebElement submit;
	 
	 @FindBy(xpath="//*[@id='sec']/div[1]/ul/li[5]/a")
	 protected
	 WebElement changeDetail;
	 
	 
	 
	
	 
	

}
