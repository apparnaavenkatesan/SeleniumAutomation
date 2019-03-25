package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		System.out.println("Inside Frame ");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		String alText = alert.getText();
		System.out.println("Alert Text: " + alText);
		alert.sendKeys("Apparnaa");
		alert.accept();
		String displayText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(displayText.contains("Apparnaa"))
		System.out.println("Pass");
		else
		System.out.println("Fail");
		driver.close();
	
		
	}

}
