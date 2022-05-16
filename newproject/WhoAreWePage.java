package newproject;

import org.openqa.selenium.WebDriver;


public class WhoAreWePage extends Utilities{
	
    private String xpathCheck = "//h2";
	private String xpathWhoAreWe = "//*[@id=\\\"menu-item-3241\\\"]/a/span[1]";
	private String xpathAboutUs = "//*[@id=\"menu-item-3243\"]/a/span[1]";
	private String xpathPoD = "//*[@id=\"menu-item-3242\"]/a/span[1]";
	private String xpathBlog = "//*[@id=\"menu-item-4661\"]/a/span[1]";
	
	
	public WhoAreWePage(WebDriver driver) {
        super(driver);
    }
	
	public void hoverWhoAreWe(){
		
		waitForElement(xpathWhoAreWe);
		hover(xpathWhoAreWe);
	}
	
	public void ClickAboutUs() {
		
		waitForElement(xpathAboutUs);
		click(xpathAboutUs);
	}
	
	public void ClickPoD() {
		
		waitForElement(xpathPoD);
		click(xpathPoD);
	}
	
	public void ClickBlog() {
		
		waitForElement(xpathBlog);
		click(xpathBlog);
	}
	
    public String Validate() {
    	waitForElement(xpathCheck);
    	return getText(xpathCheck);
    }

}
