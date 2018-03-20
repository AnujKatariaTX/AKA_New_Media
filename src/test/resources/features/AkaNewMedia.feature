Feature: GeneralDonation

  @AKATest
  Scenario Outline: Create a General  donation
    Given Read "<TestData>" from Excel file
    And Open AKA New Meia website
    When Navigate to the Donation page
    And Select the General donation type
    And Fill in the mandatory fields
    Then Verify the details filled
    And Verify the transaction number

    Examples: 
      | TestData  |
      | TestData1 |

  @AKATestNew
  Scenario Outline: Create a Reccuring  donation
    Given Read "<TestData>" from second Excel file
    And I open akaraisin website
    When I click on donate now button
    And I select the tribute in honour option and continue
    And I fill the mandatory details in the prompt
    And I fill tribute in-honour page
    And I add the receipients
    Then I verify the details
    And I verify the transaction code is visible

    Examples: 
      | TestData  |
      | TestData2 |
