package Day4assign;
import java.lang.Math;

public class Students {

    public  void StudentDetail(int roll, String nm){
            int SeatNumber = roll+10;
            int rank = (int) (Math.random()*10);
            System.out.println("Seat Number for "+ nm + " is " + SeatNumber);
            System.out.println("Seating Position for " + nm + " is " + rank);
        }

    public static void main(String[] args) {

        Students a = new Students();
        a.StudentDetail(20,"Mohit");
    }


}
