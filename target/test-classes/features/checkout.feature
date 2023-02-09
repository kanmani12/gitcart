Feature: place the order for products
@placeorder
Scenario Outline: Search Experience for product search in home and Top Deals Page

Given User is on Greenkart Landing page
When User searches for  name <Name> and extracted actual name of product
And Added"3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items is in checkout page 
And verify user has ability to enter promocode and place the order

Examples:
|Name  |
|Tom   |

