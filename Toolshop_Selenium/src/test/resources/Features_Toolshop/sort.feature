Feature: sort button

Given user clicks on sort dropdown
When user clicks on Name(A-Z)
Then user able to view tools images in the alphabetical order

Given user clicks on sort dropdown
When user clicks on Name(Z-A)
Then user able to view tools images in the reverse alphabetical order

Given user clicks on sort dropdown
When user clicks on price (High-Low)
Then user able to view tools images in price High to low

Given user clicks on sort dropdown
When user clicks on price (Low-High)
Then user able to view tools images in Low to High