Feature: Lenskart test case 
Scenario: TC001_Buy a lense
Given Open the chrome browser
And Maximize the browser
And Apply Wait
And Go to Lenskart website
And Mouseover on Contact Lenses 
And Click on Monthly under Explore By Disposability
And Select brand as Aqualens
And Click on the first product
And Click Buy Now
And Select No of boxes as 2 and Power as -1 for both eyes
And Type your name in User's name
And click Save and continue 
When Print total amount and click Proceed to Checkout
Then Close the Browser



