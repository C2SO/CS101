/**  
* @author Dr. Vineyard  
* A Square has equal length and width, called a side.  
* A Point fixes the location of the lower right  
* corner of the Square.  
*/

public class Square extends Rectangle {

      /**  
      * Squares are constructed from a side and a Point.  
      * A constructor with no Point value(s) is located at (0, 0).  
      */

      public Square(double side) {
            super(side, side);
      }

      /**  
      * Construct a Square from side, x, and y.  
      */

      public Square(double side, double x, double y) {
            super(side, side, x, y);
      }

      /**  
      * Construct a Square from a side and a Point.  
      */

      public Square(double side, Point point) {
            super(side, side, point);
      }

      /**  
      * toString returns a String representation of Square  
      */

      public String toString() {
            return "Square with side " + width + " and\n   " + super.toString();
      }

      /**  
      *  getSide returns a side.  
      */

      public double getSide() {
            return length; //return width; would work as well.  
      }

}
