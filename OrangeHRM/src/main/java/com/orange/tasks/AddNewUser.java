package com.orange.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.orange.userinterface.MainPage.LBL_USER_ROLE_INFO;
import static com.orange.userinterface.MainPage.LBL_EMPLOYEE_NAME_INFO;
import static com.orange.userinterface.MainPage.LBL_STATUS_INFO;

import java.util.Map;

import com.orange.questions.ValidateData;
import com.orange.userinterface.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AddNewUser implements Task{

	private Map<String, String> data;
	
	public AddNewUser(Map<String, String> data) {
		this.data = data;
	}
	//tex+aleatonio   para el nombre  concatenar donde diga data.get("USERNAME")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MainPage.LI_ADMIN_MENU),
				Click.on(MainPage.BTN_ADD_USER),
				SelectFromOptions.byVisibleText(data.get("UserRole")).from(MainPage.SLT_USER_ROLE),
				Enter.theValue(data.get("EmployeeName")).into(MainPage.INPUT_EMPLOYEE_NAME),
				Enter.theValue(data.get("Username")).into(MainPage.INPUT_USERNAME),
				SelectFromOptions.byVisibleText(data.get("Status")).from(MainPage.SLT_STATUS),
				Enter.theValue(data.get("Password")).into(MainPage.INPUT_PASSWORD),
				Enter.theValue(data.get("Password")).into(MainPage.INPUT_CONFIRM_PASSWORD),
				Click.on(MainPage.BTN_SAVE),
				Enter.theValue(data.get("Username")).into(MainPage.INPUT_SEARCH_USERNAME),
				Click.on(MainPage.BTN_SEARCH));
		actor.should(seeThat(ValidateData.withTheMessage(LBL_USER_ROLE_INFO.of(data.get("Username")), data.get("UserRole"))));
		actor.should(seeThat(ValidateData.withTheMessage(LBL_EMPLOYEE_NAME_INFO.of(data.get("Username")), data.get("EmployeeName"))));
		actor.should(seeThat(ValidateData.withTheMessage(LBL_STATUS_INFO.of(data.get("Username")), data.get("Status"))));
		actor.attemptsTo(Click.on(MainPage.CHECK_DATA.of(data.get("Username"))),
		Click.on(MainPage.BTN_DELETE),
		Click.on(MainPage.BTN_CONFIRM_DELETE));
		actor.remember("Username", data.get("Username"));
	}
	
	public static AddNewUser withCredencials(Map<String, String> data) {
		return instrumented(AddNewUser.class, data);
	}

}