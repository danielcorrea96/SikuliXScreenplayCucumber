package com.accenture.sikuliscreenplaycucumber.interactions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.accenture.sikuliscreenplaycucumber.utils.GetSizePantall;
import com.accenture.sikuliscreenplaycucumber.utils.PantallVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static com.accenture.sikuliscreenplaycucumber.user_interface.GooglePage.*;
public class InitialSearch implements Interaction{

	private String pageName;
	GetSizePantall size = new GetSizePantall();
	public InitialSearch(String pageName) {
        this.pageName = pageName;
    }
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Screen ventana = PantallVisible.getPantalla();
        try {        
        	System.out.println(size.getXWidth(-256));
            ventana.type(BARRA_GOOGLE.targetOffset(size.getXWidth(-263),size.getYHeight(-9)), pageName + Key.ENTER);
            while(ventana.exists(GOOGLE) == null) {  }
        }
        catch (FindFailed e) {
            e.printStackTrace();
        }		
	}
	
	public static InitialSearch google(String pageName) {
		return new InitialSearch(pageName);
	}
	

}
