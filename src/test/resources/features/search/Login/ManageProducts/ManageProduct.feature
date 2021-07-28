@All @ManageProduct

Feature: Manage Product

  The purpose of the feature
  is to make sure
  that user is able to perform all operation of manage product  page

  Background:
    Given user is on login page
    And user click on login button and to open the login field
    And user enter username "test@nanomatrixsecure.com" and password as "testMatrix0" and click Login button
    Then home page is open

  Scenario: Open Manage Product page
    Then  user click "Manage Products" tab
    And Verify Manage Product  page is displayed

  Scenario: Add a product and generate QR CODE
    Then user click "Manage Products" tab
    And Verify Manage Product  page is displayed
    And User click on "Add Product" button
    And Fill the product name and save
    And User click on "Create" button
    Then Verify "Product Created Successfully !" is displayed
    And User click on "Create Template" button
    Then user select a template on product
    And user click on Save button
    And user enter the template name
    Then user activate the order status
    Then Verify "Template status has been updated successfully" is displayed