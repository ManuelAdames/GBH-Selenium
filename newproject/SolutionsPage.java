package newproject;

import org.openqa.selenium.WebDriver;


public class SolutionsPage extends Utilities{
	
    private String xpathCheck = "//h2";
	private String xpathSolutions = "//*[@id=\"menu-item-3240\"]/a/span[1]";
	private String xpathInnovationSquad = "//*[@id='menu-item-3248']/a/span[1]";
	private String xpathBusiness = "//*[@id='menu-item-3247']/a/span[1]";
	private String xpathCustomer = "//*[@id='menu-item-3249']/a/span[1]";
	private String xpathStaff = "//*[@id='menu-item-3250']/a/span[1]";
	private String xpathServices = "//*[@id=\"menu-item-6586\"]/a/span[1]";
	private String xpathITSolutions = "//*[@id=\"menu-item-3252\"]/a/span[1]";
	private String xpathMicrosoft = "//*[@id=\"menu-item-6194\"]/a/span[1]";

	
	 public SolutionsPage(WebDriver driver) {
	        super(driver);
	    }
	
	public void hoverSolutions() {
		
		waitForElement(xpathSolutions);
		hover(xpathSolutions);
	}
	
	public void clickInnovation() {
		
		waitForElement(xpathInnovationSquad);
		click(xpathInnovationSquad);
	}
	
	public void clickBusiness() {
		
		waitForElement(xpathBusiness);
		click(xpathBusiness);
	}
	
	public void clickCustomer() {
		
		waitForElement(xpathCustomer);
		click(xpathCustomer);
	}
	
	public void clickStaff() {
		
		waitForElement(xpathStaff);
		click(xpathStaff);
		
	}
	
	public void clickServices() {
		
		waitForElement(xpathServices);
		click(xpathServices);
	}
	
	public void clickITServices() {
		
		waitForElement(xpathITSolutions);
		click(xpathITSolutions);
	}
	
	public void clickMicrosoft() {
		waitForElement(xpathMicrosoft);
		click(xpathMicrosoft);
	}
	
    
    public String Validate() {
    	waitForElement(xpathCheck);
    	return getText(xpathCheck);
    }
	 
	

}
