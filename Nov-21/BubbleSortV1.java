public class BubbleSortV1
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 1, 100);
    sort(a);
  }
  
  public static void sort(int [] a)
  {
    for(int passes = 1; passes < a.length; passes++)
    {
      for(int i = 0; i < a.length -1; i++)
      {
        if(a[i] > a[i + 1])
          swap(a, i, i+1);
      }
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