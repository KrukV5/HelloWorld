package Hello;

import org.junit.jupiter.api.Test;

import static Hello.Main.fib_array;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Fib_array_Test {
    @Test
    public void SingleTest() {
        int[] fib = fib_array(7);
        int[] expected = {1, 1, 2, 3, 5, 8, 13};
        for (int i = 1; i < 4; i++) {
            assertEquals(expected[i], fib[i]);
        }
    }
}