package JavaSessions;

import java.util.ArrayList;

public class Assignments {

    public static void main(String[] args) {

        //Assignment #2. Find a highest number:

        int a = 12100;
        int b = 500;
        int c = 2500;
        int d = -1000;

        if (a > b && a > c && a > d) {
            System.out.println("a is the highest number");
        } else if (b > c && b > d) {
            System.out.println("b is the highest number");
        } else if (c > d) {
            System.out.println("c is the highest number");
        } else {
            System.out.println("d is the highest number");
        }

        System.out.println("=========================");

        //Assignment # 2
        //print 1 to 10 in reverse order using while loop
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("=========================");


        //print 1 to 10 in reverse order using for loop
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        System.out.println("=========================");

//        Declare an array of 10 values(0-100)
//        Output needs to be > 10 30 50 70 90
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        num[0] = 10;
//        num[1] = 20;
//        num[2] = 30;
//        num[3] = 40;
//        num[4] = 50;
//        num[5] = 60;
//        num[6] = 70;
//        num[7] = 80;
//        num[8] = 90;
//        num[9] = 100;

        for (int k = 0; k < num.length; k = k + 2) {
            System.out.println(num[k]);
        }

        System.out.println("=========================");

//        Declare an array from 1 - 10
//        Output > odd and even numbers
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        System.out.println("Even numbers are: ");
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] % 2 == 0) {
                System.out.println(arr[l]);
            }
        }
        System.out.println("Odd numbers are: ");
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] % 2 != 0) {
                System.out.println(arr[m]);
            }
        }

        System.out.println("=========================");

        //Assignment
        //ArrayList: Generics: define 5 types of generics, assign a values and print all values by using for loop.
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1000);
        arrInt.add(2000);
        arrInt.add(3000);
        arrInt.add(4000);
        arrInt.add(5000);

        arrInt.get(4);
        arrInt.remove(3);
        for(int n = 0; n < arrInt.size(); n++){
            System.out.println(arrInt.get(n));
        }

        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("Hello");
        arrString.add("World");

        for(int q = 0; q < arrString.size(); q++ ){
            System.out.println(arrString.get(q));
        }

        ArrayList<Character> arrChar = new ArrayList<>();
        arrChar.add('M');
        arrChar.add('&');
        arrChar.add('9');

        for( int r = 0; r < arrChar.size(); r++){
            System.out.println(arrChar.get(r));
        }

        ArrayList<Boolean> arrBool = new ArrayList<>();
        arrBool.add(true);
        arrBool.add(false);

        for(int t = 0; t < arrBool.size(); t++){
            System.out.println(arrBool.get(t));
        }

        ArrayList<Double> arrDouble = new ArrayList<>();
        arrDouble.add(12.33);
        arrDouble.add(256.963);

        for(int y = 0; y < arrDouble.size(); y++){
            System.out.println(arrDouble.get(y));
        }

        // Write 4 functions: sub, dev, multi, sum and pass variables. includes test case such 0/1



    }
}
