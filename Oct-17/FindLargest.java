import java.util.*;
public class FindLargest
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 values: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    if (a > b)
    {
      if (a > c)
        System.out.println(a);
      else
        System.out.println(c);  
    }
    else //a not bigger than b
    {
      if (b > c)
        System.out.println(b);
      else
        System.out.println(c);  
    }
  }

}