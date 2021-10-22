Feature:
  Verify different GET operations using REST-Assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    And I perform GET for the post number "1"
    Then I should see the author name as "Karthik KK"

  Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/posts"
    Then I should see the author names

  Scenario: Verify Path Parameter of Get
    Given I perform GET operation for "/posts"
    Then I should verify the GET path parameter

  Scenario: Verify Query Parameter of Get
    Given I perform GET operation for "/posts"
    Then I should verify the GET query parameter