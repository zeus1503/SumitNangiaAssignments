package Day5assign;

public class Car {

    public static void main(String[] args) {
        System.out.println("This is Main Method");
        //Display method using Car Class
        Car a = new Car();
        a.display();

        //Display method using BMW
        BMW b = new BMW();
        b.display();

        //Display method using Merc
        Merc m = new Merc();
        m.display();
    }


    public void display() {
        System.out.println("Welcome to base class Car");
    }
}
