@Footer
Feature: Home footer verification

  Background: User gives valid URL
    Given User launch the browser
    When User gives the valid Toolshop URL
    Then User should land on Home Page

  Scenario: Validate Footer
    Given User is in  Home Page
    When User scrolls down in home page
    Then User should  see the pagination in given format (<<,Previous disabled and 123 Next >> labels are enabled )followed by the text "This is a DEMO application (GitHub repo), used for software testing training purpose. | Privacy Policy | Banner photo by Barn Images on Unsplash."

  Scenario: Validate Next/>>
    Given User is in  Home Page
    When User scrolls down in home page
    When User click Next or >>
    Then User able to see next page

  Scenario: Validate Last page
    Given User is in  Home Page
    When User scrolls down in home page
    When User click Last page
    Then User able to see last page with Next and >> buttons are disabled

  Scenario: Validate Previous/<<
    Given User is in  Home Page
    When User scrolls down in home page
    When User click Previous or <<
    Then User able to see previous page

  Scenario: Validate Start page
    Given User is in  Home Page
    When User scrolls down in home page
    When User click Start page
    Then User able to see first page with disabled Previous,<<

  @Git
  Scenario: Validate the Github link
    Given User is in  Home Page
    When User click github link
    Then User able to see the github page opens in another browser tab

  @Policy
  Scenario: Validate Privacy Policy
    Given User is in  Home Page
    When User click Privacy Policy
    Then User able the see the privacy policy page opens in same browser tab

  Scenario: Validate BarnImages
    Given User is in  Home Page
    When User click Barn Images
    Then User able to see Barn images tab in the browser

  Scenario: Validate Unsplash
    Given User is in  Home Page
    When User click Unsplash
    Then User able to see Unsplash page in another browser tab
