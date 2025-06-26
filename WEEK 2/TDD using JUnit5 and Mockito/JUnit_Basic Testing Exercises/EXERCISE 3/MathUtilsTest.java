import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils utils = new MathUtils();

    @Test
    void testMultiply() {
        assertEquals(20, utils.multiply(4, 5));
    }

    @Test
    void testGreet() {
        assertTrue(utils.greet("Devika").contains("Hello"));
    }

    @Test
    void testArrayEquality() {
        assertArrayEquals(new int[]{1, 2, 3}, utils.getArray());
    }

    @Test
    void testNotNull() {
        assertNotNull(utils.greet("Devika"));
    }

    @Test
    void testNullValue() {
        assertNull(utils.getNullValue());
    }
}
