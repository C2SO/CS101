public class ArrayInClass
{
  //instance variable can be array
  private int [] a;
  
  //array can be a parameter
  public ArrayInClass(int [] a)
  {
    //copy the reference into this.a, or make a copy of array?
    //safest to make an array copy
    arrayCopy(a);
  }
  
  private void arrayCopy(int [] x)
  {
    a = new int[x.length];
    for(int i = 0; i < x.length; i++)
      a[i] = x[i];  
  }
  
  public int [] getA()
  {
    return ArrayCopy.arrayCopy(a);
  }
}