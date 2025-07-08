Feature: Guru 99 Application

  Scenario: validate  Register home page functiolity
    Given user is on Register page
    When user validate Register image
    And user validate home page text

  Scenario Outline: validate register user functiolity
    When user capture test data from "demo" excelsheet and <RowNumber>
    Then user enter firstname and lastname
    And user enter phone and email
    Then user enter address and city
    And user enter postalcode and country
    Then user enter username and password and confirmpassword
    Then user click on submit
    
     Examples:  Register Page Test Data
      | RowNumber |
      |         0 |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |         6 | 