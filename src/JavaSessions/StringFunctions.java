package JavaSessions;

public class StringFunctions {

    public static void main(String[] args) {

        String str = "your transaction is done successfully";
        System.out.println(str.length());//Find out length of string = 37
        System.out.println(str.charAt(0));//value of index 0
        //System.out.println(str.charAt(37));//value of index 37=StringIndexOutOfBoundsException:

        System.out.println(str.indexOf("r"));// 3 --1st occurrence of 1

        System.out.println(str.indexOf("r", str.indexOf("r")+1)); //2nd occurrence of "r"

        System.out.println(str.indexOf("done"));

        System.out.println(str.indexOf("hello"));// is string is not there return will be -1

        String username = "welcome Tom";
        if(username.indexOf("Tom")>0){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //Trim:
        String t = "  Hello  World   ";
        System.out.println(t.trim());//it will trim from corners(left and right sides)

        //replace:
        System.out.println(t.replace(" ", ""));//remove space in between worlds

        String date = "12-12-2018"; //12/12/2018
       // System.out.println(date.replace("-", "/"));

        System.out.println(dateFormat(date));

        //substring:
        //"your transaction is done successfully"
        System.out.println(str.substring(0,19));
        String st = "transaction id is 12345";
        System.out.println(st.substring(18, 23));

        //equals:
        String s1 = "Hello World";
        String s2 = "Hello world";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//ignore Lower||Upper case

        //contains:
        String name = "Welcome to Facebook";
        System.out.println(name.contains("Facebook"));

        if(name.contains("Facebook")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //split:
        String employeeData = "Tom-Collin-25-male-Infosys-Pune-QALead";
        printEmployeeData(employeeData);

        String employeeData1 = "Dan-Sharf-33-male-Comcast-Sunnyvale-SoftDev";
        printEmployeeData(employeeData1);



        String empName = getEmployeeName(employeeData);
        System.out.println(empName);



    //    System.out.println(employee[0]);//Tom
  //        for(int i = 0; i<employee.length; i++){
  //          System.out.println(employee[i]);
 //       }
    }

    public static String dateFormat(String date){
        String newDate =  date.replace("-", "/");
        return newDate;
    }

    public static void printEmployeeData(String employeeData) {
        System.out.println("========Employee Data is =========");
        String employee[] = employeeData.split("-");


        for(int i = 0; i<employee.length; i++){
            System.out.println(employee[i]);
        }
    }

    public static String getEmployeeName(String employeeData){
        System.out.println("======== Employee Full Name is ===========");
        String employee[] = employeeData.split("-");
        String employeeFullName = employee[0]+" "+employee[1];
        return employeeFullName;
    }
}
