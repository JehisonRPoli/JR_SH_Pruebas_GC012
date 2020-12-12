package com.orange.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.orange.userinterface.LogInPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Authenticate implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("src\\test\\resources\\url\\urls.properties"));
			actor.attemptsTo(
					Open.url(properties.getProperty("Orage.Main.Page")),
					Enter.theValue("Admin").into(LogInPage.INPUT_USERNAME),
					Enter.theValue("admin123").into(LogInPage.INPUT_PASSWORD),
					Click.on(LogInPage.BTN_CONTINUE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Authenticate withCredencials() {
		return instrumented(Authenticate.class);
	}

}
