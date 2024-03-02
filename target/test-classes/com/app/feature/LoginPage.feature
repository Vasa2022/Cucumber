@tag
Feature: Login Page Exe

  @tag1 @tag_Smoke
  Scenario: Valid Username and Password
    When Enter the username "Aiite"
    And Enter the password "12334"
    And Click the LoginButton
    Then Validate the pageTitle

  @tag1
  Scenario: Invalid Username and Password
    Given Login to Application
    When Enter the username "Aiite"
    And Enter the password "12334"
    And Click the LoginButton
    Then Validate the pageTitle

  @tag2
  Scenario Outline: Invalid Username and Password
    Given Login to Application
    When Enter the username "<username>"
    And Enter the password "<password>"
    And Click the LoginButton
    Then Validate the pageTitle

    Examples: 
      | username | password |
      | Aiite1   | AAitbjj  |
      | Aiite2   | AAitbjj  |
      | Aiite3   | AAitbjj  |

  @Tag3_List
  Scenario: Invalid Username and Password
    Given Login to Application
    When Enter the user
      | Aiite1 |
      | Aiite2 |
      | Aiite3 |

  #And Enter the password "12334"
  #And Click the LoginButton
  #Then Validate the pageTitle
  @Tag3_Lists
  Scenario: Invalid Username and Password
    Given Login to Application
    When Enter the user
      | test1 | Aiite1 |
      | test2 | Aiite2 |
      | test3 | Aiite3 |

  @Tag3_Map
  Scenario: Invalid Username and Password
    Given Login to Application
    When Enter the user
      | username | Aiite1 |
      | password | Aiite2 |
      | user     | Aiite3 |
