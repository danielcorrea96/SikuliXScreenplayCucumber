package com.accenture.sikuliscreenplaycucumber.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.accenture.sikuliscreenplaycucumber.utils.PantallVisible;

public class CleanText implements Interaction {
	
	private Pattern imagen;
	
	public CleanText(Pattern imagen) {
		this.imagen = imagen;
	}
	
	@Override 
	public <T extends Actor> void performAs(T arg0) {

		Screen ventana = PantallVisible.getPantalla();
		try {
			ventana.hover(imagen);
			ventana.doubleClick(imagen);
			ventana.keyDown(8);
			ventana.keyUp(8);
		} catch (FindFailed e) {
			
		}
	}

	public static CleanText on(Pattern imagen) {
		return new CleanText(imagen);
	}
	
}
