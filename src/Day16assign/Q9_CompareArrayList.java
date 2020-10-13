package Day16assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9_CompareArrayList {

    public static void main(String[] args) {
        ArrayList<String> ListOne=new ArrayList<String>();
        ArrayList<String> ListTwo=new ArrayList<String>();

        String name="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of users to be added in both list");

        int count=scan.nextInt();
        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" user - List 1");
            name=scan.next();
            ListOne.add(name);
        }

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" user - List 2");
            name=scan.next();
            ListTwo.add(name);
        }

        if(ListOne.equals(ListTwo))
            System.out.println(ListOne + "  matches with  " +ListTwo);
        else
            System.out.println(ListOne + "  does not matches  " +ListTwo);
    }


}
