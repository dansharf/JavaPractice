package JavaSessions;

public class StaticNonStatic {

    String studentName = "Tom";
    int age = 25;
    static String schoolName = "Xavier";

    public static void main(String[] args) {
        //1. how to call static stuff (static variables + methods):
        //a. direct calling: by Sout
        System.out.println(schoolName);
        fee();

        // b. by using class name:
        StaticNonStatic.fee();
        System.out.println(StaticNonStatic.schoolName);
        System.out.println(TestUtil.noOfDays);
        System.out.println(TestUtil.noOfMonths);

        System.out.println(TestUtil.noOfMonths);
        System.out.println(TestUtil.noOfDays);
        TestUtil.getName();

        //2. non static
        StaticNonStatic obj = new StaticNonStatic();
        System.out.println(obj.studentName);
        System.out.println(obj.age);
        System.out.println(obj.studentName);

    }

    public void sendMail(){
        System.out.println("send mail method");
    }

    public static void fee(){
        System.out.println("fee method");
    }
}
