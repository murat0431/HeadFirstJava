package WritingToFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
    public static void main(String[] args) throws IOException {

        BufferedWriter bf = new BufferedWriter(new FileWriter("myDir/newFile.txt"));
        bf.write("Hey It is me");
        bf.write("My name is Murat");
        bf.write("What is it you want?");
        bf.write("Do you think this is even possible?");
        bf.close();
    }
}
