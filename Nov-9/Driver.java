public class Driver {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(3.2);
        r.setLength(4.7);
        System.out.println();
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r);
        System.out.println(r.toString());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}