# ✅ Exercise 4: Arrange-Act-Assert (AAA) Pattern with Setup and Teardown in JUnit

## 📘 Scenario

This project demonstrates how to write clean, structured unit tests using:

- The **Arrange-Act-Assert (AAA)** pattern.
- `@BeforeEach` and `@AfterEach` annotations in **JUnit 5** for reusable setup and teardown logic.

---

## 📁 Files

- `Calculator.java` – Core class with basic `add()` and `subtract()` methods.
- `CalculatorTest.java` – JUnit 5 test class applying AAA and lifecycle annotations.
- `pom.xml` – Maven project file with JUnit 5 dependency.

---

## 📄 Code Summary

### `Calculator.java`

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

✅ Sample Output

Setup complete
Test finished
Setup complete
Test finished

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running CalculatorTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 sec

Results:

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
