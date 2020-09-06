package w3schollalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Genericw3 implements Supercls{

	public ChromeDriver driver;
	
		
	public void launchbrs(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	public void enterbyid(String locator, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterbyname(String locator, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clickid(String locator) {
		driver.findElementById(locator).click();
		
	}

	public void closebrowser() {
		// TODO Auto-generated method stub
		
	}

	public void alerttest(String locator)  {
		driver.findElementByXPath(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.sendKeys("Mahmud potter");
		alt.accept();
		
				
	}

	public void enterframe(int value) {
		driver.switchTo().frame(0);
		
	}

	public void enteralert(String locator) {
		// TODO Auto-generated method stub
		
	}

	

		
	}
	
	


