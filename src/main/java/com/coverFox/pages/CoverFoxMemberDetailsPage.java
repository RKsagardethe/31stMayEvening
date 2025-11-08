package com.coverFox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverFox.Utils.Utility;



public class CoverFoxMemberDetailsPage {

	//variables
	@FindBy(id="Age-You")
	private WebElement ageDropDown;
	@FindBy(className="next-btn")
	private WebElement nextButton;
	
	//constructor
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void handleAgeDropDown(String age)
	{
		Utility.handleDropDownUsingVisibleText(ageDropDown, " "+age+ " years ");
		
	}
	
	public void clickOnNextButton()
	{
		nextButton.click();
		System.out.println("clicking on next button ");
	}
	
	
	
	
	
	
	
	
	
	
	
}
