package JavaSessions;

public class ConditionalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("both are not equal");
        }

        int totalAmount = 200;
        int expectedAmount = 200;

        if (totalAmount==expectedAmount){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        int c  = 100;
        int d = 200;
        if(d>c){
            System.out.println("d is greater than c");
        }
        else{
            System.out.println("c is greater than d");
        }

        //How will identify the greatest number where 3 numbers are given?
        //WAP to find the highest number out of three numbers
        int x = 100;
        int y = 200;
        int z = 300;

        if(x>y && x>z){
            System.out.println("x is the highest number");
        }
        else if(y>z){
            System.out.println("y is the highest number");
        }
        else{
            System.out.println("z is the highest number");
        }







    }
}
