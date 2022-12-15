Feature: Retail Account Page

  Background: 
    When User click on Sign in option
    And User enter email 'sameer.temori2100@gmail.com' and password 'Tek@44556'
    And User click on login button
    And User should be logged in into Account
    And User click on Account option

  @Test3
  Scenario: Verify User can update Profile Information
    And User update Name 'Samir Timory' and Phone '202-123-1234'
    And User click on Update button
    Then user profile information should be updated

  @Test4
 # Scenario: Verify User can Update password
 #   When User click on Account option
 #   And User enter below information
 #     | previousPassword | newPassword | confirmPassword |
 #     | Tek@223356       | Tek@44556   | Tek@44556       |
 #   And User click on Change Password button
 #   Then a message should be displayed 'Password Updated Successfully'

  @Test5
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 5677234900017843 | Samir Timory |              10 |           2025 |          708 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @Test6
  Scenario: Verify User can edit Debit or Credit card
    And User click on card ending in '7843'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5677234901897812 | Samir Jan  |               7 |           2024 |          124 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @Test7
  Scenario: Verify User can remove Debit or Credit card
    And User click on Debit card ending in '7812'
    And User click on remove option of card section
    Then payment details should be removed

  @Test8
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress  | apt | city     | state    | zipCode |
      | United States | Samir Timory |  2409874673 | 14 Main Street |  13 | Sterling | Virginia |   20078 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @Test9
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress    | apt | city         | state | zipCode |
      | Afghanistan | Ahmad T  |  2409874123 | 1254 Main Street |   1 | Falls Church | Kabul |   20009 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

	@Test10
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed