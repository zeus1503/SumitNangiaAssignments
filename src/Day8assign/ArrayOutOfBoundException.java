package Day8assign;

public class ArrayOutOfBoundException {

    public static void main(String[] args) {

        try {

            int ar[] = {1, 2, 3, 4, 5};
            for (int i = 0; i <= ar.length; i++) {
                System.out.println(ar[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Array out of Bound Caught");
        }

    }
}
