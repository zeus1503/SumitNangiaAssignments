package Day12assign;
import java.io.File;

public class Ques1_ListofFiles {

    public static void main(String[] args) {
        File path = new File("D:\\Learning Material");
        String[] listoffiles = path.list();   //Storing all the folders/files present in the path in a String array

        for(String a : listoffiles){
            System.out.println(a);           //Printing out the individual list of directories contained in the path
        }

    }

}
