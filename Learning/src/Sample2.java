import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/Users/apparnaa/Documents/App Imp/Personal Se Course/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("URL: " + driver.getTitle());
		
	}
}
