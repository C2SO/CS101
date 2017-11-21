public class Assignment
{
  public static void main(String [] args)
  {
    //declaration of variables
    //Syntax:
    //type variableName;
    int a;
    double d;
    char c;
    boolean b;
    String s;
    
    //assignment statement
    //Syntax:
    //variable = expression;
    a = 2;  //put the literal value 2 in the box named a.
    d = 2.0 * 3.4e5;
    c = '2';
    b = true;
    s = "This is a string\n\tcontaining a newline and a tab.";
    System.out.println(s);
    
    final int MAX = 100;
    MAX = 200;
  }
}