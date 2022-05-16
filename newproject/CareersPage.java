package newproject;

import org.openqa.selenium.WebDriver;

public class CareersPage extends Utilities{
	
    private String xpathCheck = "//h2";
	private String xpathCareer = "//*[@id=\"menu-item-475\"]/a/span[1]";
	
	 public CareersPage(WebDriver driver) {
		 
		 super(driver);
		 
	    }
	 
	 public void clickCareer(){
		 
		 waitForElement(xpathCareer);
		 click(xpathCareer);
		 
	 }
	 

	    public String Validate() {
	    	waitForElement(xpathCheck);
	    	return getText(xpathCheck);
	    }
	

}
