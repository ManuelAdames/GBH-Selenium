package newproject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	protected WebDriver driver;

    public Utilities(WebDriver driver) {
        this.driver = driver;
    }
	
	public void waitForElement(String locator) {
		
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        
    }

    protected void click(String locator) {
    	
        driver.findElement(By.xpath(locator)).click();
        
    }
    
    protected void hover(String locator) {
    	
    	Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath(locator))).perform();

    }
    
    public String getText(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }
    
    


}
