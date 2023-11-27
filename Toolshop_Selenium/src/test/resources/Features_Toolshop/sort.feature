Feature sort button

Scenario Verify Home sort dropdown is present
Given user is in the home page
When user validate the sort is enabled
Then User should see sort dropdown 

Scenario Verify Home sort dropdown is clickable
Given user is in the home page
When user validate the sort dropdown is enabled
Then User should able to click sort dropdown

Scenario Verify Home sort dropdown (A-Z)
Given user is in the home page
When user clicks on "sort(A-Z)" in sort dropdown
Then user able to view tools images in "sort(A-Z)"

Scenario: Verify Home sort dropdown (Z-A)
Given user is in the home page
When user clicks on "sort(Z-A)" in sort dropdown
Then user able to view tools images in "sort(Z-A)"

Scenario Verify Home sort dropdown (High-Low)
Given user is in the home page
When user clicks on "sort(High-Low)" in sort dropdown
Then user able to view tools images in "sort(High-Low)"

Scenario Verify Home sort dropdown (Low-High)
Given user is in the home page
When user clicks on "sort(Low-High)" in sort dropdown
Then user able to view tools images in "sort(Low-High)"