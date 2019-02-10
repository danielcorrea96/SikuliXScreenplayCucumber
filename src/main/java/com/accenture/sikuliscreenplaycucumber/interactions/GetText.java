package com.accenture.sikuliscreenplaycucumber.interactions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import com.accenture.sikuliscreenplaycucumber.utils.PantallVisible;
import org.sikuli.basics.Settings;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class GetText implements Interaction {
	Pattern pattern;
	public static String mensaje;
	
	public GetText(Pattern pattern) {
		this.pattern = pattern;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		Screen ventana = PantallVisible.getPantalla();
		Settings.OcrTextSearch = true;
        Settings.OcrTextRead = true;
        Region r = null;
        try {
            r = ventana.find(pattern);
            mensaje = r.text();
        } catch (FindFailed e) {
            e.printStackTrace();
        }   
       
	}
	public static GetText of(Pattern pattern) {
		return new GetText(pattern);
	}

}
