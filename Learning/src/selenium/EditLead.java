package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class EditLead {

	
//	public static void main(String[] args) throws InterruptedException {
	
	@Test(dataProvider="testDataProvider")
	public void editLeadTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Edit Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		if(text.compareTo("View Lead")==0)
			System.out.println("Correct Page Landing! ");
		else
			System.out.println("Incorrect Page Landing! ");
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("UpdatedCompany");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String updateComp = driver.findElement(By.xpath("//span[@class='tabletext' and @id='viewLead_companyName_sp']")).getText();
		if(updateComp.contains(updateComp))
		{
			System.out.println("Company Updated!");
		}
		else
			System.out.println("Update Fail!");
		driver.close();
	}

}
 