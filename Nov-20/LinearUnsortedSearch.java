public class LinearUnsortedSearch
{

  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 20, 40);
    int value = 43;
    int index = search(a, value);
    System.out.println(index);
  }
  
  public static int search(int [] a, int value)
  {
    int index = 0;
    while(index < a.length && a[index] != value)
    {
      index++;
    }
    if (index == a.length)
      return -1;
    return index;  
  }
}