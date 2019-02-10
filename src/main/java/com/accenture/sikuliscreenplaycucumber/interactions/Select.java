package com.accenture.sikuliscreenplaycucumber.interactions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.accenture.sikuliscreenplaycucumber.utils.GetSizePantall;
import com.accenture.sikuliscreenplaycucumber.utils.PantallVisible;
import static com.accenture.sikuliscreenplaycucumber.user_interface.GoogleMapsPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Select implements Interaction {

	private String destiny;
	GetSizePantall size = new GetSizePantall();
	public Select(String destiny) {
		this.destiny = destiny;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Screen ventana = PantallVisible.getPantalla();		
		try {
			ventana.type(ENTRAR_DESTINO.targetOffset(size.getXWidth(-85),size.getYHeight(17)), destiny);
			ventana.click(BUSCAR_DESTINO.targetOffset(size.getXWidth(-7),size.getYHeight(-4)));
			ventana.click(WALK);
		}catch (FindFailed e) {
            e.printStackTrace();
        }		
	}
	
	public static Select a(String destiny) {
		return new Select(destiny);
	}

}
