package Day6assign.QueueQuestion;


import java.util.Scanner;

public class ImplementingQueue implements Queue {

  static  int queue[] = new int[20];
  static int size =0;

    @Override
    public  void insert(int n) {
        queue[size] = n;
        System.out.println("New Queue is:");
        for(int i=0; i<size+1;i++){

            System.out.println(queue[i]);
        }
    }

    @Override
    public  void delete(int n) {
       // queue[n-1] = 0;
        System.out.println("New Queue is:");

        for(int i=0; i<queue[n-1];i++){
            System.out.println(queue[i]);
        }

        for(int i=queue[n]; i<size;i++){
            System.out.println(queue[i]);
        }
    }

    public static void create(int n){
        for(int i=1; i<n+1; i++){
            queue[i] = i;
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the Queue Length");

        Scanner a = new Scanner(System.in);
         size = a.nextInt();
        create(size);

        System.out.println("What you want to do with Queue");
        System.out.println("Enter i for Inserting value and d for Deletion of value");

        Scanner b = new Scanner(System.in);
        String input = b.next();

        switch (input){
            case "i" :

                System.out.println("Enter element for insertion");
                int c = a.nextInt();
                ImplementingQueue q = new ImplementingQueue();
                q.insert(c);
                break;

            case "d" :

                System.out.println("Enter element for deletion");
                int del = a.nextInt();
                ImplementingQueue r = new ImplementingQueue();
                r.delete(del);
                break;
        }
    }

}
