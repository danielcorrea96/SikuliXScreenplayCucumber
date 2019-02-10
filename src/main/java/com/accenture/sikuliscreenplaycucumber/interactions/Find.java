package com.accenture.sikuliscreenplaycucumber.interactions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.accenture.sikuliscreenplaycucumber.utils.GetSizePantall;
import com.accenture.sikuliscreenplaycucumber.utils.PantallVisible;
import static com.accenture.sikuliscreenplaycucumber.user_interface.GoogleMapsPage.*;
import static com.accenture.sikuliscreenplaycucumber.user_interface.GooglePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Find implements Interaction {
	private String origin;
	GetSizePantall size = new GetSizePantall();
	public Find(String origin) {
        this.origin = origin;
    }	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Screen ventana = PantallVisible.getPantalla();
        try {       
            ventana.click(GOOGLE_MAPS.targetOffset(size.getXWidth(-58),size.getYHeight(-10)));
            while(ventana.exists(ICONGOOGLEMAPS) == null) { }
            ventana.paste(BARRA_BUSQUEDA_MAPS.targetOffset(size.getXWidth(-92),size.getYHeight(5)), origin);            
            ventana.click(BOTON_BUSQUEDA);
            while (ventana.exists(MENU_BUSQUEDA) == null) { }           
            while(ventana.exists(UBICACION_STAFF) == null){ }            
            ventana.rightClick(UBICACION_STAFF);
            ventana.click(OPCIONES_BUSQUEDA.targetOffset(size.getXWidth(-119),size.getYHeight(-110)));
            ventana.click(CLIC_DESTINO.targetOffset(size.getXWidth(-74),size.getYHeight(19)));
          } catch (FindFailed e) {
            e.printStackTrace();
        }      
		
	}

	public static Find directions(String origin) {
		return new Find(origin);
	}

}
