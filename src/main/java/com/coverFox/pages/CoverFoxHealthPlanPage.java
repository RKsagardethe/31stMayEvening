package com.coverFox.pages;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage {

	//encapsulation in POM class
	//data members-->private
	//variables-->WebElements
	
	@FindBy(className="next-btn")
	private WebElement nextButton;
	
	//constructor
	public CoverFoxHealthPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void clickOnNextButton()
	{
		nextButton.click();
		System.out.println("clicking on nextButton");
	}
}
