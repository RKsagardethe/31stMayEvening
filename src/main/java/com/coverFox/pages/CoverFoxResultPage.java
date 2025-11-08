package com.coverFox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {

	//variables-->WebElements
	@FindBy(xpath="//div[contains(text(),'Insurance Plans')]")
	private WebElement matchingResult;
	
	//constructor
	public CoverFoxResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public String getMatchingResultNumber()
	{
		String result = matchingResult.getText();
		System.out.println("fetching matching result");
		String[] temp = result.split(" ");
		String finalResult = temp[0];
		return finalResult;
	}
}
