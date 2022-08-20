package week6.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethods {

	@Test
	public void deleteLead() throws InterruptedException  {
		
				

		//click leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//click find lead
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter Phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9843411111");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		//Click first resulting lead
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		
		
		//Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}

}
