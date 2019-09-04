Feature: Guest user actions inDemo webshop
@Sanity
Scenario: User choice to opt for an account
Given user access the signup page
And gets the credentials

@Regration
Scenario: User access to login page of the demo Webshop

Given user has valid account creds for Demowebshop
And provide the valid creds as inputs for the login process
Then veifies the state for the login status
