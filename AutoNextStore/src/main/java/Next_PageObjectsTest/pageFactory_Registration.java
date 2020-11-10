package Next_PageObjectsTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Next_BaseResource.Next_ProjectBase;

public class pageFactory_Registration extends Next_ProjectBase {
/******************start of registration form ********************************/
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	protected
	WebElement clickAcct;
	
	@FindBy(xpath="//span[contains(text(),'Register Now')]")
	protected
	WebElement clickRegister;
	
	@FindBy(id="Title")
	 protected
	 WebElement Title;
	 
	 @FindBy(id="FirstName")
	 protected
	 WebElement firstName;
	 
	 @FindBy(name="LastName")
	 protected
	 WebElement lastName;
	 
	 @FindBy(name="Email")
	 protected
	 WebElement email;
	 
	 @FindBy(id="Password")
	 protected
	 WebElement password;
	 
	 @FindBy(className="show")
	 protected
	 WebElement show;
	 
	 @FindBy(xpath="//span[contains(text(),'Hide')]")
	 protected
	 WebElement hide;
	 
	 @FindBy(xpath="//input[@id='DobDate']")
	 protected
	 WebElement dob;
	 
	 @FindBy(xpath="//*[@id='DobDate-error']")
	 protected
	 WebElement error;
	 
	 @FindBy(id="PhoneNumber")
	 protected
	 WebElement number;
	 
	 @FindBy(id="HouseNumberOrName")
	 protected
	 WebElement houseNumber;
	 
	 @FindBy(id="Postcode")
	 protected
	 WebElement postcode;
	 
	 @FindBy(xpath="//button[@id='SearchPostcode']")
	 protected
	 WebElement searchPostcode;
	 
	 @FindBy(xpath="//label[contains(text(),'NO')]")
	 protected
	 WebElement no;
	 
	 @FindBy(xpath="//input[@id='ChkByEmail']")
	 protected
	 WebElement tick;
	 
	 @FindBy(id="SignupButton")
	 protected
	 WebElement signUp;
	 
	 protected
	 WebElement welcoMessage;
	 
	 @FindBy(xpath="//*[@id='welcome-wrapper']/div/div[3]/div/div/a")
	 protected
	 WebElement goHomePage;
	 
	 
	 
	 
	
	 /******************end of registration form ********************************/
	// @FindBy(xpath="//a[@class='theme-btn']")
	
}


