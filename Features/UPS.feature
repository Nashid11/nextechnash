Feature: UPS


Scenario Outline: validate UPS create new account

Given visit UPS page
When user click United State-English and click log in buttun and clcik sign up 
When user select account type and eneter "<First_name_Last_name>" and enter "<email>" and "<phone_number>"
When user create new "<user_name>" and "<pass_word>" and clcik agrrement box and click sign up
Then user can able to create new account


Examples:
|First_name_Last_name|email|phone_number|user_name|pass_word|
|Nashid Ahmed|nashidahd489@gmail.com|3322565011|nashid909|mombati123|  








  
  
 
 
 
 
 
 
 
  
  
  
  
  
  




