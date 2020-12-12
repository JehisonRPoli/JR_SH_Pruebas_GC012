package com.orange.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
	
	public static final Target LI_ADMIN_MENU = Target.the("admin menu").located(By.xpath("//li[@class='main-menu-first-level-list-item'][1]"));
	public static final Target BTN_ADD_USER = Target.the("button add user").located(By.xpath("//input[@name='btnAdd']"));
	public static final Target SLT_USER_ROLE = Target.the("select user role").located(By.xpath("//select[@id = 'systemUser_userType']"));
	public static final Target INPUT_EMPLOYEE_NAME = Target.the("input employee name").located(By.xpath("//input[@class='formInputText inputFormatHint ac_input']"));
	public static final Target INPUT_USERNAME = Target.the("input username").located(By.xpath("//input[@class='formInputText']"));
	public static final Target SLT_STATUS = Target.the("select status").located(By.xpath("//select[@id='systemUser_status']"));
	public static final Target INPUT_PASSWORD = Target.the("input password").located(By.xpath("//input[@id='systemUser_password']"));
	public static final Target INPUT_CONFIRM_PASSWORD = Target.the("input confirm password").located(By.xpath("//input[@id='systemUser_confirmPassword']"));
	public static final Target BTN_SAVE = Target.the("button save user").located(By.xpath("//input[@id='btnSave']"));
	public static final Target INPUT_SEARCH_USERNAME = Target.the("button save user").locatedBy("//input[@id='searchSystemUser_userName']");	
	public static final Target BTN_SEARCH = Target.the("button search").locatedBy("//input[@id='searchBtn']");	
	public static final Target LBL_USER_ROLE_INFO = Target.the("label user role information").locatedBy("//tr[td[a[text()='{0}']]]/td[3]");
	public static final Target LBL_EMPLOYEE_NAME_INFO = Target.the("label employee information").locatedBy("//tr[td[a[text()='{0}']]]/td[4]");
	public static final Target LBL_STATUS_INFO = Target.the("label status information").locatedBy("//tr[td[a[text()='{0}']]]/td[5]");
	public static final Target CHECK_DATA = Target.the("check data").locatedBy("//tr[td[a[text()='{0}']]]/td[1]");
	public static final Target BTN_DELETE = Target.the("button delete").locatedBy("//input[@id='btnDelete']");
	public static final Target BTN_CONFIRM_DELETE = Target.the("button confirm delete").locatedBy("//input[@id='dialogDeleteBtn']");
	public static final Target TR_DATA = Target.the("tr data").locatedBy("//tr[td[a[text()='{0}']]]");
	
	
	
}