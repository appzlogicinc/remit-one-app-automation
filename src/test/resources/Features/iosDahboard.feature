Feature: Beneficiary Page

Background: 
  When I launch the application
  When I ignore the poup
  When I click on Login button
  When I enter valid email and password
  When I click on confirm Login button
  Then I verify User is logged in

@dashboardPage
Scenario: Verify Dashboard page
  And I verify "Wallet" button display
  And I verify "Send Now" button display
  And I verify navigation bar is display at bottom
  And I verify Country field displayed over dashboard screen

@loadWallet
Scenario: Verify Load your wallet functionality
  When I click on "Wallet" button
  Then I verify "Wallets" Screen display  
  When I click on "Load Wallet" button
  Then I verify "Load Your Wallet" Screen display  
  And I verify text "Please fill out the relevant information and proceed to transfer funds between your wallets." present
  When I select the "USD" currency
  When I enter "1" amount in load amount field
  When I select payment method to "card"
  Then I verify text "Charges" present
  And I verify text "Amount Due" present
  And I verify text "Once a new amount is entered or payment method is changed, the changes will be recalculated" present
  When I click on "Load Wallet" button
  Then I verify "Load Your Wallet - Review" Screen display
  When I click on "Confirm Load Wallet" button
  Then I verify "Load Your Wallet - Confirm" Screen display
  And I verify "Make Payment" button display
  And I verify "Cancel Payment" button display
  When I click on "Make Payment" button
  Then I verify "Make Payment" Screen display  
  
  @moveFunds
Scenario: Verify Move funds functionality If user has no funds
  When I click on "Wallet" button
  Then I verify "Wallets" Screen display  
  When I click on "Move Funds" button
  Then I verify "Move Funds Between Wallets" Screen display
  And I verify text "Please fill out relevant information and proceed to load your wallet balance." present  
  When I select "USD" and "EUR" from dropdown
  When I enter "1" in amount field
  When I click on "Move Funds" button
  And I verify text "You cannot transfer more than your current sending wallet balance." present


  
  
    
 


  
  



  



  
  