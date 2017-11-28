/**  
* @author Dr. Vineyard  
* A Cylinder is defined by a Circle and a height.  
*/

public class Cylinder extends Circle {
    protected double height;

    /**  
    * A Circle and a height are required to construct a Cylinder.  
    * A Circle has a Point and a Radius.  
    * A constructor with no Point parameter implies Point (0,0).  
    */

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**  
    * Construct the Cylinder by specifying height, radius, x, and y.  
    */

    public Cylinder(double height, double radius, double x, double y) {
        super(radius, x, y);
        this.height = height;
    }

    /**  
    * Construct the Cylinder by specifying height, radius, and a Point.  
    */

    public Cylinder(double height, double radius, Point point) {
        super(radius, point);
        this.height = height;
    }

    /**   
    *  A Cylinder has area.  
    *  Override the  area method of Circle.  
    */

    public double area() {
        double endArea = super.area();
        double sideArea = 2 * Math.PI * radius * height;
        return 2 * endArea + sideArea;
    }

    /**   
    *  A Cylinder has volume.  
    *  Override the  area method of Circle.  
    */

    public double volume() {
        return super.area() * height;
    }

    /**  
    * toString returns a String representation of Cylinder  
    */

    public String toString() {
        return "Cylinder with height " + height + " and " + super.toString();
    }

    /**  
    * getHeight will return the height.  
    */

    public double getHeight() {
        return height;
    }

}
