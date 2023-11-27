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
Then displays the tools related to the search

Scenario Outline: Verify Home search bar with entry(Specific tool name)
Given user is in the home page 
When user enter the specific tool name and clicks the search button
Then displays the exact tools that have been searched

Scenario Outline: Verify Home search bar with entry(common tool name)
Given user is in the home page 
When user enters an invalid name in the search bar and clicks the search button
Then displays empty details

Scenario: Clear the seach bar
Given user is in the home page  
When user click on "X" in the search bar
Then displays all the genearal tools images


