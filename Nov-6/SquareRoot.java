import java.util.*;
public class SquareRoot
{
   public static void main( String [] args )
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      double userNumber = in.nextDouble();
      System.out.println(sqrt(userNumber));
   }
   public static double sqrt(double userNumber)
   {
      double guess = userNumber/2;
      while(Math.abs((guess*guess)-userNumber) > 0.0000001)
      {
         guess = 0.5 * (guess + (userNumber / guess));    
      }
      return guess;
   }
}