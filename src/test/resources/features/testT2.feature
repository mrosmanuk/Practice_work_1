  @2nd_task
  Feature: authenticate at website

  Scenario: authenticate at "https://postman-echo.com/basic-auth" and receive "authenticated:true" response

  Given I authenticate at https://postman-echo.com/basic-auth using username: postman and password: password
  Then I get "authenticated":true response