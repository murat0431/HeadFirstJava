package WritingToFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        File f = new File("newFile.txt");
        readFile(f);
    }

    public static void readFile(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
           while (br.ready()) {
               System.out.println(br.readLine());
           }
           br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
