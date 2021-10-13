Feature: Employee list
Scenario: Resest Functionality
Given I have already logged in OrangeHrm and navigates to employee list tab
When the employee information  details is entered
And click the reset 
Then the employee details will be reset.
When The employee information is not entered 
And click the reset
Then no change will occur



