package Day8assign;

public class AirthmeticException {

    public static void main(String[] args) {
            int a=50;

            try {
                int value=a/0;
            }

            catch(ArithmeticException e){
                e.printStackTrace();
                System.out.println("Airthmetic Exception Caught");
            }

        }

    }
