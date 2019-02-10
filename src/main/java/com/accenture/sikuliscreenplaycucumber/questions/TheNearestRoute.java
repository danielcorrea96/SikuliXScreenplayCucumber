package com.accenture.sikuliscreenplaycucumber.questions;

import com.accenture.sikuliscreenplaycucumber.interactions.GetText;
import com.accenture.sikuliscreenplaycucumber.user_interface.GoogleMapsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheNearestRoute implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {	
		
		actor.attemptsTo(GetText.of(GoogleMapsPage.DISTANCE));
		return GetText.mensaje;
	}
	
	public static TheNearestRoute is () {
		return new TheNearestRoute();
	}
}
