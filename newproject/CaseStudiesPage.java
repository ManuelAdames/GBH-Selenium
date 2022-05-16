package newproject;

import org.openqa.selenium.WebDriver;

public class CaseStudiesPage extends Utilities {
	
    private String xpathCheck = "//h2";
	private String xpathCaseStudies = "\"//*[@id=\\\"menu-item-353\\\"]/a/span[1]\"";
	
	 public CaseStudiesPage(WebDriver driver) {
		 
		 super(driver);
		 
	    }
	 
	 public void clickCaseStudies(){
		 
		 waitForElement(xpathCaseStudies);
		 click(xpathCaseStudies);
		 
	 }
	 
	    public String Validate() {
	    	waitForElement(xpathCheck);
	    	return getText(xpathCheck);
	    }
	

}
