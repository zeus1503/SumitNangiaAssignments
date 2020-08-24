package Day4assign;

import java.util.Scanner;

public class Employee {

    public  void EmployeeDetail(int age, String sectionpreference){

        String newSection = "IT";

        if(age >25 && age <40){

             newSection = "Sales";
            System.out.println("Your new department is " + newSection);
        }

        else if(age >=40 && age < 50){

             newSection = "Accounts";
            System.out.println("Your new department is " + newSection);

        }

        else if (age >= 50) {
            newSection = sectionpreference;
            System.out.println("Your new department is as per your preference i.e " + newSection);
        }

    }

    public static void main(String[] args) {

        //Method variables Provided in Main method
        Employee e = new Employee();
        System.out.println("Next statement is from constructor with demo values");
        e.EmployeeDetail((int)(Math.random()*100),"Marketing" );


        //user Provided variables for EmployeeDetails method
        Employee abc = new Employee();
        System.out.println("Enter your Age");
        Scanner p = new Scanner(System.in);
        int EmpAge = p.nextInt();

        System.out.println("Enter your preferred Department");
        String EmpDept = p.next();

        abc.EmployeeDetail(EmpAge,EmpDept);

    }

}
