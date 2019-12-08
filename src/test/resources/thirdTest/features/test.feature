  @3rd_task
  Feature: compare 2 images

  Scenario: navigate to google.com, take logo screenshot and compare to previously saved screenshot

  When I navigate to https://www.google.com/
  Then I verify that main image matches "test.jpeg" image
  And I close webdriver