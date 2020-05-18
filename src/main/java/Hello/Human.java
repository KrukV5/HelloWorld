package Hello;

public class Human {
    static int numberOfHumans = 0;
    private String defaultTalk;

    public Human() {
        numberOfHumans++;
    }

    public Human(String s) {
        defaultTalk = s;
        numberOfHumans++;
    }

    public void talk() {
        System.out.println(defaultTalk);
    }

    public static int numberOfHumans() {
        return numberOfHumans;
    }

    public void talk(String hello_world) {
        System.out.println(hello_world);
    }
}
