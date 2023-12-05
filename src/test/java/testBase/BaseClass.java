package testBase;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "A:\\chromedriver_win32 (7)\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart");
		driver.manage().window().maximize();
}
	
	
	@AfterClass
	public void tearup() {
		driver.quit();
	}
	
	public String RandomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
		public String RandomNumber() {
			String generatedString2=RandomStringUtils.randomNumeric(10);
			return (generatedString2);
		
	}
		public String randomalphaNumeric() {
			String st=RandomStringUtils.randomAlphabetic(5);
			String Num=RandomStringUtils.randomNumeric(10);
			return (st+Num);
		
	}
}
