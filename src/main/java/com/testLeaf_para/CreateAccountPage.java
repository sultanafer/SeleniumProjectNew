package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

WebDriver driver;

By accountname=By.id("accountName");
By industry=By.name("industryEnumId");



public CreateAccountPage(WebDriver driver) {
	this.driver=driver;
	
	
}

public void VerifyCreateAccountPage(String aname, String Val){
	driver.findElement(accountname).sendKeys(aname);

	
	WebElement ele=driver.findElement(industry);
	Select dd=new Select(ele);
	dd.selectByValue(Val);
}

}
