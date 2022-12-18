package xPath;

import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main ");
		driver.manage().window().maximize();
		
		//Syntex://tagname[@attribute='value']
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoCSR");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		System.out.println("Login successfully");
		
		Thread.sleep(3000);
		driver.close();

	}

}
