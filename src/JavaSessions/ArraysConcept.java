package JavaSessions;

public class ArraysConcept {
    public static void main(String[] args) {

        //TWO major dis-advantages:
        //1. Only similar types of data: to resolve this problem, we use Object array. Object is a class
        //2. Size is fixed: static array: to overcome this problem, we use dynamic arrays -- ArrayList.

        //1. int array
        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        // System.out.println(i[4]);//ArrayIndexOutOfBoundsException: 4

        System.out.println(i[0] + i[1]);
        System.out.println(i.length);//size of array

        //to print all the values of array: use for loop
        for (int k = 0; k < i.length; k++) {
            System.out.println(i[k]);
        }
        //or
        for (int k = 0; k <= i.length - 1; k++) {
            System.out.println(i[k]);
        }

        //2. double:
        double d[] = new double[2];
        d[0] = 12.33;
        d[1] = 13.44;

        //3. char:
        char c[] = new char[2];

        //4. String:
        String s[] = new String[3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "Test";

        //5. Object Array
        Object ob[] = new Object[4];
        ob[0] = "Tom";
        ob[1] = 25;
        ob[2] = 12.33;
        ob[3] = 'M';
    }
}
