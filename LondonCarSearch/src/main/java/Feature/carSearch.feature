Feature: Cars search in London 

Scenario: Open Google and perform a search for 'Cars in London'

Given I open Google search page
When I perform a search for cars in London
Then I see GumTree results on Google page


When I click on a GumTree page link
Then the page link will be correctly displayed
