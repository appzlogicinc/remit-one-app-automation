Feature: Beneficiary Page

Background: 
  When I launch the application
  When I ignore the poup
  When I click on Login button
  When I enter valid email and password
  When I click on confirm Login button
  Then I verify User is logged in
  When I click on Beneficiary button present on navigation bar
  
 @addBeneficiary
Scenario: Verify User is able to add Beneficiary
  When I click on Add Beneficiary button
  Then I verify "Create Beneficiary" Screen display
  When I enter all the valid details 
      | FirstName         | olive    | 
      | LastName          | Test     | 
      | MobileNumber      | 987654321| 
      | TelephoneNumber   | 456789012| 
      | Address           | Street1  |
      | City              | test     | 
      | State             | test     |
      | Postcode          | 12345    | 
  When I Save the details
#  Then I verify benificiary has been added sucessfully
 
   @editBeneficiary
Scenario: Verify User is able to edit Beneficiary
  When I click on added benificiary
 # When I click on edit button
  Then I verify "Edit Beneficiary" Screen display
  When I update the Contact Information
      | Address           | Street2 |
      | City              | dubai   | 
      | State             | UAE     | 
  When I Save the details
  Then I verify sucessful message displayed
  
     @searchBeneficiary
Scenario: Verify User is able to search Beneficiary
  When I enter "john doe" in search beneficiary box
  Then I verify able to search the beneficiary name
  
  
  
  
  
 