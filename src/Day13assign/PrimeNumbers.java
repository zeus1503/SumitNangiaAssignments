package Day13assign;

import Day8assign.AirthmeticException;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter count of Prime Numbers needed");
            int count = s.nextInt();

            int counter = 0;
            int number = 2;

            for (int i = 0; i < count; i++) {



            }

            if (count == 1) {
                System.out.println("2");
            } else if (count == 2) {
                System.out.println("2");
                System.out.println("3");
            } else {
                while (counter != count) {

                    for (int j = 2; j < number; j++) {
                        if (number % j == 0) {
                            break;
                        } else {
                            counter = counter + 1;
                            System.out.println(number);
                        }

                        number = number + 1;

                    }

                }

            }

        } catch (Exception e) {

        }


    }
}
