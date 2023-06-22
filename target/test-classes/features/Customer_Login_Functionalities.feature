Feature: Customer_The_Login_Functionalities

Scenario: Verify the Customer Login Functionalities
Given I am in the landing page
When I click in the Login menu
Then I click in the Customer Login menu
Then I enter the UserId david@gmail.com
And I enter the password 1234
And I click in the login button
Then I verify that i am in the home page