Feature: CarWale Feature
Scenario: TC001_Lowest_KM_CAR
Given Open Chrome Browser 
And Load the application URL
And maximize the browser
And Apply wait
And Click on Used
And Select the City as Chennai
And Select budget min as 8 Lakhs and max as 12 Lakhs
And Click Search button
And Select Cars with Photos under Only Show Cars With
And Select Manufacturer as Hyundai
And Select Sub option for Manufacture as creta
And Select Fuel type as Petrol
And Select Best Match as KM: Low to High
And Validate the Cars are listed with KMs Low to High
And Add the Least run KM to the WhishList
And Go to Wishlist and Click on More Details
When All the details under Overview  are printed in the Same way as displayed in application
Then Close the Browser
 


