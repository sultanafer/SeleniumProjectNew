package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

WebDriver driver;

By MyAccountBtn= By.linkText("Create Account");

public MyAccountPage(WebDriver driver) {
 this.driver=driver;	
}

public void VerifyMyAccountPage() {
	  driver.findElement(MyAccountBtn).click();

}

}
