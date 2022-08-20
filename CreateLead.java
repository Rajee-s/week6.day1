package week6.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {

	@Test
	public void createLead() throws InterruptedException {

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
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9843411111");

		//Enter E-mail 

		driver.findElement(By.name("primaryEmail")).sendKeys("r@gmail.com");

		
		//click create button
		
		driver.findElement(By.className("smallSubmit")).click();

		
	}

}
