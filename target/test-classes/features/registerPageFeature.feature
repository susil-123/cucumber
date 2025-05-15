@RegisterPage
Feature: Register user account
  I want to register using the credentials

#user mail: sample12345@gmail.com
#user pass: sample12345

  @RegisterPageCorrectCred
  Scenario: Register with new user details
    Given I was in the home page
    When I click on to register option
    And I passed correct "<first_name>", "<last_name>", "<email>", "<telephone>", "<password>", "<confirm_password>" credentials
    Then I should be registered successfully

	Examples:
    | first_name | last_name | email                  | telephone  | password     | confirm_password |
    | John1       | Doe1       | john1.doe@gmail.com     | 9876542210 | Pass@1231     | Pass@1231         |
		

  @RegisterPageCorrectCred
  Scenario: Register with existing user details
    Given I was in the home page
    When I click on to register option
    And I passed incorrect "<first_name>", "<last_name>", "<email>", "<telephone>", "<password>", "<confirm_password>" credentials
    Then I should not be registered successfully

	Examples:
    | first_name | last_name | email                  | telephone  | password     | confirm_password |
    | John       | Doe       | john.doe@gmail.com     | 9876543210 | Pass@123     | Pass@123         |
		