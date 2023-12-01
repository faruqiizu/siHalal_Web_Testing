Feature: Certification Page
  @CertificationPage
  @Positive-case
  Scenario: Certification button validation on home page
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page
    Then User click Sertifikasi button
    And User see popup menu of the certification feature

  @CertificationPage
  @Positive-case
  Scenario: Pelaku Usaha button validation on certificaion feature
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page
    Then User click Sertifikasi button
    And User see popup menu of the certification feature
    Then User click Pelaku Usaha
    And User already on Pelaku Usaha page

  @CertificationPage
  @Positive-case
  Scenario: Edit button validation on Pelaku Usaha page
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page
    Then User click Sertifikasi button
    Then User click Pelaku Usaha
    Then User click Edit button
    And User already on Edit Pelaku Usaha page

  @CertificationPage
  @Positive-case
  Scenario: TextBox validation on Penanggung Jawab
    Given User open the website siHalal
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page
    Then User click Sertifikasi button
    Then User click Pelaku Usaha
    Then User click Edit button
    And User already on Edit Pelaku Usaha page
    Then User click on text box
    And User can type in the text box "FARUQI" as a name