import java.util.*;

public class Sort3V1
{
  public static void main(String []  args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 values: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    if (a <= b)
    {
      if (c <= a)
      {
        System.out.println(c + " " + a + " " + b);
      }
      else //a is smallest
      {
        if (c <= b)
        {
          System.out.println(a + " " + c + " " + b);
        }
        else
        {
          System.out.println(a + " " + b + " " + c);
        }
      }
    }
    else //(a > b)
    {
      if (c <= b)
      {
        System.out.println(c + " " + b + " " + a);
      }
      else
      {
        if (c <= a)
        {
          System.out.println(b + " " + c + " " + a);
        }
        else
        {
          System.out.println(b + " " + a + " " + c);
        }
      }
    }
  }
}