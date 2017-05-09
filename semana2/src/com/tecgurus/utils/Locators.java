package com.tecgurus.utils;

import org.openqa.selenium.By;

public class Locators {

	public static final By SEARCH_BOX_ID = By.id("navbar-query");
	public static final By SEARCH_BUTTON_ID = By.id("navbar-submit-button");
	public static final CharSequence ESO_MOVIE_INI = ("IT");
	public static final By MOVIE_RESULT_LIST = By.xpath("//h3[contains(text(),'Titles')]/following-sibling::table//tr");
	public static final By MOVIE_LINK_XPATH = By.xpath(".//a");
	public static final String RICHARD_LOCATOR = ("//table[@class='cast_list']//span[text()='Richard Thomas']");
	public static final String TIM_LOCATOR = ("//table[@class='cast_list']//span[text()='Tim Reid']");
	public static final String ANNETTE_LOCATOR = ("//table[@class='cast_list']//span[text()='Annette O'Toole']");
	public static final String FULL_CAST = ("//a[contains(text(), 'full cast')]");
	
	
	

	
	
}
