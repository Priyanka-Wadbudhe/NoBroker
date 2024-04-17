Feature: To test the functionality of NoBroker Website

Background: 
Given User is on the homepage of NoBroker website
 
#------------------------------------------------------------------------------------------------------------------------

@Scenario1 
Scenario: Search functionality of NoBroker Website
When User selects the location from the dropdown list
And User enters and select the locality from the dropdown list
And User clicks on the option from the Property type options displayed
And User User selects BHK type from the dropdown list
And User selects the Availability from the dropdown list
And User clicks on the search button
Then User should see a list of properties matching the search criteria

#------------------------------------------------------------------------------------------------------------------------


@Scenario2
Scenario Outline: Fill out rent receipt form with various details
When User clicks on the Menu tab
And User clicks on the Rent Receipt option
And user fill out the rent receipt form with <Tenant Name>, <Owner Name>, <Tenant Phone>, <Owner Phone>, <Rent>, <Owner PAN>, <Rented Property Address>, <Owner Address>, <Receipt Start Date>, <Receipt End Date>, and <Email>
And User clicks on Generate Rent Receipt Now button
Then User should see a Congratulations message and the option to download rent receipt

Examples:
|Tenant Name|Owner Name|Tenant Phone|Owner Phone|Rent|Owner PAN|Rented Property Address|Owner Address|Receipt Start Date|Receipt End Date|Email|
|John|Nick|9988776655|9123456789|1000|ABCDE1234A|Mumbai|Delhi|19|29|abc@gmail.com|

#------------------------------------------------------------------------------------------------------------------------


@Scenario3
Scenario Outline: Payment detail form to Pay the Rent
When User clicks on the Pay Rent tab
And User selects the Payment Type from the dropdown list
And User enters "<tenant_name>" their Name
And User enters their "<tenant_phone>" Mobile Number
And User enters their "<tenant_email>" Email
And User clicks the checkbox to agree to the Terms and Conditions
And User clicks on the Get Started button
Then User should receive pop-up for entering a verification code
    
Examples:
|tenant_name|tenant_phone|tenant_email|
|abcd wxyz|9876543210|abc@gmail.com|

#------------------------------------------------------------------------------------------------------------------------


@Scenario4
Scenario: User fills out the Save Search form
When User logged in to the NoBroker website
And User navigates to the property listing page
And User clicks on the Save Search option
And User enters and selects location from the avilable options in a list
|Airoli|
And User selects the house type
And User selects the property type
And User sets the budget from min budget to max budget
And User selects the furnishing type
And User enters specific requirements
|None|
And User clicks on the Save Alert button
Then User should see relevant message

#------------------------------------------------------------------------------------------------------------------------


@Scenario5
Scenario: User fills out the Earn & Refer form
When User is logged in to the NoBroker website
And User clicks on the menu option
And User clicks on the Refer & Earn option
And User clicks on the Enter Owner Details button
And User selects the city from the dropdown list
And User enters the mobile number
|9876543210|
And User enters the Owner name
|John123!$|
And User selects the property type from the dropdown list
And User enters the detail in tell us more section
|NA|
Then User clicks on the Send Details button
|John123!$|




































#******************************************************** SEPERATE FILES ************************************************************************



#======================================================Scenario 1 - [Search]=============================================================

#Feature: To test the search functionality NoBroker Website
 #
#Scenario: Search functionality of NoBroker Website
#Given User is on the homepage of NoBroker website
#When User selects the location from the dropdown list
#And User enters and select the locality from the dropdown list
#And User clicks on the option from the Property type options displayed
#And User User selects BHK type from the dropdown list
#And User selects the Availability from the dropdown list
#And User clicks on the search button
#Then User should see a list of properties matching the search criteria








#======================================================Scenario 2 - [RentReceipt]=============================================================


#Feature: Rent Receipt Form Submission
#
#Scenario Outline: Fill out rent receipt form with various details
#Given User is on the homepage of the NoBroker website
#When User clicks on the Menu tab
#And User clicks on the Rent Receipt option
#And user fill out the rent receipt form with "<Tenant Name>", "<Owner Name>", "<Tenant Phone>", "<Owner Phone>", "<Rent>", "<Owner PAN>", "<Rented Property Address>", "<Owner Address>", "<Receipt Start Date>", "<Receipt End Date>", and "<Email>"
#And User clicks on Generate Rent Receipt Now button
#Then User should see a Congratulations message and the option to download rent receipt
#
#Examples:
#|Tenant Name|Owner Name|Tenant Phone|Owner Phone|Rent|Owner PAN|Rented Property Address|Owner Address|Receipt Start Date|Receipt End Date|Email|
#|John|Nick|9988776655|9123456789|1000|ABCDE1234A|Mumbai|Delhi|19|29|abc@gmail.com|







#======================================================Scenario 3 - [PayRent]=============================================================



#Feature: Pay Rent
#Background: 
#Given User logged in to the NoBroker website
#
#Scenario Outline: Payment detail form to Pay the Rent
#When User clicks on the Pay Rent tab
#And User selects the Payment Type from the dropdown list
#And User enters "<tenant_name>" their Name
#And User enters their "<tenant_phone>" Mobile Number
#And User enters their "<tenant_email>" Email
#And User clicks the checkbox to agree to the Terms and Conditions
#And User clicks on the Get Started button
#Then User should receive pop-up for entering a verification code
    #
#Examples:
#|tenant_name|tenant_phone|tenant_email|
#|abcd wxyz|9876543210|abc@gmail.com|



#======================================================Scenario 4 - [SaveSearch]=============================================================




#Feature: Save Search functionality on NoBroker website
#
#Scenario: User fills out the Save Search form
#Given User logged in to the NoBroker website
#When User enters and select the locality from the dropdown list
#|Vikhroli|
#And User clicks on the search button and navigates to next page
#And User clicks on the Save Search option
#And User enters and selects "<location>", "<tenant_type>", sets budget from "<min_budget>" to "<max_budget>", selects "<house_type>", "<property_type>", "<furnishing_type>", sets shifting date "<shifting_date>", and enters specific requirements "<specific_requirements>"
#|Airoli|None|
#And User clicks on the Save Alert button
#Then User should see relevant message










