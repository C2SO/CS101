import java.io.*;
import java.util.*;

public class ReadWriteFromFile {
    public static void main(String[] args) throws Exception {
        File inFile = new File(args[0]);
        Scanner fileScan = new Scanner(inFile);
        File outFile = new File(args[1]);
        PrintStream writer = new PrintStream(outFile);
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            writer.println(line);
        }
    }
}