package Hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Hello.Main.fib;
import static org.junit.jupiter.api.Assertions.*;

class FibTest {
    @Test
    public void SingleTest() {
        int fib = fib(2);
        assertEquals(1, fib);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:2"}, delimiter = ':')
    void MultiTest(int input, int expected) {
        int fib = fib(input);
        assertEquals(expected, fib);
    }
}