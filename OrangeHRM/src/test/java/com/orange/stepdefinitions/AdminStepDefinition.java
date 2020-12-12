package com.orange.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.orange.userinterface.MainPage.TR_DATA;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.orange.questions.ValidateData;
import com.orange.tasks.AddNewUser;
import com.orange.tasks.Authenticate;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AdminStepDefinition {
	
	private Actor actor = Actor.named("Administrator");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;
	
	@Before
	public void configuracioInicial() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^log in on main page$")
	public void logInOnMainPage(){
		actor.attemptsTo(Authenticate.withCredencials());
	}

	@When("^create a new user$")
	public void createANewUser(List<Map<String, String>> data){
		actor.attemptsTo(AddNewUser.withCredencials(data.get(0)));
	}

	@Then("^must visualice$")
	public void mustVisualice(){
		actor.should(seeThat(ValidateData.noExistingClient()));
	}

}