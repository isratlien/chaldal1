Feature: Chaldal login

  Scenario Outline: login Chaldal page
    Given login to the website
    When choose cookups
    And Search to the items '<name>'
    And click the choose items
    And order now
    Then to the next page
    Examples:
    |name|
    |fish |