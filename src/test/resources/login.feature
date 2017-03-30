Feature: User able to login with valid credentials

#  Scenario: User successfully logs in with valid credentials
#
#    Given I am on home page
#    When I enter "go2automationclass@gmail.com" and "Pass2016"
#    And I click the login button
#    Then I ses "Personal apps"


  Scenario Outline: User logs in with valid and invalid credentials

    Given I am on home page
    When I enter "<username>" and "<password>"
    And I click the login button
    Then I ses valid or invalid login message

    Examples:
      | username                     | password |
      | go2automationclass@gmail.com | Pass2016 |
      | go2automationclass@gmail.com | Pass2017 |
      | automationclass@gmail.com    | Pass2016 |


