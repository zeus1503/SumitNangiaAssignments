package Day16assign;
import java.util.ArrayList;
import java.util.Scanner;


public class Q1_ArrayListAndPrint {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String name="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of entries to be added to list");
        int count=scan.nextInt();


        for(int i=0;i<count;i++) {
            System.out.println("Add the name of "+(i+1)+"person");
            name=scan.next();
            list.add(name);
        }

        System.out.println("The names are as follows: "+list);
    }
}
