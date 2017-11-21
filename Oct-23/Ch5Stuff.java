public class Ch5Stuff
{
  public static void main(String [] args)
  {
    String s = "abc";
    String t = new String("abc");
    if (s == t)
      System.out.println("equals");
    if (s.equals(t))
      System.out.println("equals");  
  }
}