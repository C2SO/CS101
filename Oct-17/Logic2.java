public class Logic2
{
   public static void main(String [] args)
   {
      int x = 7;
      int y = 3;
      int z = 7;
      System.out.println(x == y);
      System.out.println(x == z);
      System.out.println(x != y);
      System.out.println(x != z);
      System.out.println(x > y);
      System.out.println(x > z);
      System.out.println(x >= y);
      System.out.println(x >= z);
      System.out.println(x < y);
      System.out.println(x < z);
      System.out.println(x <= y);
      System.out.println(x <= z);
      
      if (x > y)
         z = y + x;
      z = 7;
      if (x > z)
         y = z + x;
      if (x < 10)
         y = 13;
      z = 15;
      if (x > 10)
         y = 23;
      z = 25;   //assignment to z occurs regardless of logical expression
                //fixed indentation from Logic.java
      if (x < 10)
      {
         y = 13;
         z = 15;
      }   
      if (x > 10)
      {
         y = 23;
         z = 25; 
      }
      
      if (x > 10)
      {
        z = 17;
        y = 42;
      }
      else
      {
        z = 100;
        y = 200;
      }
      if (x < 10)
      {
        z = 117;
        y = 142;
      }
      else
      {
        z = 1200;
        y = 2300;
      }
     
      
   }
}