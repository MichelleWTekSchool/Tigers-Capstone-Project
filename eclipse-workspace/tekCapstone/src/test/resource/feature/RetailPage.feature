
Feature: Retail Page

 Background:
 Given User is on Retail Website
 And User Click on MyAccount
 When User click on Login
 And User enter username 'testtek@tekschool.us' and '123456' //make your own??
 And User click on Login button
 Then User should be logged in to MyAccount dashboard
 
 @Register
 Scenario: Register as an Affiliate user with Cheque Payment Method
 When User click on 'Register for an Affiliate Account' link //may not need '' wasnt like that in video
 And User fill affiliate form with below information
 |company|website      |taxID  |paymentMethod|
 |TEK    |tekschool.us |123456 |Cheque       | //make your own?
 And User check on About us check box 
 And User click on Continue button 
 Then User should see a success message 
 
 Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
 When User click on 'Edit your affiliate information link
 And user click on Bank Transfer radio button
 And User fill Bank information with below information
 |bankName|abaNumber|swiftCode|accountName|accountNumber|
 And User click on Continue button 
 Then User should see a success message 
 
 Scenario: Edit your account Information 
 When User click on ‘Edit your account information’ link 
 And User modify below information 
 |firstname|lastName|email|telephone|
 And User click on continue button 
 Then User should see a message ‘Success: Your account has been successfully updated.’
 
 
 
 
 