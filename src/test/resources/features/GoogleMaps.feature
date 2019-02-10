@tag
Feature: Distance from the Staff building to General Direction Bancolombia
I as a Google Maps user
I want to be able to calculate the distance from the staff building to the general direction bancolombia
To validate the distance between these two places

  
  Scenario: Distance between Staff and DG
    Given the user opened the browser and placed on the Google Maps page
    When you tries to find the distance between Edificio Staff and the Bancolombia Direccion General
    Then you should see the distance to which General Direction Bancolombia is located to 1.5km
  



