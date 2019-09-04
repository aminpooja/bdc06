Feature: parametrize demo

  Background: launch url to open the demowebshop app
    Given user must launch the url
    Then click on login

  Scenario Outline: to check multiple login

    Given the email is "<email>" and the password is "<pswd>" must be given by user
    And click on login button to get logged in

    Examples:
      | email                | pswd      |
      | poojaravi@gmail.com  | pooja123  |
      | ttraju2000@gmail.com | numbernot |
