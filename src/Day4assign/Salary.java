package Day4assign;
import java.util.Scanner;
import java.math.*;

import static java.lang.Math.abs;

public class Salary {
    public static void main(String[] args) {

        tax(salarycalc());
    }

    public static double salarycalc(){
        double sumsalary;

        System.out.println("Enter your Dearness Allowance (DA)");
        Scanner dear = new Scanner(System.in);
        double DA = dear.nextDouble();


        System.out.println("Enter your House Rent Allowance (HRA)");
        Scanner hra = new Scanner(System.in);
        double HRA = hra.nextDouble();

        System.out.println("Enter your Basic Salary");
        Scanner basic = new Scanner(System.in);
        double Basic = basic.nextDouble();

        sumsalary = DA + HRA + Basic;
        System.out.println("Total Salary is " + sumsalary);
        return sumsalary;
    }

    public static void tax(double sumsalary) {

        double saltotal = sumsalary;
        double tax = 0;
        double tax1 = 0;
        double tax2 = 0;

        if (saltotal <= 300000) {
            System.out.println("No Tax");
        }

        else {

            while (saltotal > 300000) {

                if (saltotal > 300000 && saltotal <= 500000) {
                    tax = (saltotal - 300000) * 0.2;
                    saltotal = saltotal - 300000;
                    System.out.println("\n");

                }

                if (saltotal > 500000 && saltotal <= 800000) {
                    tax1 = (saltotal - 500000) * 0.25;
                    saltotal = saltotal - 500000;
                    System.out.println("\n");
                }

                if(saltotal>800000) {
                    tax2 = (saltotal - 800000) * 0.3;
                    saltotal = saltotal - 800000;
                    System.out.println("\n");
                }
                double total = tax+tax1+tax2;
                System.out.println("Total tax payable is: "+ total);
            }
        }
    }
}

