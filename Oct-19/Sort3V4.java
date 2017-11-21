import java.util.*;

public class Sort3V4
{
  public static void main(String []  args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 values: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    //cheating
    int small = Math.min(a, Math.min(b, c));
    int big = Math.max(Math.max(a, b), c);
    int middle = a + b + c - small - big;
    System.out.println(small + " " + middle + " " + big);
  }
}