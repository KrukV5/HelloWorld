package Hello;

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
        fib(5);
    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n-1; i++) {
            if (i % 2 == 1) {
                a = a + b;
            }
            else {
                b = a + b;
            }
        }
        return a+b;
    }
}