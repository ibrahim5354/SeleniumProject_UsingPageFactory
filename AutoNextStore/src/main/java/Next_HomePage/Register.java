package Next_HomePage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Next_PageObjectsTest.pageFactory_Registration;

public class Register  extends pageFactory_Registration {
public Register(){
	PageFactory.initElements(driver, this);
	}

    public void reg() throws InterruptedException{
    clickAcct.click();
    clickRegister.click();
    
    Select s = new Select(Title);
    s.selectByIndex(4);
    
    firstName.sendKeys("smith");
    lastName.sendKeys("john");
    email.sendKeys("smith53546057@gmail.com");
    password.sendKeys("Tesco5354");
    show.click();
    hide.click();
    dob.sendKeys("03/05/86");
    number.sendKeys("07058494039");
    houseNumber.sendKeys("9");
    postcode.sendKeys("se18 2nd");
    searchPostcode.click();
    no.click();
    tick.click();
    signUp.click();
    String actual = welcoMessage.getText();
    Assert.assertTrue(actual.contains("Welcome to Next"));
    goHomePage.click();
    
    
    
    
    
    
    
    
    
    
    
    
   
    }
    
}
