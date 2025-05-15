@LoginPage
Feature: Login into user account
  I want to login using the credentials of user

#user mail: sample12345@gmail.com
#user pass: sample12345

  @LoginPassCheck
  Scenario: Login with correct credentials
    Given I was in the home page
    When I click on to login option
    And I passed correct "<email>" and "<password>" credentials
    Then I should login

	Examples:
		| email 								| password |
		| sample12345@gmail.com | sample12345 |

  @LoginFailCheck
  Scenario: Login with incorrect credentials
    Given I was in the home page
    When I click on to login option
    And I passed incorrect "<email>" and "<password>" credentials
    Then I should not login
   
   	Examples:
		| email 								| password |
		| sample1234@gmail.com | sample1234 |