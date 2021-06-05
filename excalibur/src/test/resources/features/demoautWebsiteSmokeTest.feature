@smoke
Feature: Demoaut Website Smoke test

Scenario: Validate that the website opens successfully 

Given I have the website url "http://ww12.demoaut.com"
Then I launch the website
Then I validate homepage
Then I close the website
