package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecific_Attributes {

	ChromeDriver driver;
	//WebDriverWait wait;

	@BeforeMethod
	public void preCondition()  {
		
		// call WDM
		WebDriverManager.chromedriver().setup();

		//launch URL
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		

		//TimeOuts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		//Username and password using id locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click leads button
		driver.findElement(By.linkText("Leads")).click();

	}
	@AfterMethod(enabled=false)
	public void postCondition() {
		driver.quit();
	}

}


