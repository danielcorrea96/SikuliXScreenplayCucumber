package com.accenture.sikuliscreenplaycucumber.utils;

import org.sikuli.script.Screen;

public class PantallVisible extends Screen{

private static PantallVisible screen;
	
	private PantallVisible() {
		super();
	}
	
	public static PantallVisible getPantalla() {
		if(screen==null) {
			screen = new PantallVisible();
		}
		
		return screen;
	}
}

