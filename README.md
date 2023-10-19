# itbootcamp_final_selenium_project

# Selenium Test Automation Project 
https://vue-demo.daniel-avellaneda.com/

This repository contains a Java project for automating tests using Selenium WebDriver, Maven, and TestNG to test the web application (https://vue-demo.daniel-avellaneda.com/). The project follows the Page Object Model (POM) design pattern, providing a structured and maintainable framework for automating UI tests. The tests are categorized into the following sections:

- **Login Tests:** Verify user login functionality. [Login test cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/test_cases/LoginTests.md
- **Signup Tests:** Verify user signup functionality. [Signup test cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/test_cases/SignupTests.md
- **Admin Cities  Tests:** Ceration and editing new city functionality. [Admin Cities test cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/test_cases/AdminCitiesTests.md
- **Authentication Routes  Tests:** Verify the routes that require authorization. [Authentication Routes test cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/test_cases/AuthRoutesTests.md
- **Localization  Tests:** Verify lanugage change options. [Localization test cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/test_cases/LocalizationTests.md
- **Profile Tests:** Verify profile functionality. [Profile tests cases] https://github.com/acorogic/itbootcamp_final_selenium_project/blob/main/src/test/java/tests/ProfileTests.java

## Prerequisites

Before running the tests, ensure you have the following dependencies installed:

- Java Development Kit (JDK)
- Maven
- TestNG
- WebDriver compatible with your preferred browser (Chrome, Firefox, etc.)

## Test Reports

TestNG generates HTML reports that provide detailed information on test results. These reports can be found in the `test-output` directory.

## Page Objects

The project follows the Page Object Model (POM) design pattern. Page objects are located in the `src/main/java/pages` directory. You can extend or modify them to accommodate changes in the application.
