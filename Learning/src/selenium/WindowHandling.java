package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.urlToBe("https://www.irctc.co.in/nget/train-search"));
		driver.findElementByLinkText("AGENT LOGIN").click();
		String win1Title = driver.getTitle(); 
		System.out.println(win1Title);
		driver.findElementByLinkText("Contact Us").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lst = new ArrayList<>(windowHandles); 
		driver.switchTo().window(lst.get(1)); 
		String win2Title = driver.getTitle();
		System.out.println(win2Title);
		driver.switchTo().window(lst.get(0)).close();
		System.out.println("Window 1 closed! ");
		
		
		 
		

	}

}
