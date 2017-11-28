/**  
* @author Dr. Vineyard  
* A Rectangle has length and width.  
* A Point fixes the location of the lower right  
* corner of the Rectangle.  
*/

public class Rectangle extends Point {

      protected double length;
      protected double width;

      /**  
      * Rectangles are constructed from length, width, and a Point.  
      * A constructor with no Point value(s) is located at (0, 0).  
      */

      public Rectangle(double length, double width) {
            super();
            this.length = length;
            this.width = width;
      }

      /**  
      * Construct a Rectangle from length, width, x, and y.  
      */

      public Rectangle(double length, double width, double x, double y) {
            super(x, y);
            this.length = length;
            this.width = width;
      }

      /**  
      * Construct a Rectangle from length, width, and a Point.  
      */

      public Rectangle(double length, double width, Point point) {
            super(point);
            this.length = length;
            this.width = width;
      }

      /**  
      * toString returns a String representation of Rectangle  
      */

      public String toString() {
            return "Rectangle with length " + length + " width " + width + " and\n   " + super.toString();
      }

      /**   
      *  A Rectangle has area.  
      *  Override the area method of Point.  
      */

      public double area() {
            return length * width;
      }

      /**  
      *  getLength returns the length.  
      */

      public double getLength() {
            return length;
      }

      /**  
      *  getWidth returns the width.  
      */

      public double getWidth() {
            return width;
      }

}
