package com.testleaf.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testLeaf_para.CreateAccountPage;
import com.testLeaf_para.CreateLeadPage;
import com.testLeaf_para.HomePage;
import com.testLeaf_para.LoginPage;
import com.testLeaf_para.MyAccountPage;

import com.testLeaf_para.ViewLeadPage;

import com.testLeaf_para.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass {
	
	
	@Test
	public void testLoginFunctionality() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //Thread.sleep(4000);
	 
	  LoginPage lp=new LoginPage(driver);	
	 lp.Verifylogin("DemoCSR","crmsfa");
	 
	  
	  WelcomePage wp=new  WelcomePage(driver);
	    wp.VerifyWelcomePage();
	    
	    HomePage hp=new HomePage(driver);
	     hp.VerifyHomePage();
	  
	    
	    CreateLeadPage cp=new CreateLeadPage(driver);
	    cp.VerifyCreateLeadPage("ABC", "Hema", "Mali","Direct Mail");
	    
	    
	    ViewLeadPage vw=new ViewLeadPage(driver);
	    vw.VerifyViewLeadPage();
	    
	    MyAccountPage mp=new MyAccountPage(driver);
	    mp.VerifyMyAccountPage();
	    
	    
	    CreateAccountPage ca=new CreateAccountPage(driver);
	    ca.VerifyCreateAccountPage("BCd","IND_HARDWARE");
	    
	    
	

	}
}
