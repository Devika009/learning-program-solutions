# 📝 Exercise 1: Logging Error and Warning Messages using SLF4J

## 📘 Task

Demonstrate how to use **SLF4J** with **Logback** to log error messages and warning levels in a Java application. This example also includes a runtime exception to simulate an error scenario.

---

## 🛠 Technologies Used

- Java 8 or above
- Maven
- SLF4J API
- Logback (as SLF4J backend)
- VS Code

---

## 📂 Files

- `App.java` – Main class containing logging logic.
- `pom.xml` – Maven configuration with SLF4J and Logback dependencies.

---

## 🔢 Code Example

### `App.java`

```java
package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int result = divide(10, 0);
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred while dividing numbers: ", e);
        }

        logger.warn("This is a warning: Low disk space.");

        logger.info("Application finished.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

✅ Sample Output

INFO  com.example.App - Application started.
ERROR com.example.App - Error occurred while dividing numbers:
java.lang.ArithmeticException: / by zero
  at com.example.App.divide(App.java:20)
  ...
WARN  com.example.App - This is a warning: Low disk space.
INFO  com.example.App - Application finished.
