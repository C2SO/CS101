public class Rectangle {
    // private double length;
    // private double width;
    // private restricts access to class
    protected double length;
    protected double width;
    // protected allows access to subclasses and other classes in same package

    public Rectangle() {
        this(0, 0);
        //You must write your own default (no-args) constructor if the default constructor will be called, and if you have written another constructor
    }

    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }

    public String toString() {
        return "A rectangle which is " + length + " by " + width;
    }

    public double area() {
        return length * width;
    }
}