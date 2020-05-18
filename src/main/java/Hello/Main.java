package Hello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Human.numberOfHumans());
        Human pawel = new Human("czesc");
        System.out.println(Human.numberOfHumans());
        pawel.talk("Hi");
        pawel.talk();
        Human dom = new Human();
        System.out.println(Human.numberOfHumans());
        dom.talk("Hello");
        int n = 5;
        fib(n);
        fibon(n);
        fibonacci(n);
        fib_rek(n);
    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 1) {
                a = a + b;
            } else {
                b = a + b;
            }
        }
        return a + b;
    }

    public static int[] fibon(int n) {
        int[] tab = new int[n];
        int a = 0;
        int b = 1;
        tab[0] = 1;
        for (int i = 1; i < n; i++) {
            tab[i] = a + b;
            a = b;
            b = tab[i];
        }
        return tab;
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c;
        list.add(1);
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        return list;
    }

    public static int fib_rek(int n) {
        n = n - 1;
        int a = 0;
        int b = 1;
        int i = 0;
        return rek(n, a, b, i);
    }

    public static int rek(int n, int a, int b, int i) {
        if (n > 1) {
            if (i % 2 == 0) {
                a = a + b;
            } else {
                b = a + b;
            }
            n = n - 1;
            i = i + 1;
            return rek(n, a, b, i);
        }
        return a + b;
    }
}