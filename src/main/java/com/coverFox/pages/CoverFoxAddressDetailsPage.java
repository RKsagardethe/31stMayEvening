package com.coverFox.pages;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	//variables
	@FindBy(xpath="(//input[@type='number'])[1]")
	private WebElement pinCodeField;
	
	@FindBy(id="want-expert")
	private WebElement mobNumField;
	
	@FindBy(className="next-btn")
	private WebElement nextButton;
	
	//constructor
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//method
	public void enterPinCode(String pincode)
	{
		pinCodeField.sendKeys(pincode);
		System.out.println("entering pin code...value is "+pincode);
	}
	
	public void enterMobNum(String mobNum)
	{
		mobNumField.sendKeys(mobNum);
		System.out.println("entering mob number...value is "+mobNum);
	}
	
	public void clickOnContinueButton()
	{
		nextButton.click();
		System.out.println("clicking on continue button");
	}
	
	
	
	
	
	
	
	
	
	
	
}
