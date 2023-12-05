package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationpage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	


	

	@Test
	void test_account_Registration() {
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		AccountRegistrationpage  regpage=new AccountRegistrationpage(driver);
		regpage.setFirstname("Anish");
		regpage.setlastname("Sinha");
		regpage.setEmail("anish.sinha17@gmail.com");
		regpage.setTelephone("7760589406");
		regpage.setPassword("Anish@123");
		regpage.setConfirmPassword("Anish@123");
		regpage.setCheckPolicy();
		regpage.clickContinue();
		
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	
		
	
}
