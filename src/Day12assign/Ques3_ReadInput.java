package Day12assign;
import java.io.*;


public class Ques3_ReadInput {

    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Enter the content to be read from console");
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            String content = b.readLine();
            System.out.println("Data read from console is as below:");
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Caught exception while reading console input");

        }

        finally {
            System.out.println("Exit");
        }


    }
}
