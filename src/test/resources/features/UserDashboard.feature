@SIHALALPTSP
Feature: User Dashboard
  @UserDashboard
  @Positive-case
  Scenario: Dashboard button validation on home page
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    Then User click button dashboard
    And User already on dashboard page