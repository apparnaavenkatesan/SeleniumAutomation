package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsPract {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Draggable']")).click();
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//img[@alt='logo Testleaf']"));
		WebElement dragObj = driver.findElement(By.xpath("//div[@id='draggable']"));
		act.dragAndDropBy(dragObj, 150, 175).build().perform();
		Thread.sleep(1000);
		act.dragAndDropBy(dragObj, -150, -175).build().perform();
		
		
		
		
	}

}
