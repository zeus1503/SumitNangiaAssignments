package Day16assign;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q13_IterateLinkedListReverse {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of enteries for the list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Mention name of "+(i+1)+" entry");
            name=scan.next();
            list.add(name);
        }

        Iterator j = list.descendingIterator();
        System.out.println("Linked List in Reverse Order");
        while (j.hasNext()) {
            System.out.println(j.next());
        }
    }



}
