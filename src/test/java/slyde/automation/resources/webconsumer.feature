Feature: Web Consumer: As a Slyde Consumer, I should be able to manage my account through Slyde Website

  Scenario: TC01 Login with valid credentials
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And Greeted with welcome message

  Scenario: TC02 Check Forgot password? link
    Given I am on Slyde Consumer Website
    Then I should see "Forgot password?" link

  Scenario: TC03 Login with blank username & password
    Given I am on Slyde Consumer Website
    When I enter blank "username" and "password"
    Then I should be displayed with error message

  Scenario: TC05 Login with invalid email address
    Given I am on Slyde Consumer Website
    When I enter invalid "username" and "password"
    Then I should be displayed with error message

  Scenario: TC06 Verify "Slyde" logo on login page
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And I should be displayed with Slyde logo

  Scenario: TC07 Signout should redirect user to login screen
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Sign Out from Menu
    Then I should be navigated to Landing Page

  Scenario: TC08 Consumer cannot register for new account through web application
    Given I am on Slyde Consumer Website
    Then I cannot register for new account

  Scenario: TC09 Verify User Avatar used during account registration is displayed
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And I should be displayed with my user avatar

  Scenario: TC10 Clicking on username displays drop down menu
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on username
    Then I should be displayed with menu drop down

  Scenario: TC11 Verify username matches the {FirstName} + {LastName} entered during account registration
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And I should be greeted with my first and last name

  Scenario: TC12 Verify that user is able to change new password
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And I should be able to change my existing password to "newpassword"
    And I should be displayed with password confirmation message "Successfully changed your password."

  Scenario: TC13 Verify that user receives an error when inputting incorrect current password when changing password
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I enter wrong current password
    Then I should be displayed with error message

  Scenario: TC14 Verify that user receives an error when new passwords does not match
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I enter non matching "newpassword" and "confirmpassword"
    Then I should be displayed with error message

  Scenario: TC15 Empty New Password & Confirm Password fields on Change Password flow
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I enter empty "newpassword" and "confirmpassword"
    Then I should be displayed with error message

  Scenario: TC16 User should not be able to use previous passwords as the password for logging in
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    And I should be able to change my existing password to "newpassword"
    When I attempt to signin with previous password then i should be blocked

  Scenario: TC17 Verify that selecting the "Sign out of Devices" option brings user to the confirmation UI
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Sign Out of all Devices from Menu
    Then I should be presented with confirmation ui to Sign Out of All Devices

  Scenario: TC18 Verify that user can cancel signing out of devices
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Sign Out of all Devices from Menu
    And I click on Cancel button
    Then I should not be signed out

  Scenario: TC19 Verify that user can sign out of all devices
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Sign Out of all Devices from Menu
    Then I should be Signed out Successfully

  Scenario: TC20 Verify that selecting the "Deactivate Account" option brings user to the confirmation UI
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Deactivate Account from Menu
    Then I should be presented with confirmation ui to Deactivate Account

  Scenario: TC21 Verify that user can deactivate his account
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Deactivate Account from Menu
    And I confirm Deactivation
    Then I should be navigated to Landing Page

  Scenario: TC22 Verify that user can cancel deactivating his account from the confirmation screen
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Deactivate Account from Menu
    And I click on Cancel button
    Then I should not be signed out

  Scenario: TC23 Verify that user cannot login with deactivated account
    Given I am on Slyde Consumer Website
    When I enter valid "username" and "password"
    Then I should be logged in successfully
    When I click on Deactivate Account from Menu
    And I confirm Deactivation
    Then I should be navigated to Landing Page
    When I attempt to login with deactivated credentials
    Then I should be displayed with error message

  Scenario: TC24 Verify that Facebook Login option is displayed on Login Page
    Given I am on Slyde Consumer Website
    Then I should be displayed with Facebook Login option

  Scenario: TC25 Verify that Facebook login is only for consumer users
    Given I am on Slyde Consumer Website
    Then I should be displayed message "Facebook login is not available for merchants to sign in."
















