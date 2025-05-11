# Selenium Test Framework

A robust, configurable Selenium test framework for web application testing.

## Overview

This framework provides a structured approach to web application testing using Selenium WebDriver. It implements the Page Object Model (POM) pattern for improved maintainability and reusability.

## Features

- Page Object Model implementation
- Configuration-driven testing
- Cross-browser support (Chrome, Firefox, Edge)
- Flexible selector strategy (ID, XPath, CSS)
- Explicit waits for improved reliability
- JUnit 5 for test execution

## Project Structure

```
├── config/
│   └── test-config.properties    # Test configuration
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           ├── pages/    # Page objects
│       │           │   ├── BasePage.java
│       │           │   ├── LoginPage.java
│       │           │   └── DashboardPage.java
│       │           ├── tests/    # Test classes
│       │           │   ├── BaseTest.java
│       │           │   └── LoginTest.java
│       │           └── utils/    # Utilities
│       │               └── ConfigReader.java
```

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Configuration

Edit the `config/test-config.properties` file to configure:

- Application URL
- Login credentials
- Element selectors
- Browser choice

```properties
# Base URL for the application
base.url=https://example.com

# Login credentials
login.username=admin
login.password=admin123

# Selectors
login.username.selector=id:username
login.password.selector=id:password
login.button.selector=id:loginButton
dashboard.selector=xpath://div[@class='dashboard']

# Browser configuration (chrome, firefox, or edge)
browser=chrome
```

### Running Tests

#### Using Maven

Run all tests:
```bash
mvn clean test
```

Run specific test class:
```bash
mvn clean test -Dtest=LoginTest
```

#### From IDE

1. IntelliJ IDEA:
   - Right-click on test class
   - Select "Run 'TestClassName'"

2. Eclipse:
   - Right-click on test class
   - Select "Run As" > "JUnit Test"

## Extending the Framework

### Adding New Page Objects

1. Create a new class extending `BasePage`
2. Add methods representing user actions on that page
3. Use the `waitForElement` method for reliable element interaction

### Adding New Tests

1. Create a new test class extending `BaseTest`
2. Instantiate page objects in test methods
3. Use page object methods to interact with the application
4. Add assertions to verify expected behavior

## Dependencies

- Selenium WebDriver
- WebDriverManager
- JUnit 5

## Things to keep in mind 

- Keep page objects focused on a single page or component
- Use descriptive method names for page actions
- Store all selectors in the configuration file
- Add appropriate waits for dynamic elements
- Keep tests independent and focused on a single feature
