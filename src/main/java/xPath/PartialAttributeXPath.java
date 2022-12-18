package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PartialAttributeXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver	 driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        
        //Syntex://tagname[contains@attribute,'partialValue']
        driver.findElementByXPath("//input[contains(@name,'USERN')]").sendKeys("DemoCSR");
        driver.findElementByXPath("//input[contains(@name,'PASSW')]").sendKeys("crmsfa");
        driver.findElementByXPath("//input[contains(@type,'sub')]").click();
        
        System.out.println("Successfully login by PartialAttribute Xpath ");
        Thread.sleep(4000);
        driver.close();
        

	
	
	}

}
