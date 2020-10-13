package Day16assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q7_ArrayCopy {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        String name="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of enteries to be added in list");

        int count=scan.nextInt();
        for(int i=0;i<count;i++) {
            System.out.println("Add the value of "+(i+1)+" entry");
            name=scan.next();
            list1.add(name);
        }


        System.out.println("The value of list1 are : \n"+list1);
        list2.addAll(list1);
        System.out.println("The values in copied list are: \n"+list2);
    }

}
