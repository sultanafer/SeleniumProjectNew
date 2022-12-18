package browsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsSelected_1 {

	public static void main(String[] args) {
		

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
		
		//sign in to OrangeHRM
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();*/


		//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
		//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
		driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
		boolean SaveThisOnlineIdCheckbox = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
		System.out.println(SaveThisOnlineIdCheckbox);

		//Assertion
		Assert.assertTrue(SaveThisOnlineIdCheckbox, "SaveThisOnlineId CheckBox is selected");

		//Validation
		if(SaveThisOnlineIdCheckbox==true) {
			System.out.println("The checkbox is Selected");
		}else {
			System.out.println("The checkbox is not Selected");
		}
		
		
		
		//sign in to OrangeHRM
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();*/


		//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
		//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
		driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
		boolean SaveThisOnlineIdCheckbox1 = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
		System.out.println(SaveThisOnlineIdCheckbox1);

		//Assertion
		Assert.assertTrue(SaveThisOnlineIdCheckbox1, "SaveThisOnlineId CheckBox is selected");

		//Validation
		if(SaveThisOnlineIdCheckbox1==true) {
			System.out.println("The checkbox is Selected");
		}else {
			System.out.println("The checkbox is not Selected");
		}

		driver.quit();

		//driver.quit();
	
	
		

	}

}
