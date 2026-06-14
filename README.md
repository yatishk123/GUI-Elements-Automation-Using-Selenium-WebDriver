# GUI Elements Automation Using Selenium WebDriver

## Project Overview

This project is an automation testing framework developed using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)** design pattern. The framework automates various GUI elements available on the Test Automation Practice website and validates their functionality using TestNG assertions.

**Application URL:**  
https://testautomationpractice.blogspot.com/

---

## Project Objective

The objective of this project is to automate user interactions with different GUI elements and verify that each functionality works correctly. The framework is designed to be reusable, maintainable, and easy to extend.

---

## Features

- Automates text fields (Name, Email, Phone, Address)
- Selects Gender radio buttons
- Selects Days checkboxes
- Handles Country, Colors, and Animals dropdowns
- Automates Date Picker and Date Range Picker
- Uploads files
- Handles Simple, Confirmation, and Prompt alerts
- Performs Mouse Hover action
- Performs Double Click action
- Performs Drag and Drop operation
- Moves Slider control
- Uses TestNG assertions for validation
- Captures screenshots during execution
- Generates Extent Reports

---

## Tools & Technologies

- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE
- Page Object Model (POM)
- Apache Commons IO
- Extent Reports
- Git & GitHub

---

## Project Structure

```
GUI-Elements-Automation-Using-Selenium-WebDriver
│
├── src/test/java
│   ├── base
│   │   └── BaseTest.java
│   ├── pages
│   │   └── GuiElementsPage.java
│   ├── testcases
│   │   └── GuiElementsTest.java
│   └── utilities
│       ├── ConfigReader.java
│       ├── WaitUtils.java
│       ├── ScreenshotUtil.java
│       └── ExtentReportManager.java
│
├── reports
├── screenshots
├── test-output
├── pom.xml
└── testng.xml
```

---

## Test Scenarios

- Verify Name Field
- Verify Email Field
- Verify Phone Field
- Verify Address Field
- Verify Gender Selection
- Verify Days Selection
- Verify Country Dropdown
- Verify Colors Dropdown
- Verify Animals Dropdown
- Verify Date Picker
- Verify File Upload
- Verify Alert Handling
- Verify Mouse Hover
- Verify Double Click
- Verify Drag and Drop
- Verify Slider Movement

---

## Framework Architecture

- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Maven
- Utility Classes
- Extent Reports

---

## How to Run the Project

1. Clone the repository.
2. Open the project in Eclipse.
3. Update Maven dependencies.
4. Execute `testng.xml` or `GuiElementsTest.java`.
5. View the generated Extent Report in the `reports` folder.

---

## Reports

The framework generates:

- TestNG Report
- Extent HTML Report
- Screenshots

---
## Test Cases & Expected Output

| Test Case ID | Test Scenario | Expected Output | Status |
|---------------|---------------|-----------------|--------|
| TC_001 | Verify Name Field | Name is entered successfully | ✅ Pass |
| TC_002 | Verify Email Field | Email is entered successfully | ✅ Pass |
| TC_003 | Verify Phone Field | Phone number is entered successfully | ✅ Pass |
| TC_004 | Verify Address Field | Address is entered successfully | ✅ Pass |
| TC_005 | Verify Gender Selection | Male radio button is selected | ✅ Pass |
| TC_006 | Verify Days Selection | Monday, Wednesday, and Friday are selected | ✅ Pass |
| TC_007 | Verify Country Dropdown | "India" is selected successfully | ✅ Pass |
| TC_008 | Verify Colors Dropdown | Red and Blue colors are selected | ✅ Pass |
| TC_009 | Verify Animals Dropdown | Lion is selected successfully | ✅ Pass |
| TC_010 | Verify Date Picker | Date is selected successfully | ✅ Pass |
| TC_011 | Verify Date Range Picker | Start and End dates are submitted successfully | ✅ Pass |
| TC_012 | Verify File Upload | File uploads successfully | ✅ Pass |
| TC_013 | Verify Alert Handling | Simple, Confirmation, and Prompt alerts handled successfully | ✅ Pass |
| TC_014 | Verify Mouse Hover | Hover action is performed successfully | ✅ Pass |
| TC_015 | Verify Double Click | Double-click action is performed successfully | ✅ Pass |
| TC_016 | Verify Drag and Drop | Element is dragged and dropped successfully | ✅ Pass |
| TC_017 | Verify Slider Movement | Slider moves to the expected position | ✅ Pass |

---

## Execution Result

- Total Test Cases : **17**
- Passed : **17**
- Failed : **0**
- Skipped : **0**
- Pass Percentage : **100%**

✔ All GUI elements were successfully automated and validated using Selenium WebDriver and TestNG.
✔ Screenshots were captured during execution.
✔ Extent Reports and TestNG Reports were generated successfully.
