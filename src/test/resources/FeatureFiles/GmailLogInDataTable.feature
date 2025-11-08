Feature: Study data table in BDD 
Scenario: Test Gmail Login
Given I am on login page
When I provide details and click on login button 
|userName|password|msg|
|test123|1234|WELCOME|-->list 1
|test789|6789|THANK YOU|-->list 2
Then I should navigate to inbox
