Feature: Add Beneficiary

@regression5
Scenario: Verify user is able to add beneficiary
Given user logs in with valid credentials
When user clicks on the add beneficiary button
And user enters the required data to add beneficiary
Then user can see the beneficiary added