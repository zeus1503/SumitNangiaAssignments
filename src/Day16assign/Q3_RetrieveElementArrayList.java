package Day16assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_RetrieveElementArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String name="";
        int sequence=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of entries to be added in the list");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+"entry");
            name=scan.next();
            list.add(name);
        }

        do {
            System.out.println("Enter the entry index receive");
            sequence = scan.nextInt();

            if(sequence>(count-1))
                System.out.println("No value exists in the Index entered, Enter a Valid Index");
        }

        while(sequence>(count-1));
        System.out.println("The name in the specified index is : "+list.get(sequence));
    }
}
