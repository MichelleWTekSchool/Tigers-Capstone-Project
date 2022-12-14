@capstoneRandom
Feature: Retail Page feature 
#userName: zikria.fazly@tekschool.us 
#			dummyemail1,2,3
#password: Zsoo0313$@

#what if I want to run this as scenario outline and background at the 
#same time, right now it gives a compilation error, why? 
#https://stackoverflow.com/questions/48448735/running-background-once-for-scenario-outline-examples-in-cucumber-java

Background:
	Given user is on Retail website
	When user click on MyAccount 
	And user click on Login 
	And user enter userName 'fakeEmail' and password 'fakePassword' 
	And user click on LoginButton 
	Then user should be logged in to my account dashboard 
	#	how can i use a DataFaker class to create dummy emails and pass
	#	every time this scenario runs? 
	#https://stackoverflow.com/questions/65285664/how-to-integrate-external-data-source-with-cucumber-feature-file
	
@registerAffiliateUserRandom 
#for this scenario we have to manually create one account and input the email
# and password, otherwise it will fail. 
Scenario: Register as an Affiliate user with Cheque Payment Method 
	When User click on ‘Register for an Affiliate Account’ link 
	And User fill affiliate form with below information 
		|company	|website		|taxID	|paymentMethod	|chequePayeeName|paypalEmail|
		|tekschool	tekschool.com |4534394|paypal			|ABD			|abc@xyz.com|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message 
@editAffiliateUserRandom 
Scenario: 
	Edit your affiliate information from Cheque payment method to Bank Transfer 
	When User click on ‘Edit your affiliate informationlink 
	And user click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName	|abaNumber	|swiftCode	|accountName|accountNumber	|
		|BMO Bank	|	45654	|4579797545	|savings	|9954594455		|
	And User click on Continue button1 
	Then User should see a success message1 
	
@editAccountInfoRandom	
Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	Then User modify below information 
	|firstname|lastName	|email|telephone|
	|homi|sam|homi.sam223@gmail.com|420-840-2323|
	And User click on continue button for edit account info 
	Then User should see a message ‘Success: Your account has been successfully updated.1’ 
	
