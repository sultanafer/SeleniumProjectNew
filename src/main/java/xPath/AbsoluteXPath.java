package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoCSR");
		
	  driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[2]/input").sendKeys("crmsfa");
	  driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[3]/input").click();
	  driver.findElementByXPath("/html/body/div[2]/div[2]/div/div/div/a").click();
	  
	 // Thread.sleep(3000);
	 System.out.println(driver.getTitle());
	  
	 // driver.findElementByClassName("decorativeSubmit").click();
	  Thread.sleep(3000);

		
		driver.close();

	
	
	}

}
