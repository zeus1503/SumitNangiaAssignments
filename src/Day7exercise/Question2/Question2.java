package Day7exercise.Question2;

import java.util.Scanner;

public class Question2 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the title");
            String s = scan.next();
            MyBook newBook = new MyBook();
            newBook.setTitle(s);
            System.out.println("The title of the book is " + newBook.getTitle());

        }
}
