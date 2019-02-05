package JavaSessions;

public class LoopsConcept {

    public static void main(String[] args) {

        //print 1 to 10
        //1. while loop
        int i = 1;//Initialization
        while(i<=10){//Conditional
            System.out.println(i);
            i++;//Incremental/Decremental part
        }
        System.out.println("=====================");
        //2. for loop:
        for(int j = 1; j<=10; j++){
            System.out.println(j);
        }
        System.out.println("=====================");

        //print odd numbers: 1 3 5 7 9
        for(int oddNumber=1; oddNumber<=10; oddNumber=oddNumber+2){
            System.out.println(oddNumber);
        }

        System.out.println("=====================");

        //print even numbers: 0 2 4 6 8 10
        for(int evenNumber=0; evenNumber<=10; evenNumber=evenNumber+2){
            System.out.println(evenNumber);
        }

        String string = "abc";
        for (int l = 0; l < 0; l++){
            System.out.println(l);
        }

    }
}
