  @3rd_task
  Feature: compare 2 images

  Scenario: navigate to google.com, take logo screenshot and compare to previously saved screenshot

  When I navigate to https://www.google.com/
  #Use test.jpeg for positive test scenario and test_fail.jpeg for negative test scenario
  Then I verify that main image matches test.jpeg image with 20% threshold