import java.util.*;
public class ArrayStuff
{
   public static void main(String [] args)
   {
   /*
      int [] a;
      int b [];
      int c[],d,e[]; // bad practice
      int [] f, g, h; // bad practice
      //no arrays yet, just variable referances
      
      a = new int[5];
      double x[] = new double[4];
      a[1] = 42;
      x[0] = a[1];
      */
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for (int index = 0; index < size; index ++)
      {
         arr[index] = in.nextInt();
      }
      int arrSum = 0;
      for (int index = 0; index < size; index ++)
      {
         arrSum += arr[index];
      }
      System.out.println("Sum is " + arrSum);
      int arrMin = arr[0];
      for (int index = 0; index < size; index ++)
      {
         if (arrMin < arr[index])
            arrMin = arrMin;
         else
            arrMin = arr[index];
      }
      System.out.println("Min is " + arrMin);
      int arrMax = arr[0];
      for (int index = 0; index < size; index ++)
      {
         if (arrMax > arr[index])
            arrMax = arrMax;
         else
            arrMax = arr[index];
      }
      System.out.println("Max is " + arrMax);
      double arrAverage = arrSum / size;
      System.out.println("Average is " + arrAverage);
      for (int index = 0; index < size; index ++)
      {
         System.out.println(arr[index] + "\t-\t" + (arr[index] - arrAverage));
      }
   }
}