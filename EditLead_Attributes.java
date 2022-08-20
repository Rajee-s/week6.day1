package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EditLead_Attributes extends ProjectSpecific_Attributes {

	@Test(priority=-1)
	public void editLead() throws InterruptedException { 
		
		//click find lead
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		
		//Enter First name
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rajee");
		
		
		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Click on first resulting lead
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-companyName']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		
		//verify the title of the page
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"));
			System.out.println("You are at right page View Lead | opentaps CRM");
		
		//click edit
			driver.findElement(By.linkText("Edit")).click();
		
		
		//Change company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("UST");
		
		//click update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();	
		
		//confirm the changed name appears
	
		driver.findElement(By.xpath("//span[text()='Company Name']")).getText().contains("UST");
			System.out.println("Company Name is Updated");
					
		
	}

}
