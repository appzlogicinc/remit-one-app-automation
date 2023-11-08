Feature: Login Page

Background: 
  When I launch the application
  When I ignore the poup
 
 @Login @demo
  Scenario: Verify user able to login with valid credentials
  When I click on Login button
  When I enter valid email and password
  When I click on confirm Login button
  Then I verify User is logged in
  And I verify "Wallet" button display
  And I verify "Send Now" button display
  And I verify navigation bar is display at bottom
  And I verify Country field displayed over dashboard screen 

   @Login @demo
  Scenario: Verify user able to login with valid credentials
  When I click on Login button
  When I enter valid email and password
  Then I verify User is logged in

   @Logout 
  Scenario: verify user is able to logout
  When I click on Login button
  When I enter valid email and password
  When I click on confirm Login button
  Then I verify User is logged in
  When I click on More button
  When I click on Logout button
  Then I verify Logout popup display
  When I click OK to confirm
  Then I verify user is able to logged out from app
  
  
