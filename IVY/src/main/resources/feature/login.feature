Feature: Bwin Navigations

  Scenario: Login to bwin.com
   Given open bwin home page
    When click on login button
    Then login page should open successfully
    When enter username "USERNAME" password "PASSWORD"
