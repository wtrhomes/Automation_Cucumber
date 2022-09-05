@BackgroundFeature 
Feature: Validate background colors 

@scenario1  
Scenario: 1
1 User should be able to click on skyBlue background button and the background color will change to skyblue 
	Given user is on the "https://techfios.com/test/101/" page 
	When user clicks skyblue background button
	Then the background should turn skyblue
	
@smoke
Scenario: 2
1 User should be able to click on white background button and the background color will change to white 
	Given user is on the "https://techfios.com/test/101/" page 
	When user clicks white background button 
	Then the background should turn white 