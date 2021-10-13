Feature: Employee list
Scenario: Search functionality
Given i am already logged into OrangeHrm and navigates to employee list tab
When I enter the  valid employee information in employee name , employee id ,and other details
Then search must be successful.
When I enter the invalid employee information in employee name, employee id and other details
Then no records will found
