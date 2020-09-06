package wrapper;

import org.testng.annotations.Test;

@Test
public class Editleadsub2 extends EditleadSubclass{
	
	public void editleadsub2() throws InterruptedException {

	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//body[@class=' ext-safari']").click();
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	
	
	driver.findElementByLinkText("Hema").click();
driver.findElementByLinkText("Edit").click();




driver.findElementById("updateLeadForm_companyName").clear();
driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
driver.findElementByName("submitButton").click();

Thread.sleep(3000);

String title = driver.getTitle();
System.out.println(title);
if(title.contains("View")) {
	System.out.println("Title matched");
}
else {System.out.println("Title not been matched");
}


driver.findElementByLinkText("Edit").click();
driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
driver.findElementByName("submitButton").click();
		
	
}
}
