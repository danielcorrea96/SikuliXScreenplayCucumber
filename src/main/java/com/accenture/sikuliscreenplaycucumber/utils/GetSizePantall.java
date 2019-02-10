package com.accenture.sikuliscreenplaycucumber.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GetSizePantall {	
	public GetSizePantall() {
		
	}
	
	public int getXWidth(int prueba) {
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	    
	    int screenWidth = screenSize.width;
	    int xEscalado = (prueba * 1920)/screenWidth;
		return xEscalado;
	}
	
	public int getYHeight(int prueba) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;		
		int yEscalado = (prueba * 1080)/screenHeight;
		return yEscalado;
		 
	}
}
