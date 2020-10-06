package Day16assign;

import java.util.ArrayList;
import java.util.Scanner;


public class Q2_ArrayListFirstPosition {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        String name = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 names to the list");

        for (int i = 0; i < 2; i++) {
            System.out.println("Add the name of " + (i + 1) + " user");
            name = scan.next();
            list.add(name);
        }
        System.out.println("Current List of name is below: \n" + list);
        System.out.println("add name to the first position");


        name = scan.next();
        list.add(0, name);
        System.out.println("Final List is as follows: \n" + list);
    }

}



