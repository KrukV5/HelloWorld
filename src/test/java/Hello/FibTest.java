package Hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Hello.Main.fib;
import static org.junit.jupiter.api.Assertions.*;

class FibTest {
    @Test
    public void SingleTest() {
        int fib = fib(7);
        assertEquals(13, fib);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:2", "4:3", "5:5", "6:8", "7:13"}, delimiter = ':')
    void MultiTest(int input, int expected) {
        int fib = fib(input);
        assertEquals(expected, fib);
    }
}