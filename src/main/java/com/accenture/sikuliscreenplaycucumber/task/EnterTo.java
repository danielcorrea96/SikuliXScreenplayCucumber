package com.accenture.sikuliscreenplaycucumber.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.sikuliscreenplaycucumber.exceptions.EnterToException;
import com.accenture.sikuliscreenplaycucumber.interactions.InitialSearch;

public class EnterTo implements Task{
	
	PageObject page;
	String pageName;
	
	public EnterTo (PageObject page, String pageName) {
		this.page = page;
		this.pageName = pageName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		try {
		actor.wasAbleTo(Open.browserOn(page));
		actor.wasAbleTo(InitialSearch.google(pageName));
		} catch (Exception e) {
			throw new EnterToException(EnterToException.OPEN_BROWSER_OR_ENTERS_FAILED, e);
		}
	}

	public static EnterTo at(PageObject page, String pageName) {
		return instrumented(EnterTo.class, page, pageName);
	}
}
