package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextBaseXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//Syntax://tagname[text()='text of code' //note:text=text of code
		driver.findElementByXPath("//a[text()='Demos']").click();
        driver.findElementByXPath("//a[text()='Draggable']").click();
        driver.findElementByXPath("//h1[text()='Draggable']").click();
        
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);
        driver.close();
		


	
	
	
	}

}
