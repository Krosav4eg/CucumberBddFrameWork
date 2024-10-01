@Filter
Feature: Rozetka filter

  Background: Navigate to the main catalog page
    Given I navigate to home page
    And Click on close button in expo area banner

  @Test-1
  Scenario: Verify selected goods size
    When check that all goods items have size

  @Test-2
  Scenario: Check that goods tiles contains search word
#    When select name of selected product asus form filter bar
    Then goods tiles contains search word "ASUS"