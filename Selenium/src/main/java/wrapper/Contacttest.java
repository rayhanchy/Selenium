package wrapper;

import org.testng.annotations.Test;

@Test
public class Contacttest extends Projectspecificwrapper{

	public void contact() {
		
	driver.findElementByLinkText("Contacts").click();
	driver.findElementByLinkText("My Contacts").click();
	driver.findElementByLinkText("DemoContact2").click();
	
	
	
	
	
	
	
}
}