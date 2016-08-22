Feature: Going to Shoop Extension

In order to do some good shopping
As a shopaholic
I want to login to Shoop

	Scenario Outline: Login to Shoop Extension on Chrome
		Given I go to chrome with shoop extension
		And I click on the Shoop Extension
		Then I input my <username> and <password> 
		And I click on the SignIn button
		When Sign Out button appears Sign In is confirmed
		Then Quit the browser
		
	Examples:
	   | username                      | password       |
	   | sweta.tarekar0506@gmail.com   | Sweta12	    |