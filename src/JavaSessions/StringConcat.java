package JavaSessions;

public class StringConcat {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        double c = 12.33;
        double d = 13.33;

        String x = "Hello";
        String y = "World";

        System.out.println(a+b);
        System.out.println(c+d);
        System.out.println(a+b+c+d);

        System.out.println(a+b+x);
        System.out.println(a+b+x+y);
        System.out.println(x+" "+y);//space in between words
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));

        System.out.println(x+y+a+b+c+d);
        System.out.println(x+a+b+y);
        System.out.println("the value of a is: " + a);
        System.out.println("the sum of a and b is: " + a+b);
        System.out.println("the sum of a and b is: " + (a+b));

        //ASC|| value
        //a-z: 97 to 122
        //A-Z: 65 to 90
        //0-9: 48 to 57
        char p = 'a';
        char q = 'b';
        System.out.println(p+q);


    }
}
