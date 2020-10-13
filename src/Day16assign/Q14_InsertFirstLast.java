package Day16assign;

import java.util.LinkedList;
import java.util.Scanner;

public class Q14_InsertFirstLast {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of entries to be added to the LL");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" entry");
            name=scan.next();
            list.add(name);
        }
        System.out.println("Enter the First element to be added");
        name = scan.next();
        list.addFirst(name);

        System.out.println("Enter the last element to be added");
        name = scan.next();
        list.addLast(name);

        System.out.println("LinkedList after adding at first and last location is \n"+list);
    }

}
