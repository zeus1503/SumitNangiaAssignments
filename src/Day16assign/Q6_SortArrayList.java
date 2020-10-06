package Day16assign;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Q6_SortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int element=0;

        System.out.println("Enter the count of entries to be added in the list");
        Scanner scan = new Scanner(System.in);
        int count=scan.nextInt();


        for(int i=0;i<count;i++) {
            System.out.println("Enter the "+(i+1)+" element");
            element=scan.nextInt();
            list.add(element);
        }

        System.out.println("The list before sorting is "+list);
        System.out.println("Enter 1 to sort list in increasing order");
        element =scan.nextInt();

        if(element==1) {
            Collections.sort(list);
            System.out.println("The List after sorting in increasing order is "+list);
        }

        else
            System.out.println("The entry is invalid");
    }


}


