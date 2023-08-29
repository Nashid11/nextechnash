Feature: Registration Pro1


Scenario Outline: Registration Pro1

Given user visit USPS homepage
When user click on register and click on sign up 
When user select language and type new "<username>" and type new "<pw>" and retype "<re_pw>"
When user select security_question1 and type "<ans1>" and retype "<re_ans1>" and  select security_question2 and type "<ans2>" and retype "<re_ans2>" and  select account type
When user selct title and type "<First_Name>" and type "<Last_Name>" and type "<email>" and retype "<re_email>" and select type and type "<phone_number>"
When user select country and type "<street_address>"and type "<city>" and select state and type "<zip_code>" and clcik verify address
Then user able to see create account button
Examples: 
|username|pw|re_pw|ans1|re_ans1|ans2|re_ans2|First_Name|Last_Name|email|re_email|phone_number|street_address|city|zip_code|
|nashid909|@Ahmed909|@Ahmed909|salad|salad|dhaka|dhaka|Nashid|Ahmed|nashidahd489@gmail.com|nashidahd489@gmail.com|3322565011|2921 Briggs Ave|Bronx|10458|