Feature: Testing TestNG Cucumber Integration

  Scenario: Check TestNG Cucumber Integeration
    Given I added testng cucumber dependency
    When I run the test from CMD
    Then The build should be successful
