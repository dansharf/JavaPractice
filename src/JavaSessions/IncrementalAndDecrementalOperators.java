package JavaSessions;

public class IncrementalAndDecrementalOperators {
    public static void main(String[] args) {

        int i = 1;
        int j = i++;// post increment. First give original value to j. Then increase the value of i.
        System.out.println(i);//2
        System.out.println(j);//1
        System.out.println("===================");

        int p = 1;
        int q = ++p;//pre increment. First increase the value then assign it to q
        System.out.println(p);//2
        System.out.println(q);//2
        System.out.println("===================");

        int m = 2;
        int n = m--;//post decrement. First give original value to n. Then decrease the value of m.
        System.out.println(m);//1
        System.out.println(n);//2
        System.out.println("===================");

        int h = 2;
        int g = --h;//pre decrement. Fist decrease h. Then give it to g.
        System.out.println(h);//1
        System.out.println(g);//1

    }
}
