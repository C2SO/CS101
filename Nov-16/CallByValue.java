public class CallByValue
{
  public static void main(String [] args)
  {
    int a = 17;
    increment(a);
    System.out.println(a);
    
    int [] b = {1,2,3};
    makeBigger(b);
  }
  
  public static void makeBigger(int [] a)
  {
    int []x = new int[a.length + 1];
    for (int i = 0; i < a.length; i++)
      x[i] = a[i];
    a = x;  
      
  }
  
  public static void increment(int a)
  {
    a++;
    return;
  }
}