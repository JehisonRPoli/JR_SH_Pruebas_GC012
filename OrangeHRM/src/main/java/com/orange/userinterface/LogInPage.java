package com.orange.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LogInPage {
	
	public static final Target INPUT_USERNAME = Target.the("input username").located(By.xpath("//input[@id='txtUsername']"));
	public static final Target INPUT_PASSWORD = Target.the("input password").located(By.xpath("//input[@id='txtPassword']"));
	public static final Target BTN_CONTINUE = Target.the("click continue").located(By.xpath("//input[@id='btnLogin']"));

}