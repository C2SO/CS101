import java.util.*;
import java.io.*;

public class maxIntFile {
      public static void main(String[] args) throws Exception {
            File inFile = new File(args[0]);
            Scanner fileScan = new Scanner(inFile);
            int intInGer = Integer.MIN_VALUE;
            String wasteLine = "Non Ints go here";
            int counter = 0;
            while (fileScan.hasNext()) {
                  while (!(fileScan.hasNextInt())) {
                        wasteLine = fileScan.next();
                  }
                  intInGer = Math.max(intInGer, fileScan.nextInt());
                  counter++;
            }
            if (counter == 0)
                  System.out.println("There were no numbers");
            else
                  System.out.println(intInGer);
      }
}