public class ArrayInClass
{
   private int [] a;

   public ArrayInClass(int [] a)
   {
      arrayCopy(a);
   }
   private void arrayCopy(int [] x)
   {
   a = new int[x.length];
   for(int i = 0; i < x.length; i++)
      {
         a[i] = x[i];
      }
   }
   public int [] getA(){
   return ArrayCopy.arrayCopy(a);
   }
   /*
   public static void main(String[] args)
   {
   
   
      int [] a = {1, 2, 3, 4, 5};
      int [] b = a;//not 2 arrays, just two referances to one array. a and b are aliases
      if (a==b)
         System.out.println("equal");
      int [] c = arrayCopy(a);
      boolean arrayEqual = arrayTestEqual(a, c);
      System.out.println("The arrays are equal: " + arrayEqual);
      int [] d = arrayExtender(a);
   }
   public static int [] arrayCopy(int [] x)
   {
   int [] y = new int[x.length];
   for(int i = 0; i < x.length; i++)
      {
         y[i] = x[i];
      }
   return y;
   }
   public static boolean arrayTestEqual(int [] x, int [] y)
   {
      boolean equal = (x.length == y.length);
      int index = 0;
      while (index < x.length && equal)
      {
         if (x[index] != y[index])
            equal = false;
         index++;
      }
      return equal;
   }
   public static int [] arrayExtender(int [] z)
   {
   int [] y = new int[(z.length + 1)];
   for(int i = 0; i < z.length; i++)
      {
         y[i] = z[i];
      }
   return y;
   
   }
   */
}