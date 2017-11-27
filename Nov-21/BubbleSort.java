public class BubbleSort
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 1, 100);
    sort(a);
  }
  
  public static void sort(int [] a)
  {
    boolean sorted = false;
    int bottom = a.length - 1;
    while (!sorted)
    {
      sorted = true;
      for(int i = 0; i < bottom; i++)
      {
        if(a[i] > a[i + 1])
        {
          swap(a, i, i+1);
          sorted = false;
        }  
      }
      bottom--;
    }
  }
  
  public static int findSmallIndex(int [] a, int startIndex)
  {
    int minIndex = startIndex;
    for (int i = startIndex + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
        minIndex = i;
    return minIndex;    
  }
  
  public static void swap(int [] a, int first, int second)
  {
    int temp = a[first];
    a[first] = a[second];
    a[second] = temp;
  }
}