public class Driver
{
  public static void main(String [] args)
  {
    Rectangle r = new Rectangle();//there is no default constructor
    r.setWidth(-1);
    r.setLength(-2);
    System.out.println(r.getLength());
    System.out.println(r.getWidth());
    System.out.println(r);
    System.out.println(r.toString());
    System.out.println(r.area());
    System.out.println(r.perimeter());
    
    Rectangle r2 = new Rectangle(7.3, 8.5);
    System.out.println(r2.getLength());
    System.out.println(r2.getWidth());
    System.out.println(r2);
    System.out.println(r2.toString());
    System.out.println(r2.area());
    System.out.println(r2.perimeter());
  }
}