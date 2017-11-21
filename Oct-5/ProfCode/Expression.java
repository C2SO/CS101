public class Expression
{
  public static void main(String [] args)
  {
    System.out.println(
      ((5+7*2)/(6+15/7))*(((8-3)/4*5*6)/(3+6-5/2))
    );
    
    System.out.println(
    5 + 7 % 3 - 2 * 6 + (8 - 1) / 4
    );
    
    //mixed types
    byte a = 127;
    byte c = 13;
    //byte d = a + c;  result is int, compile time error
    byte d = (byte)(a + c);//cast to a byte
    
    System.out.println(
      5 - 2.0 / 2 + "hello" + 17 + 16/20 + 8 % 4
    );
  }
}