package JavaSessions;

public class MainMethodOverLoading {

    public static void main(String[] args) {
        System.out.println("A");
        main(10);
        main(10,20);

    }

    public static void main(int a) {
        System.out.println("B");
        System.out.println(a);

    }

    public static void main(int a, int b) {
        System.out.println("C");
        System.out.println(a+b);

    }
}
