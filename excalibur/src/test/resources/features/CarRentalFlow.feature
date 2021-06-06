@acrf
Feature: Test Car Airport Car Rental flow
Scenario: Validate Airport Car Rental flow e2e
Given I have the website url "http://ww12.demoaut.com"
Then I launch the website
Then I validate homepage
Then I click "Airport Car Rental Deals" of Homepage
Then I click Visit Website
Then I validate Car rental page
Then I select country "Australia"
Then I select city "Brisbane"
Then I click Search button of Car rental page
Then I click Recommended link of car search page
Then I click deal link of car search page
Then I click next button to book the car
Then I put "firstname" as "Varsha"
Then I put "surname" as "Abhi"
Then I put "Mobile" as "9447554501"
Then I put "Email" as "varsha@gmail.com"
Then I click book button of checkoutpage
Then I close the website
