Feature: Stamps Pro3


Scenario Outline: Purchase Stamps

Given visit usps 
When user click stamps & Supplies and click us flag stamp 
When user on format and click add to chart and click on check out now
When user click on check out as a Guest and able to rediect to the contact information page
When user enter "<First_Name>" and enter "<Last_Name>" and enter "<phone>" and enter "<email>" and click same as avobe box
When user enter "<address>" and enter "<address1>" enter "<city>" and select state and enter "<zip>" and clcik check out button
When user select shipping method and click confirm shipment
Then user able to see billing page 


Examples: 
|First_Name|Last_Name|phone|email|address|address1|city|zip|
|Nashid|Ahmed|3322565011|nashidahd489@gmail.com|2921 briggs ave|5C|Bronx|10458|