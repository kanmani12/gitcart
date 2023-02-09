Feature: Search and place the order for products
@offerpage
Scenario: Search Experience for product search in home and Top Deals Page

Given User is on Greenkart Landing page
When User searches for short name "car" and extracted actual name of product
Then User searches for same short name "car" in Top Deals page
And Validate product name in top Deals page matches with Landing page
@offerpage
Scenario Outline: Search Experience for product search in home and Top Deals Page

Given User is on Greenkart Landing page
When User searches for  name <Name> and extracted actual name of product
Then User searches for same name <Name> in Top Deals page
And Validate product name in top Deals page matches with Landing page

Examples:
|Name  |
|Tom   |
|Beet  |