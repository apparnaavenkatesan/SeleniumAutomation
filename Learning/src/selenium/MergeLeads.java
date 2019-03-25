package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter From Lead name - ");
		String from  = sc.nextLine();
		System.out.println("Enter To Lead name - ");
		String to  = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElementByPartialLinkText("Merge Le").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> win = driver.getWindowHandles();
		List<String> lst = new ArrayList<>(win);
		driver.switchTo().window(lst.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(from); 
		WebElement findLeadBtn = driver.findElementByXPath("//button[text()='Find Leads']");
		findLeadBtn.click();
		Thread.sleep(3000);
		WebElement tab1 = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]");
		tab1.click();
		driver.switchTo().window(lst.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> win1 = driver.getWindowHandles();
		List<String> lst1 = new ArrayList<>(win1);
		driver.switchTo().window(lst1.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(to);  
		Thread.sleep(3000);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]").click();
		Thread.sleep(3000);
		driver.switchTo().window(lst1.get(0));
		driver.findElementByLinkText("Merge").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(from);
		String result = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(result);
		if (result.compareTo("No records to display")==0)
			System.out.println("Merge Verified! ");
		else
			System.out.println("Merge Fail! ");
		sc.close();
		
		
		
		
		
	}
	
}
