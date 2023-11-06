Feature: Logout process

@regression4
Scenario: Verify User is able to logout
Given the user is logged in with valid details
When the user clicks on the logout button
Then a confirmation message should be displayed
And the user is able to logout