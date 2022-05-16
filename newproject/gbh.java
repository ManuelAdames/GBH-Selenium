package newproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;


public class gbh extends Webpage {
	
	
	public static void main(String[] args) {
		
		// OPENING GBH
		
		Webpage webpage = new Webpage();
					

		//SOLUTIONS MENU 
		
        SolutionsPage solutionsPage = new SolutionsPage(driver);

		
		solutionsPage.hoverSolutions();
		solutionsPage.clickInnovation();
		
        String TextsolutionsPage = solutionsPage.Validate();
        String h2InnovationSquad = "Tech-enabled Innovation";
        assertEquals(TextsolutionsPage, h2InnovationSquad);
		
		solutionsPage.hoverSolutions();
		solutionsPage.clickBusiness();
		
        String TextITBusiness = solutionsPage.Validate();
        String h2ITBusinessTrans = "You’re moving fast. We’ve got a board-level vCIO to get you there faster.";
        assertEquals(TextITBusiness, h2ITBusinessTrans);
		
		solutionsPage.hoverSolutions();
		solutionsPage.clickCustomer();
		
		String TextCustomer = solutionsPage.Validate();
	    String h2CustomerSoftDev = "Custom Software Development";
	    assertEquals(TextCustomer, h2CustomerSoftDev);
		
		solutionsPage.hoverSolutions();
		solutionsPage.clickStaff();
		
		String TextStaff = solutionsPage.Validate();
	    String h2AgentStaff = "Staff Augmentation";
	    assertEquals(TextStaff, h2AgentStaff);

		solutionsPage.hoverSolutions();
		solutionsPage.clickServices();
		
		String TextServices = solutionsPage.Validate();
	    String h2Services = "IT Managed Services";
	    assertEquals(TextServices, h2Services);

		solutionsPage.hoverSolutions();
		solutionsPage.clickITServices();
		
		String TextITServices = solutionsPage.Validate();
	    String h2ITServices = "From design to implementation and support.\r\n"
	    		+ "Full-Service Network Solutions that increase your business’ stability and security.";
	    assertEquals(TextITServices, h2ITServices);
		
		solutionsPage.hoverSolutions();
		solutionsPage.clickMicrosoft();
		
		String TextMicrosoft = solutionsPage.Validate();
	    String h2Microsoft = "Connectivity and productivity at their highest.\r\n"
	    		+ "";
	    assertEquals(TextMicrosoft, h2Microsoft);

		//WHO ARE WE MENU 
		
		WhoAreWePage whoAreWePage = new WhoAreWePage(driver);

		whoAreWePage.hoverWhoAreWe();
		whoAreWePage.ClickAboutUs();
		
		String TextAboutUs = solutionsPage.Validate();
		String h2AboutUs = "We’re driven by an earnest belief";
		assertEquals(TextAboutUs, h2AboutUs);

		
		whoAreWePage.hoverWhoAreWe();
		whoAreWePage.ClickPoD();

		String TextPoD = solutionsPage.Validate();
		String h2PoD = "Devoted to delivering results...";
		assertEquals(TextPoD, h2PoD);

		whoAreWePage.hoverWhoAreWe();
		whoAreWePage.ClickBlog();
		String TextBlog = solutionsPage.Validate();
		String h2Blog = "Our latest insights on the strategic use of tech to amplify your impact.";
		assertEquals(TextBlog, h2Blog);
		
		//CASE STUDIES PAGE 
		
		CaseStudiesPage caseStudiesPage = new CaseStudiesPage(driver);
		
		String TextCaseStudies = caseStudiesPage.Validate();	
		String h2CaseStudies = "We deliver market-ready tech that defines industries.";
		assertEquals(TextCaseStudies, h2CaseStudies);
		
		caseStudiesPage.clickCaseStudies();
		
		//CAREER PAGE
		CareersPage careersPage = new CareersPage(driver);
		careersPage.clickCareer();
		
		String TextCareers = careersPage.Validate();
		String h2Casreers = "We deliver market-ready tech that defines industries.";
		assertEquals(TextCareers, h2Casreers);
		
		//BACK TO HOME PAGE
		
		HomePage homePage = new HomePage(driver);
		homePage.clickHome();
		
        String h2HomePage = "We transform businesses. \r\n"
        		+ "Measuring our achievements by their impact.";
        String TexthomePage = homePage.Validate();
        assertEquals(h2HomePage, TexthomePage);
		
        System.out.println("acabe");	
		
		}

}
