package com.accenture.sikuliscreenplaycucumber.step_definitions;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import com.accenture.sikuliscreenplaycucumber.questions.TheNearestRoute;
import com.accenture.sikuliscreenplaycucumber.task.EnterTo;
import com.accenture.sikuliscreenplaycucumber.task.Locate;
import com.accenture.sikuliscreenplaycucumber.user_interface.GooglePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.*;

public class GoogleMapsStepDefinitions {
	GooglePage page;	
	@Managed()	public WebDriver driver;
	private Actor user = Actor.named("user");	
	@Before 
	public void setUp() {		
		user.can(BrowseTheWeb.with(driver));
		}
	
	@Given("^the user opened the browser and placed on the (.*) page$")
	public void theUserOpenedTheBrowserAndPlacedOnTheGoogleMapsPage(String pageName) {
	    user.wasAbleTo(EnterTo.at(page, pageName));
	}
	@When("^you tries to find the distance between (.*) and the (.*)$")
	public void youTryToFindWhereIsLocatedGeneralDirectionBancolombia(String origin, String destination) {
	    user.attemptsTo(Locate.to(origin, destination));	 
	}
	@Then("^you should see the distance to which General Direction Bancolombia is located to (.*)$")
	public void youShouldSeeTheDistanceToWhichGeneralDirectorateBancolombiaIsLocated(String distance) {
		user.should((seeThat(TheNearestRoute.is(), equalTo(distance))));	    
	}
}
