Feature: CoverFox Health Insurence test
Background:
Given I am Home Page
Given I login to application

@login
Scenario: TC01:Validate CoverFox Health Insurence plan for single person
When I click on get Started button
And I click on next button
And I provide age as "34" and click on next button
And I provide pincode as "443404" and mobNumber as "8888888888" and click on continue button
Then matching Health Insurence Plans should be displayed as "48"

@createAccount
Scenario: TC02:Validate CoverFox Car Insurence
When I click on Car Insurence button
And I provide valid RTO number and click on view quotes button
And I provide valid details and click on view quotes button
Then I should get plan details

Scenario: TC03:Validate CoverFox Bike Insurence

When I click on Bike Insurence button
And I provide valid details and click on view quotes button
Then I should get plan details
