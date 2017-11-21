import java.util.*;

public class Randomness {
   public static void main(String [] args) {
      Random r = new Random();
      int d6 = r.nextInt(6)+1; //generates random number between 1 and 6
      System.out.println();
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
      System.out.println(d6);
      d6 = r.nextInt(6)+1;
   }
}