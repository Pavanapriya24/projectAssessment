@Testall
Feature: In order to check if the application is working or not
Background: 
   Given an application to lauch the browser
   
   
@Test1 @Smoketest @Regressiontest
Scenario Outline: Register with valid data
When the user clicks on new tours
And click on register
And I enter "<firstName>" and "<lastName>" and "<phoneNo>" and "<Email>" and "<address>" and "<city>" and "<state>" and "<postalcode>" and "<country>"
And "<userName>" and "<password>" and "<confirmpassword>"
And click on submit button
Then it will get registed

Examples:
  |firstName|lastName|phoneNo|Email|address|city|state|postalcode|country|userName|password|confirmpassword|
  |pavana|priya|9505909202|gudapatipavanapriya@gmail.com|samisragudemwestgodavaridistrict|nidadavolu|Andhra Pradesh|534301|INDIA|priy12|123456P@|123456P@|


@Test2 @Regressiontest
Scenario: Book flights 
When user clicks on new tours
And click on flights
And select the data
And click on search
Then we will get data
 


@Test3 @Smoketest
Scenario Outline: Add customer 

When the user clicks on telecom project
And click on new customer
And enter the "<firstnamedata>" and "<lastnamedata>" and "<emaildata>" and "<addr>" and "<number>" 
And click  submit button
Then we will get a customer id

Examples:
 |firstnamedata|lastnamedata|emaildata|addr|number|
 |pavana|priya|gudapatipriya@gmail.com|samisragudem|9491722923|




@Test4
Scenario: invalid case

When the user clicks on bank project
When I enter the data from Excel "src/test/resources/Excelguru.xlsx" with SheetName "InvalidData" 
Then alert message should be displayed

@Test5 @SmokeTest
Scenario: check radio button and checkbox
When the user clicks on selenium
And click on radio demo
Then click the radio button 
And click on check box

@smoketest
Scenario Outline: To check if the Payment Gateway project is working or not.
When I click on Payment Gateway project  browser navigate to the page
   When I click on number of items "<quantity>" and click on buy and browser  navigate to the payment process page
    And I  enter "<cardnumber>" and "<month>" and "<year>" and "<cvv>"
    And I click on the place order
    Then I should get the message as orderplaced
	Examples:

     | quantity | cardnumber | month | year| cvv|
     | 3 |  2222222222222222 | 3  | 2021 | 201 |

@smoketest
Scenario Outline: To check if the Payment Gateway project is working with invalid details.
    When I click on Payment Gateway project  browser navigate to  page
    When I click on the number of items "<quantity>" and click  buy and browser  navigate to the payment process page
    And I  enter "<cardnumber>" and "<month>" and "<year>" and "<cvv>" and with some details blank
    And I click on  place order
    Then I should get error message.
	
	Examples:

     | quantity | cardnumber | month | year| cvv|
     | 2 |   | 4  | 2021 | 201 |


@smoke@sanity
Scenario Outline: To check  the Payment Gateway Credit Card limit is workingor not.
When I click on the credit card limit and enter the "<credit card number>"
And I click on submit
Then It should  navigate to the required page and  data should display.


Examples:

     | credit card number | 
     | 2222222222222222 |
     
@smoke@regression
Scenario: Click on selenium and login
  When I click selenium dropdown appears 
	And I click on login 
	And I enter login details from Excel "src/test/resources/resources/login.xlsx" with SheetName "Login" 
	And I click on signin 
	And click on icon link
	Then Required page should displayed

@regression
Scenario Outline: To check functionality of securiy project reset button
    When I click on security project
    And I enter "<Userid>" and "<Password>"
    And I click on reset
	Then It should clear the details
	
	Examples:

      | Userid | Password |
      |  priyanka7 | 1234567$  |



