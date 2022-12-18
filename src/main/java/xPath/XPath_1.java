package xPath;

import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoCSR");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		Thread.sleep(2000);
		driver.close();
	
	
	
	}

}
