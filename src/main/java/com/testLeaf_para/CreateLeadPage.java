package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	
	WebDriver driver;
	
	By companyname=By.id("createLeadForm_companyName");
	By firstname=By.id("createLeadForm_firstName");
	By lastname=By.id("createLeadForm_lastName");
	By source=By.id("createLeadForm_dataSourceId");
	By MarketingCam=By.id("createLeadForm_marketingCampaignId");
	By CreateLeadBtn=By.className("smallSubmit");
	
	public CreateLeadPage(WebDriver driver) {
	       this.driver=driver;
}
	       
	       public void VerifyCreateLeadPage(String cname, String fname, String lname,String txt) {
            driver.findElement(companyname).sendKeys(cname);
	       driver.findElement(firstname).sendKeys(fname);
	       driver.findElement(lastname).sendKeys(lname);
        WebElement ele =driver.findElement(source);
        Select dd=new Select (ele);
        dd.selectByVisibleText(txt);
        
        WebElement ele1 = driver.findElement(MarketingCam);
        Select dd1=new Select(ele1);
        dd1.selectByIndex(2);
        
        driver.findElement(CreateLeadBtn).click();
}
}