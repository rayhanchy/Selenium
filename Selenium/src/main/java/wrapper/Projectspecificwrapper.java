package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Projectspecificwrapper {

	public ChromeDriver driver; 
	@BeforeMethod
	public void login() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
															//leaftaps lunch
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																		//login
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	
}
	
	@AfterMethod
	public void aamm () {
		
		driver.close();
	
	}
	
	
}