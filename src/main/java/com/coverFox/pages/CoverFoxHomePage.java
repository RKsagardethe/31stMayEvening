package com.coverFox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	//private int a=10;
	
	//variables-->WebElements
	//WebElement GetStartedButton=
	//driver.findelement(By.xpath("//button[text()='get Started']"));
	@FindBy(xpath="//button[@title='Get Started']")
	private WebElement getStartedButton;
	
	//constructor
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void clickOnGetStartedButton()
	{
		getStartedButton.click();
		System.out.println("clicking on getStartedButton");
	}

}
