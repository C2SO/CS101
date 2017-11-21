public class CallByValue
{
   public static void main(String[] args)
   {
      int a = 17;
      incrament(a);
      System.out.println(a);
   }
   public static void incrament(int a)
   {
      a++;
      return;
   }
}