package aUIConcept_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		
		Actions action = new Actions(driver);
		
		//perform RightClick -contextClick 
		action.contextClick(rightclick).perform();
						
		Thread.sleep(3000);
	driver.close();

	}

}
