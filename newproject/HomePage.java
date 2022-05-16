package newproject;

import org.openqa.selenium.WebDriver;

public class HomePage extends Utilities {
	
	
    private String xpathCheck = "//h2";
	private String xpathHome = "//*[@id=\"menu-item-31\"]/a/span[1]";
	
	 public HomePage(WebDriver driver) {
		 
		 super(driver);
		 
	    }
	 
	 public void clickHome(){
		 
		 waitForElement(xpathHome);
		 click(xpathHome);
		 
	 }
	 
	    public String Validate() {
	    	waitForElement(xpathCheck);
	    	return getText(xpathCheck);
	    }
	
	

}
