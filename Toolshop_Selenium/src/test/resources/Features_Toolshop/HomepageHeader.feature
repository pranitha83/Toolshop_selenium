@Header
Feature: Home page Verification

  @Tag1
  Scenario: User is able to land on Home page
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should land on Home Page

  @Tag2
  Scenario: User is able to land on Home page with invalid URL
    Given User launch the browser
    When User gives the invalid Toolshop URL
    Then User should recieve 404 page not found error

  @Tag3
  Scenario: Verify for broken link
    Given User launch the browser
    When User send the bad request 
    Then HTTP response 400

  @Tag4
  Scenario: Verify the text spelling in the page
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should see correct spellings in all fields

  Scenario: Verify the logo of the Toolshop
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should see logo is properly aligned

  Scenario: Verify Home button is present
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should see Home button

  Scenario: Verify Home button is clickable
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to click the Home button

  Scenario: Verify Categories drop down is present
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to see Categories dropdown

  Scenario: Verify the Categories dropdown is clickable
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to click on Categories dropdown

  Scenario: Verify Contact button is present
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to see Contact button

  Scenario: Verify Contact button is clickable
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to click on Contact button

  Scenario: Verify Sign in button is present
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should see Sign in button

  Scenario: Verify Sign in button is clickable
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should able to click Sign in button

  Scenario: Verify the image is present
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should see image
