Feature: price range

Scenario Verify slider functionality
Given User is on the price slider bar 
When user moves the slider to the middle position
Then Slider value should be 50% and Slider pointer should be in the middle position

Scenario Verify slider boundary values
Given User is on the price slider bar 
When user moves the slider to the min position
Then Slider value should be 0% and Slider pointer should be in the leftmost position

Scenario Verify slider boundary values
Given User is on the price slider bar 
When user moves the slider to the max position
Then Slider value should be 100% and Slider pointer should be in the rightmost position

Scenario User is on the price slider bar 
Given User is on the price slider bar 
When user moves the slider to the specific position
Then slider value shoud reflect the chosen position
