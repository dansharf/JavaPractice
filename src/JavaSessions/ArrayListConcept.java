package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {

        //ArrayList -- Dynamic Arrays
        //is a default class

        ArrayList arr = new ArrayList();//Raw type of Array. Means u can store any type of data in this ArrayList (int, String, char and exc)
        arr.add(100);//0
        arr.add(200);//1

        System.out.println(arr.size()); // current size of Arraylist

        arr.add(300);//2
        arr.add(400);//3

        System.out.println(arr.size());

        System.out.println(arr.get(2));

        arr.add(500);//4
        arr.add(600);//5
        arr.remove(3);//java will decrease size

       // System.out.println(arr.get(4));//IndexOutOfBoundsException

        //to print all the values from ArrayList: use for loop
        //ArrayList: never use <= for (for) loop
        for( int i = 0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }

        arr.add(12.33);
        arr.add("Hello");
        arr.add('$');

        //Integer ArrayList: Generics; Int, Double, Char, Boolean, String
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(100);
        arr1.add(12);


        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Ellie");
        arr2.add("Dan");



    }
}
