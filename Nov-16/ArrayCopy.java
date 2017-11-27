public class ArrayCopy
{
  public static void main(String [] args)
  {
    int []  a = {1,2,3,4,5};
    int [] b = a;
    if (a == b)
      System.out.println("equal");
    a[3] = 42;
    System.out.println(b[3]); 
    //a and b are references to the same array object.
    //a and b are aliases.
    //How do we copy from one array into another?
    //Copy into array referenced by variable c.
    
    int [] c = arrayCopy(a);
    if (arraysEqual(a, c))
      System.out.println("equal");
    int [] d = {1,2,3};
    if  (arraysEqual(a, d))
      System.out.println("equal"); 
    d = makeBigger(d);
    int [] e = new int[0];   
    int [] f = new int[-1];
     
  }
  
  public static boolean arraysEqual(int [] a, int [] b)
  {
    boolean equal = (a.length == b.length);
    int index = 0;
    while(index < a.length && equal)
    {
      if (a[index] != b[index])
        equal = false;
      index++;  
    }
    return equal;
  }
  
  public static int [] arrayCopy(int [] x)
  {
    int [] y = new int[x.length];
    for(int i = 0; i < x.length; i++)
      y[i] = x[i];
    return y;  
  }
  
  public static int [] makeBigger(int [] x)
  {
    int [] y = new int[x.length + 1];
    for(int i = 0; i < x.length; i++)
      y[i] = x[i];
    return y;  
  }
}