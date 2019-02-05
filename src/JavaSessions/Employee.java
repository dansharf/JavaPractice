package JavaSessions;

public class Employee {

    //class variables or global variables

    int age = 25;
    String name = "Tom";


    //data members: class variables and methods


    public static void main(String[] args) {
        int i = 10; // local variable
        System.out.println(i);

        Employee e = new Employee();//e - is object name
        Employee e1 = new Employee();



        System.out.println(e.name);
        System.out.println(e.age);
        e.salary();

        System.out.println(e1.name);//photo copy of object e
        System.out.println(e1.age);//photo copy of object e
        e1.salary();


    }

    public void salary(){
        System.out.println("employee - salary " + 1000);
    }

}
