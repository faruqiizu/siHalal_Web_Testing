@SIHALALPTSP
Feature: User Login
  @UserLogin
  @Positive-case
  Scenario: Login with valid email and valid password
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page

  @UserLogin
  @Negative-case
  Scenario Outline: Login with invalid data
    Given User open the website siHalal
    When User input <email> as email <pw> as password
    Then User see popup error message and message contain "Login failed"
    Examples:
      | email                 | pw            |
      | sukendarawi@gmail.com |               |
      |                       | @Bojonggede01 |
      | 1234                  |               |
      |                       | wasd          |
      |                       |               |