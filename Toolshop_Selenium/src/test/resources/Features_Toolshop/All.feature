
Feature: HomePage verification

Scenario: Verify Home sort dropdown is present
Given user is in the home page
When user validate the sort is enabled
Then User should see sort dropdown 

Scenario: Verify Home sort dropdown is clickable
Given user is in the home page
When user validate the sort dropdown is enabled
Then User should able to click sort dropdown

Scenario: Verify Home sort dropdown (A-Z)
Given user is in the home page
When user clicks on "sort(A-Z)" in sort dropdown
Then user able to view tools images in "sort(A-Z)"

Scenario: Verify Home sort dropdown (Z-A)
Given user is in the home page
When user clicks on "sort(Z-A)" in sort dropdown
Then user able to view tools images in "sort(Z-A)"

Scenario: Verify Home sort dropdown (High-Low)
Given user is in the home page
When user clicks on "sort(High-Low)" in sort dropdown
Then user able to view tools images in "sort(High-Low)"

Scenario: Verify Home sort dropdown (Low-High)
Given user is in the home page
When user clicks on "sort(Low-High)" in sort dropdown
Then user able to view tools images in "sort(Low-High)"


Scenario: Verify slider functionality
Given User is on the price slider bar 
When user moves the slider to the middle position
Then Slider value should be 50% and Slider pointer should be in the middle position

Scenario: Verify slider boundary values
Given User is on the price slider bar 
When user moves the slider to the min position
Then Slider value should be 0% and Slider pointer should be in the leftmost position

Scenario: Verify slider boundary values
Given User is on the price slider bar 
When user moves the slider to the max position
Then Slider value should be 100% and Slider pointer should be in the rightmost position

Scenario: User is on the price slider bar 
Given User is on the price slider bar 
When user moves the slider to the specific position
Then slider value shoud reflect the chosen position

Scenario: Verify Home search bar is Present
Given user is in the home page
When user validate the search bar
Then user validate the search button

Scenario: Verify Home search bar is enabled and clickable
Given user is in the home page  
When user validate the search bar is enabled
Then user validate the search button is clickable
 
Scenario Outline: Verify Home search bar with entry(common tool name)
Given user is in the home page 
When user enter common tool name without specifications and clicks the search button
			| Search |
			| Pliers |
Then displays the tools related to the search 

Scenario Outline: Verify Home search bar with entry(Specific tool name)
Given user is in the home page 
When user enter the specific tool name and clicks the search button
			| Search |
			| Thor Hammer |			
Then displays the exact tools that have been searched with ("Thor Hammer") imagetext
Scenario Outline: Verify Home search bar with entry(common tool name)
Given user is in the home page 
When user enters an invalid name in the search bar and clicks the search button
			| Search |
			| chocolate |
Then displays empty details with ("No results found.")

Scenario: Clear the seach bar
Given user is in the home page  
When user click on "X" in the search bar
Then displays all the general tools images




