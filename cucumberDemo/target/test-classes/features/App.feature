Feature: Testing Maven Cucumber Integration

  
  Scenario: Testing the Cucumber Maven Integration
  
    Given I am adding second feature
    When I run the test from CMD
    Then The build should be successful
