package Hello;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static Hello.Main.fib_list;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Fib_list_Test {
    @Test
    public void SingleTest() {
        List<Integer> fib = fib_list(7);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13);
        assertEquals(expected, fib);
    }
}