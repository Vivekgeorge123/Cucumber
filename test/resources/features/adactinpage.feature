Feature: To validate the Adactin Web Page
Scenario Outline: Verify the features of Adactin web page
Given User launch the Adactin web page Url
And User enter the valid "<username>" in the textbox
And User enter the valid "<password>" in given box and click login button
Given User select the location and hotel
And User select the room type and no of rooms
And User select the adults and children per room
And User click on search button
And User click on radio button and continue button
Given  User enter the valid "<firstname>" and "<lastname>" in the textbox
And User enter the valid "<billingAddress>" and "<creditCardNo>" in the given box
And User select the credit card type and expiry date
And User enter the valid "<cvvNumber>" in box
And User click on the Book Now button
Then User verifies the order id
Examples:
   |username|password|firstname|lastname|billingAddress|creditCardNo|cvvNumber|
   |vivekgeorge123|viv12345geo|Vivek|George|Kannikkatt, kannivayal, kerala|1234567890123456|123|




   