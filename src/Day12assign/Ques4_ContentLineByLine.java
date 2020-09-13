package Day12assign;

import java.io.*;

public class Ques4_ContentLineByLine {


    public static void main(String[] args) throws IOException {

        String filePath="D:\\Learning Material\\Scaled Agile\\ScaledAgile.txt";
        File f = new File(filePath);
        //Using buffred reader class
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String data;
            while((data=br.readLine())!=null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
