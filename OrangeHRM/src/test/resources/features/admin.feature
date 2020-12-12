Feature: Admin user test
  I want to verify add and delete users with admin account

  @tag
  Scenario Outline: add user
    Given log in on main page
    When create a new user
    	| UserRole	 | EmployeeName	 | Username   | Status 	 | Password   |
		| <UserRole> | <EmployeeName>| <Username> | <Status> | <Password> |
    Then must visualice
    
    Examples:
    	| UserRole | EmployeeName | Username | Status 	| Password	  |
    	| Admin	   | Aaliyah Haq  | testingtest   | Enabled  | Contra1427* |