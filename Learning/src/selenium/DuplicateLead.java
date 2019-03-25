package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Duplicate Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gayatri@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(5000);
		WebElement firstLink = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(firstLink));
		Actions builder = new Actions(driver);
		builder.moveToElement(firstLink).build().perform();
		firstLink.click();
		driver.findElement(By.xpath("//a[text()= 'Duplicate Lead']")).click();
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(title);
		if(title.contentEquals("Duplicate Lead"))
			System.out.println("Duplicate Lead Page - Verified! ");
		else
			System.out.println("Duplicate Lead Page Not found! ");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String verifyName = driver.findElement(By.xpath("//span[@class='tabletext' and @id='viewLead_firstName_sp']")).getText();
		if(verifyName.equals("Gayatri"))
		System.out.println("Duplicate Lead - Confirmed! ");
		else
			System.out.println("Duplicate Lead - Fail! ");
		Thread.sleep(5000);
		driver.close();
	}

}
