Feature: Bikewale feature 
Scenario: TC_001 compare two bikes
Given Launch the Chrome Browser
And Maximize the Browser
And Apply Wait
And Go to https://www.bikewale.com/
And Go to Menu
And Click New Bikes 
And Click compare bikes
And Click Add icon in Add bike1 to add first bike 
And Choose First Bike Brand as Royal Enfield
And Choose First Bike Model as Thunderbird 350
And Click Add icon in Add bike2 to add second bike 
And Choose First Bike Brand as Jawa
And Choose First Bike Model as 42
And Choose version as Dual Channel ABS - BS VI
And choose Add Bike 3
And choose brand Kawasaki 
And Choose model as Ninja 300
And Click Compare Button
When Find and Print the maximum over all rating of all the bikes and find the max
Then Close the Browser






