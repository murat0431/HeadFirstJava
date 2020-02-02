package WritingToFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("newFile.txt");
            fw.write("Hey!");
            fw.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
