package Day16assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q8_ArrayListReverse {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of users in the list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" user");
            name=scan.next();
            list.add(name);
        }


        System.out.println("Array List before reversal :\n"+list);
        Collections.reverse(list);
        System.out.println("Array List after reversal : \n"+list);
    }

}
