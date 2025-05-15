@HomePage
Feature: Display home page
  I want to display home page as a landing page

  @UI @TitleCheck
  Scenario: extracting page title from home page
    Given I am at the home page
    When I try to extract page title
    Then I get the page title