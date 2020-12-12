package com.orange.questions;

import static com.orange.userinterface.MainPage.TR_DATA;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateData {
	
	public static Question<Boolean> withTheMessage(Target target, String message) {
		return (actor) -> 
		{return target.resolveFor(actor).getText().equals(message);};
	}
	
	public static Question<Boolean> noExistingClient() {
		return (actor) -> {
			return !TR_DATA.resolveFor(actor).isVisible();};
	}

}