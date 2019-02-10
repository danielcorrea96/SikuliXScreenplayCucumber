package com.accenture.sikuliscreenplaycucumber.task;

import com.accenture.sikuliscreenplaycucumber.exceptions.LocateException;
import com.accenture.sikuliscreenplaycucumber.interactions.CleanText;
import com.accenture.sikuliscreenplaycucumber.interactions.Find;
import com.accenture.sikuliscreenplaycucumber.interactions.Select;
import com.accenture.sikuliscreenplaycucumber.user_interface.GoogleMapsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Locate implements Task{
	
	private String origin;
	private String destination;
	
	public Locate(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }
		@Override
	public <T extends Actor> void performAs(T actor) {
		try {
		actor.attemptsTo(
	               Find.directions(origin), 
	               CleanText.on(GoogleMapsPage.BORRAR_DESTINO), 
	               Select.a(destination)
	        );
		} catch (Exception e) {
			throw new LocateException(LocateException.LOCATE_FAILED, e);
		}
	}	
	 public static Locate to(String origin, String destination) {
	        return instrumented(Locate.class, origin, destination);
	    }

}
