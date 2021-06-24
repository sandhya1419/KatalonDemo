Feature: Test Search functionality

  @Smoke
  Scenario Outline: Check search is successful for a valid product
    Given user launch the webiste
    When user enter the <product>
    And clicks on search button
    Then user is naviagted to results page

    @P1
    Examples: 
      | product |
      | macbook |

    @P2
    Examples: 
      | product |
      | Dell    |
