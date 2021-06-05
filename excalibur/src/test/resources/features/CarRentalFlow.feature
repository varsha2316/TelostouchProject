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
Then I click transmission button of car search page
Then I close the website
