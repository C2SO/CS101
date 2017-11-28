/**  
* @author Dr. Vineyard  
* A Cube is defined as a Box with equal dimensions.  
*/  
  
  
public class Cube extends Box  
{  
      
   /**  
   * A Box with all three dimensions equal is a Cube.  
   * A Box has a Point, a height, a length, and a width.  
   * A constructor with no Point parameter implies Point (0,0).  
   */  
     
   public Cube(double side)  
   {  
      super(side, side, side);  
   }   
     
   /**  
   * Construct the Cube by specifying side, x, and y.  
   */  
     
   public Cube(double side, double x, double y)  
   {  
      super(side, side, side, x, y);  
   }  
     
   /**  
   * Construct the Cube by specifying side and a Point.  
   */  
     
   public Cube(double side, Point point)  
   {  
      super(side, side, side, point);  
   }  
     
      
     
   /**  
   * toString returns a String representation of Box  
   */  
   
     
   public String toString()  
   {  
      return "Cube with side " + height + " and\n   " + super.toString();  
   }  
     
   /**  
   * getSide will return the side.  
   */  
     
   public double getSide()  
   {  
      return height;  
   }  
    
}


























































