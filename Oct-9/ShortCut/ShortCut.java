/* Shortcut Operators
   Rahbany, Nicholas
*/

public class ShortCut {
   public static void main(String [] args) {
      
      /*
      Shortcut Assignment Operators:
      
      += - Adds following number
      -= - Subtracts following number
      *= - Multiplies following number
      /= - Divides following number (gets quoient)
      %= - Divides following number (gets remainder)
      x++ - Adds one to x
      x-- - Subtracts one from x
      
      */
   
      int x = 2;
      System.out.println("x = " + x);
      x = x + 3;
      System.out.println("x = x + 3: " + x);
      System.out.println();
      
      x = 2;
      System.out.println("x = " + x);
      x += 3; 
      System.out.println("x += 3: " + x);
      System.out.println();
      
      x = 2;
      System.out.println("x = " + x);
      x *= 3;
      System.out.println("x *= 3: " + x);
      System.out.println();
      
      x = 10;
      System.out.println("x = " + x);
      x -= 4;
      System.out.println("x -= 4: " + x);
      System.out.println();
      
      x = 8;
      System.out.println("x = " + x);
      x /= 5;
      System.out.println("x /= 5: " + x);
      System.out.println();
      
      x = 8;
      System.out.println("x = " + x);
      x %= 5; 
      System.out.println("x %= 5: " + x);
      System.out.println();
      
      x = 7;
      System.out.println("x is " + x);
      int y = ++x;
      System.out.println("y = ++x: " + y);
      
      int a = 3;
      int b = 6;
      int c = 4;
      int d = 8;
      int e = 2;
      int f = 7;
      d = a++ + --b + ++c - ++a + b-- - c-- + d++ - ++e + f++;
      System.out.println("d = a++ + --b + ++c - ++a + b-- - c-- + d++ - ++e + f++: " + d);
      // The system calculates the value by first evaluating the post (x++), then evaluating the pre (--x)
      // ALWAYS USE POST (x--)
            
   }
}