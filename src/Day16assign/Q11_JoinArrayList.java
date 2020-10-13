package Day16assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11_JoinArrayList {

    public static void main(String[] args) {
        ArrayList<String> firstList=new ArrayList<String>();
        ArrayList<String> secondList=new ArrayList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements for the list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add "+(i+1)+" entry in firstList");
            name=scan.next();
            firstList.add(name);
        }
        for(int i=0;i<count;i++) {
            System.out.println("Add"+(i+1)+" entry in secondList");
            name=scan.next();
            secondList.add(name);
        }

        System.out.println("List1 Before State "+firstList);
        firstList.addAll(secondList);
        System.out.println("List1 Joined with List2 \n"+firstList);
    }

}
