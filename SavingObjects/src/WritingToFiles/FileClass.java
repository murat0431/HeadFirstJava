package WritingToFiles;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
        File f  = new File("myDir");
        f.mkdir();
        File c =new File("myDir/newDir");
        c.mkdir();
        File e = new File("myDir/newFile2.txt");
        try {
            e.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (f.isDirectory()) {
            for(File d : f.listFiles()) {
                System.out.println(d.getName());
            }
        }
    }
}
