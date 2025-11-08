Feature: CoverFox Health Insurence test
Scenario Outline: Validate CoverFox Health Insurence Plan for single person with multiple test data
Given I am on Home Page
When I click on get Started button
And I click on next button
And I provide age as "<age>" and click on next button
And I provide pincode as "<pincode>" and mobNumber as "<mobNumber>" and click on continue button
Then matching Health Insurence Plans should be displayed as "<result>"
Examples:
|age|pincode|mobNumber|result|
|20|443404|8888888888|50|
|25|411044|7777777777|60|
|50|411007|6666666666|70|











