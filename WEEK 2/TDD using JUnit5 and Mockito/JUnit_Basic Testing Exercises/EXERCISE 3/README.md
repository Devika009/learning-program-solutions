# ✅ Exercise 3: Assertions in JUnit

## 📘 Scenario

This exercise demonstrates the use of various **JUnit 5 assertions** to validate different types of results and conditions in unit tests. Assertions are used to confirm that expected outcomes match actual results during automated testing.

---

## 🔢 Java Class to Be Tested

**MathUtils.java**

```java
public class MathUtils {
    public int multiply(int a, int b) {
        return a * b;
    }

    public String greet(String name) {
        return "Hello, " + name;
    }

    public int[] getArray() {
        return new int[]{1, 2, 3};
    }

    public Object getNullValue() {
        return null;
    }
}

✅ Sample Output

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running MathUtilsTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 sec

Results:

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
