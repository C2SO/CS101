public class Driver {
    public static void main (String [] args) {
        System.out.println();
        Square t = new Square(1);
        Rectangle r = new Rectangle(3,4);
        System.out.println(t.area());
        System.out.println(t.toString());
        System.out.println(r.toString());
    }
}