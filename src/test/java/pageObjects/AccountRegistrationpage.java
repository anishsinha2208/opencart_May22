package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationpage extends BasePage  {

	public AccountRegistrationpage(WebDriver driver) {
		super(driver);
	
	}
//elements
	 @FindBy(name="firstname")
	 WebElement txtfrstname;
	 
	 @FindBy(name="lastname")
	 WebElement txtlastname;
	 
	 @FindBy(name="email")
	 WebElement txtEmail;
	 @FindBy(name="telephone")
	 WebElement Telephone;
	 @FindBy(name="password")
	 WebElement txtPassword;
	 @FindBy(name="confirm")
	 WebElement txtconfirmpwd;
	 @FindBy(name="agree")
	 WebElement chkdpolicy;
	 @FindBy(xpath="//input[@value='Continue']")
	 WebElement ctnButton;
	 @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	 WebElement msgconfirmation;
	 public void setFirstname(String fname) {
		 txtfrstname.sendKeys(fname);
		 
	 }
	 
	 public void setlastname(String lname) {
		 txtlastname.sendKeys(lname);
		 
	 }
	 public void setEmail(String email) {
		 txtEmail.sendKeys(email);
		 
	 }
	 public void setTelephone(String tel) {
		 Telephone.sendKeys(tel);
		 
}
	 public void setPassword(String pwd) {
		 txtPassword .sendKeys(pwd);
}
	 
	 public void setConfirmPassword(String cpwd) {
		 txtconfirmpwd.sendKeys(cpwd);
		 
}
	 public void setCheckPolicy() {
		 chkdpolicy.click();
		 
}
	 public void clickContinue() {
		 ctnButton.click();
}

	
		
	}
	 




