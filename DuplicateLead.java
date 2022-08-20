package week6.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DuplicateLead extends ProjectSpecificMethods {

	@Test
	public void duplicatedNewLead() {
		
				
				
				//click create lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter companyname using is locator
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
				
				//Enter firstname using id locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajee");
				
				//Enter last name using id locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaram");
				
				//Enter firstname(local) using id locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
				
				//Enter department field using any locator
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
				//Description field using any locator
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
				
				//Enter E-mail 
				driver.findElement(By.name("primaryEmail")).sendKeys("r@gmail.com");
				
				//click create button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Get the title of the resulting page
				String title = driver.getTitle();
				System.out.println("The title of the page is " + title);
				
				//Click duplicate button
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				
				//clear the company name and enter new company name
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.clear();
				companyName.sendKeys("Leaftest");
				
				
				//clear the firstname and enter new firstname
				WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.clear();
				firstName.sendKeys("Shree");
				
				
				//click create lead button
				
				driver.findElement(By.className("smallSubmit")).click();
				

	}

}
