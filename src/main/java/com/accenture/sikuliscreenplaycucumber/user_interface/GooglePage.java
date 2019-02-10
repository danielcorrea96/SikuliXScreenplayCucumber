package com.accenture.sikuliscreenplaycucumber.user_interface;

import org.sikuli.script.Pattern;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.google.com/")
public class GooglePage  extends PageObject {	
	public static final Pattern BARRA_GOOGLE = new Pattern("src/test/resources/captures/125_1920x1080/google_search.png");
	public static final Pattern GOOGLE_MAPS = new Pattern("src/test/resources/captures/125_1920x1080/google_map.png");
	public static final Pattern GOOGLE = new Pattern("src/test/resources/captures/125_1920x1080/google.png");
}
