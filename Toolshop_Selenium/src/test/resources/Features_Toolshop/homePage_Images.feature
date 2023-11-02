#Author:Hima
@home
Feature: Homepage center verifications
  
  #Background:
   #Given User logged into Toolshop portal URL

  @home_1
  Scenario: 
    Given user is in homepage
    When user browses through list of products
    Then user should see product images for eachitem
    
  @home_2
  Scenario: verify product is clickable
    Given user is in homepage
    When user clicks on a product image
    Then user should be directed to products details page
    
  @home_3
  Scenario: verify product has Label
    Given user is in homepage
    When user views the product image with label
    Then each image should have descriptive text as label
     
  @home_4
  Scenario: verify product has price in $
    Given user is in homepage
    When user inspects product image for price in $ value
    Then the price should be there in $ value 
    
  @home_5
  Scenario: verify total images present equals x number
    Given user is in homepage
    When user views the product images
    Then the total products present should match with x number 
    
  @home_6
  Scenario: Broken images
    Given user is in homepage
    When user views the product image links
    Then there should be no broken image links (HTTP 404 errors) 
  
  @home_7
  Scenario: verify image size and resolution
    Given user is in homepage
    When user views the product images for proper size and resolution
    Then the image should have proper size and resolution 
    
 # @home_8
  #Scenario: verify alternative text for images
   # Given user is in homepage
    #When user views the product images for alternative text
    #Then each image should have descriptive alternative text

	@home_9
  	Scenario: verify for product availability
     Given user is in homepage
     When user views the product images for stock availability
     Then product is in stock or not

  