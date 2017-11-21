import java.util.*;

public class Sort3V3
{
  public static void main(String []  args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 values: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    //use helping variables
    int small = a;
    int middle = 0;
    int big = 0;
    if (small < b)
      middle = b;
    else
    {
      middle = small;
      small = b; 
    } 
    if (c >= middle)
      big = c;
    else if (c >= small)
    {
      big = middle;
      middle = c;
    }   
    else
    {
      big = middle;
      middle = small;
      small = c;
    }
    System.out.println(small + " " + middle + " " + big);    
  }
}