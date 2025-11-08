Feature: CoverFox Health Insurence test
Scenario: TC01:Validate CoverFox Health Insurence plan for single person
Given I am on Home Page
When I click on get Started button
And I click on next button
And I provide age as "34" and click on next button
And I provide pincode as "443404" and mobNumber as "8888888888" and click on continue button
Then matching Health Insurence Plans should be displayed as "48"

