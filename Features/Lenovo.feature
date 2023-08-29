Feature: Lenovo


Scenario Outline: new account

Given user visit lenovo homepage
When user go sign in dropdown menu and click view your account and click create lenovo ID
When user click select account type and click continue with email
When user enter valid "<email>" and enter "<First_Name>" and "<Last_Name>" and enter "<pass>" and enter "<conf_pass>"
When user select reward and select email sign up and click policy
Then user click on create new id



Examples: 
|email|First_Name|Last_Name|pass|conf_pass|
|nashidahd489@gmail.com|Nashid|Ahmed|mombati123|mombati123|
