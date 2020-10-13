package Day16assign;

import java.util.HashSet;
import java.util.Scanner;

public class Q15_HashSetToArray {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        String name="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count of enteries to be added to HashSet");
        int count=scan.nextInt();

        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+" entry");
            name=scan.next();
            hs.add(name);
        }

        System.out.println("The Elements in the Hashset are : \n"+hs);

        //Converting to Array
        Object[] arr = hs.toArray();
        System.out.println("The Elements of the array are :");
        for(Object elements:arr) {
            System.out.println(elements);
        }
    }


}
