Feature: Validate Get Calls using Rest Assured

  @getSingleUser @GetCall
  Scenario: To valiate whether the get API call returns user details
    Given user has the necessary details to make a get call
    When user makes a get call to find the single user 2 details
    Then user should get the 200 response along with user details
