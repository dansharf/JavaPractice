package JavaSessions;

public class DataTypes {

    public static void main(String[] args) {

        //Primitive Data Types: int, char, boolean, double
        //1. int stores 4 bytes: -2147483648 to 2147483647
        int i = 10;
        i = 20;
        int j = - 10;
        int k = 0;


        //1. int stores 4 bytes: -2147483648 to 2147483647
        // 2. byte: 1 byte:  -128 to 127
        // 3. short: 2 bytes: -32768 to 32767
        // 4. long: 8 bytes: -923337222222223232
        byte bt = 3;
        int i3 = 3;
        long l = 10;
        System.out.println(bt+i3+l);

        //5. double: 8 bytes
        double d1 = 12.33;
        double d2 = 10.34;
        double d3 = 100; //100.00
        System.out.println(d1+d2+d3);

        //6. float: 4 bytes
        //7. char: 2 bytes
        char c = 'a';
        char c1 = '1';
        char c2 = '$';
        char c3 = 'M';
        System.out.println(c+c1+c2+c3);

        //boolean: true, false
        boolean flag = true;
        boolean b = false;

        //8. String: not a data type. It's a class
        //Used to store string values:
        String s1 = "hello world";
        String s2 = "1000";
        String s3 = "12.33";
        String s4 = "M";
        System.out.println(s1+s2+s3+s4);

    }
}
