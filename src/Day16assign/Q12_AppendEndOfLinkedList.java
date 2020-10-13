package Day16assign;

import java.util.LinkedList;
import java.util.Scanner;

public class Q12_AppendEndOfLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of entries to be added to the Linked list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+"entry");
            name=scan.next();
            list.add(name);
        }

        System.out.println("Enter the name to be added at the end of linked list");
        name =scan.next();

        list.addLast(name);
        System.out.println("The Final List after making entry at the end of Linked List \n"+list);

    }

}
