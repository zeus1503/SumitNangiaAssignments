package Day12assign;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Ques5_AppendFile {

    public static void main(String[] args) throws IOException {

        File file = new File("append.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write("appended data");

        br.close();
        fr.close();
    }
}
