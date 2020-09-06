package madproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Subclasss implements Supercl  {
	public ChromeDriver driver;

	public void launchbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	public void enterbyid(String abc, String data) {
		driver.findElementByName(abc).sendKeys(data);
	}

	public void clickbyid(String locatorvalue) {
		driver.findElementByClassName(locatorvalue).click();
				
	}

		public void klickltxt(String locatorvalue) {
		driver.findElementByLinkText(locatorvalue).click();
		
	}
	
	

}
