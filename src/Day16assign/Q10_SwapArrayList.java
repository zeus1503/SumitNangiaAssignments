package Day16assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_SwapArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        String name="";
        int firstIndex=0;
        int secondIndex=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of users in array list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" user");
            name=scan.next();
            list.add(name);
        }

        do {
            System.out.println("Enter the index of elemnent to be swapped");
            firstIndex = scan.nextInt();
        }while(firstIndex<0);

        do {
            System.out.println("Enter the index of element to be swapped with");
            secondIndex = scan.nextInt();
        }while(secondIndex>(count-1));

        Collections.swap(list, firstIndex, secondIndex);

        System.out.println("Array List post swapping is : \n"+list);
    }


}
