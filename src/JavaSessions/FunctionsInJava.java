package JavaSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FunctionsInJava {

    public static void main(String[] args) {

        FunctionsInJava obj = new FunctionsInJava();
        obj.test();

        String s1 = obj.getName();
        System.out.println(s1);

        int c1 = obj.sum();
        System.out.println(c1);

        ArrayList<String> arr1 = obj.getStudentNames();
        System.out.println(arr1);

        int marks[] = obj.getMarks();
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        int d = obj.division(10,30);
        System.out.println(d);

        int d1 = obj.division(10,50);
        System.out.println(d1);

        String country = obj.getCountryName("New York");
        System.out.println(country);


    }

    //functions are parallel to each other -- INDEPENDENT TO EACH OTHER
    //can not create a function inside a function
    //duplicate functions are not allowed



    //1. no input & no return
    //void -- no return -- can not return any value
    //Method overloading: within a class we have different function/methods having
    // the same name but different parameters
    public void test(){  //0 parameter
        System.out.println("test method");
    }

    public void test(int a){  //1 parameter - overloading method
        System.out.println("test method");
    }

    public void test(int a, int b){  //2parameter - overloading method
        System.out.println("test method");
    }

    public void test(int a, String b){  //2 parameter - overloading method
        System.out.println("test method");
    }

    //2. no input but some return:
    //void & return can not be together
    public String getName(){
        System.out.println("get name method");
        String s = "Selenium";
        return s;
    }

    public int sum(){
        System.out.println("sum method");
        int a = 10;
        int b  = 20;
        int c = a + b;
        return c;
    }

    public ArrayList<String> getStudentNames(){
        System.out.println("getStudentNames methods");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Tom");
        arr.add("Tim");
        arr.add("Dan");
        return arr;
    }

    public int[] getMarks(){
        System.out.println("get marks method");
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 7;
        marks[2] = 9;

        return marks;
    }

    //3. Some inputs & some return
    public int division(int x, int y){
        System.out.println("div method");
        int div = y/x;
        return div;
    }

    public String getCountryName(String cityName){
        System.out.println("getCountryName method");
        if(cityName.equals("Bangalore")){
            return "Country name is India for city " + cityName;
        }
        else if(cityName.equals("London")){
            return "Country name is UK for city " + cityName;
        }
        else if(cityName.equals("New York")){
            return "Country name is USA for city " + cityName;
        }
        //else{
            System.out.println("city is not found");
        //}
        return cityName + "will be added later, currently data is not available";
    }




}
