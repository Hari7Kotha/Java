#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: TurnUpPortalLogin

  @Login
  Scenario: Check if user logs into the application successfully
    Given I have launched the browser
    And I navigate to the Url
    When I entered the Username
    And I entered the Password
    And I click on the Login button
    Then I should see the home page
    And I validate with any of the button name on the home page


 