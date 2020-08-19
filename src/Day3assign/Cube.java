package Day3assign;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args){
        System.out.println("Provide a number for cubing");
        Scanner abc =new Scanner(System.in);

        double number = abc.nextDouble();
        System.out.println("Cube of Number is:");
        System.out.println((Math.pow(number,3.0)));
    }
}