package Day12assign;
import java.io.File;


public class Ques2_FileExistsOrNot {

    public static void main(String[] args) {

        String DirPath="DemoFile.txt";
        File f = new File(DirPath);
        boolean a =f.exists();

        if(a==true) {
            System.out.println("File exist");
        }
        else {
            System.out.println("File doest not exist");
        }
    }

}



