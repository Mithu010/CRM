Feature: Login into application

Scenario: Positive test validating login

Given Intialize browser with mozilla
Given Navigate to url "https://www.seleniumeasy.com/"
Given Home page is populated
When User enters "username" and "password" and logsin
Then Verify that user is successfully logged in
