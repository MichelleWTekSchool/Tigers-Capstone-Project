@Desktops
Feature: It deals with Desktops features of Retail page

Background:
Given user is on test environment homepage
When User click on Desktops tab
And User click on show all desktops

Scenario: User verify all items are present in Desktops tab
	Then User should see all items are present in Desktop page
	
Scenario: User add HP LP 3065 from Desktops tab to the cart 
	And User click  ADD TO CART option on ‘HP LP3065’ item 
	And User select quantity one 
	And User click add to Cart button 
	Then User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’
	
	
Scenario: User add Canon EOS 5Dfrom Desktops tab to the cart
	And User click ADD TO CARToption on ‘Canon EOS 5D’item
	And User select color from dropdown ‘Red’
	And User select quantity one 
	And User click add to Cart button 
	Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’
	
Scenario: User add a review to Canon EOS 5D item inDesktops tab
	And User click on Canon EOS 5D item 
	And User click on write a review link 
	And User fill the review information with below information
	|yourname | reviewtext |
	|name | ILikeTheCanonCameraItisOneOfMyFavoriteCamera |
	And User click on Continue Button 
	Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.’