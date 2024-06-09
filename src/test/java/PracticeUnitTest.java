import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PracticeUnitTest {
    public int actual = 100;
    int expected = 100;

    @Test
    void testAdd() {
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAdd1() {
        Assertions.assertEquals(expected, actual + 1);
    }
}
