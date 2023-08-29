Feature: Gmail Test


Scenario Outline: Validate Gmail Test

Given user visit Gamil page
When user type valid "<email>" and click next
When user enter valid "<password>" and click next 
Then user should able to log in Gmail account

Examples:
|email|password|
|nashidahd489@gmail.com|pakhi786|
