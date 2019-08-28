Feature: Application Login

Scenario: Home page default Login
	Given User is on netbanking Landing page
	When  User login to application with username "ANU" and password "1234"
	Then Home page is populated
	And cards are displayed
	
	Scenario: Home page default Login
	Given User is on netbanking Landing page
	When  User login to application with username "Kiran" and password "4567"
	Then Home page is populated
	And cards are displayed