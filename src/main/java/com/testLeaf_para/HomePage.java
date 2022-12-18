package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;

By CreateLeadLink=By.linkText("Create Lead");

public HomePage(WebDriver driver) {
	this.driver=driver;
}
	
	public void VerifyHomePage() {
		driver.findElement(CreateLeadLink).click();

}
}
