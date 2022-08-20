package week6.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class MergeLead extends ProjectSpecificMethods{

	@Test
	public void mergeLead() throws InterruptedException {
		
				
				//click MergeLeads
				driver.findElement(By.linkText("Merge Leads")).click();
				String windowHandle = driver.getWindowHandle();	
				
				//click the icon following from the lead
				driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
				
					
				//switch to new window
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> lstWindow = new ArrayList<String>(windowHandles);
				String secondWindow = lstWindow.get(1);
				
				driver.switchTo().window(secondWindow);
				
				//Enter the firstname
				driver.findElement(By.name("firstName")).sendKeys("Babu");
				
				
				//click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				
				//click on the first resulting lead
				
				WebElement firstId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
				
				//Exception Handle
				try {
					firstId.click();
				}
				
				catch(StaleElementReferenceException e){
					
					System.out.println("Stale Element Exception");
					driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
				}
				
				
				
				//Move to first window
				
				driver.switchTo().window(windowHandle);
				System.out.println(driver.getTitle());
				
				//click on To contact
				driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
				Set<String> windowHandles1 = driver.getWindowHandles();
				List<String> lstWindow1 = new ArrayList<String>(windowHandles1);
				String secondWindow1 = lstWindow1.get(1);
				
				driver.switchTo().window(secondWindow1);
				
				//Enter the firstname
				Thread.sleep(5000);
				driver.findElement(By.name("firstName")).sendKeys("Babu");
				
				
				//click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				
				//click on the second resulting lead
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
				
				
				//Move to first window
				
				driver.switchTo().window(windowHandle);
				
				//click Merge button
				driver.findElement(By.linkText("Merge")).click();
				
				//confirm alert
				Alert alert = driver.switchTo().alert();
				alert.accept();
				

	}

}
