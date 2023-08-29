Feature: Account Pro2


Scenario Outline: Account signin and sign out

Given open USPS
When user click on sign in and enter valid "<user_name>" and enter valid "<password>" and click sign in button
When user should able to sing in to the account 
When user click on user name and dropdown menu and click sign out
Then user successfully sign out from account 

Examples: 
|user_name|password|
|nazim488|@Pakhi786|
