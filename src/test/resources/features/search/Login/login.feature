Feature: login test

 Scenario: verify that user is able to login
  Given I’m a logged in system user
  Then Dashboard page is displayed
   #And user click on the "New Portal" tab
   #Then user can see the new portal

  Scenario: verify that user is able to login account
   Given user is on login page
   And user click on login button and to open the login field
   And user enter username "test@nanomatrixsecure.com " and password as "testMatrix0" and click Login button
   Then home page is open
   And I’m on the order page
   #And I am able to add the information needed to create a order
   #Then Verify Order created

