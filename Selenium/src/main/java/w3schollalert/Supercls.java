package w3schollalert;

public interface Supercls {
	
	public void launchbrs(String url);
	public void enterbyid (String locator, String data);
	public void enterbyname(String locator, String data);
	
	public void clickid (String locator);
	
	public void alerttest (String locator) ;
	
	public void enterframe(int value);
	
	public void enteralert(String locator);
	
	public void closebrowser();
			

}
