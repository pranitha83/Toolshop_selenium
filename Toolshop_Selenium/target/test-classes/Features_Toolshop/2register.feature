Feature: Register verification

  Background: User gives correct Toolshop URL
    Given user lauch the browser
    When user gives correct Toolshop UrRL
    And user navigate to homepage
    Then user click on signin button

  Scenario: User able to register
    Given User click on register your account link
    When User able to navigate to register window
    And User enter all madetory fields on the register window and click on register button
    Then User got the success message
