package browsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsEnable {

	public static void main(String[] args) {
		
		/*WebDriver driver;

		WebDriverManager.chromedriver().setup();*/
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");

WebDriver driver = new ChromeDriver();

//maximize the window
driver.manage().window().maximize();

//Load url		
//driver.get("https://opensource-demo.orangehrmlive.com/");
driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

//get title of the page
//System.out.println(driver.getTitle());
String title = driver.getTitle();
System.out.println(title);

//Assertion
//Assert.assertEquals(title,"Bank of America | Online Banking | Sign In | Online ID", "Asserting page Title");
Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Verifiy page title");

//isDisplayed(); -"Bank of America" Logo is displayed (true/false)
boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
System.out.println(logo);
//Assertion
Assert.assertTrue(logo, "logo is displayed");

//isEnabled() -Get The App link is Enable(true/false)
boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
if(getTheAppLink==true) {
	System.out.println("The Get the App link is Enabled");
}else {
	System.out.println("The Get the App link is not Enabled");


	
	}

}
}
