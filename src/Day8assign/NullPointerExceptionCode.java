package Day8assign;

public class NullPointerExceptionCode extends Throwable {

    public static void main(String[] args) {

            // Initializing String variable with null value
            String abc = null;

            // Checking if string equals null or not.
            try
            {
                if (abc.equals("test"))
                    System.out.print("Same");
                else
                    System.out.print("Not Same");
            }
            catch( NullPointerException e)
            {
                System.out.print("NullPointerException Caught");
            }
        }

    }

