Feature: Login Page

Background: 
When I launch the application
Then I verify Splash Screen display

  @Regression1
  Scenario: Verify user able to click on login button
 When I click on Login button
 Then I verify Login Screen display
 
 @Regression
  Scenario: Verify user able to login with valid credentials
 When I enter valid email and password
 Then I verify User is logged in

  