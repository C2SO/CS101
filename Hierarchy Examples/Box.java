/**  
* @author Dr. Vineyard  
* A Box is defined by a Rectangle and a height.  
*/  
  
  
public class Box extends Rectangle  
{  
   protected double height;  
    
  /**  
  * A Rectangle and a height are required to construct a Box.  
  * A Rectangle has a Point, a length, and a width.  
  * A constructor with no Point parameter implies Point (0,0).  
  */  
    
   public Box(double height, double length, double width)  
   {  
      super(length, width);  
      this.height = height;  
   }   
    
  /**  
  * Construct the Box by specifying height, length, width, x, and y.  
  */  
    
   public Box(double height, double length, double width, double x, double y)  
   {  
      super(length, width, x, y);  
      this.height = height;  
   }  
    
  /**  
  * Construct the Box by specifying height, length, width, and a Point.  
  */  
    
   public Box(double height, double length, double width, Point point)  
   {  
      super(length, width, point);  
      this.height = height;  
   }  
    
  /**   
  *  A Box has area.  
  *  Override the  area method of Rectangle.  
  */  
    
   public double area()  
   {  
      double endArea = height * width;  
      double sideArea = height * length;  
      double topArea = super.area();  
      return 2 * (endArea + sideArea + topArea);  
   }  
    
  /**   
  *  A Box has volume.  
  *  Override the  area method of Rectangle.  
  */  
    
   public double volume()  
   {  
      return super.area() * height;  
   }  
  
  /**  
  * toString returns a String representation of Box  
  */  
  
    
   public String toString()  
   {  
      return "Box with height " + height + " and\n   " + super.toString();  
   }  
    
  /**  
  * getHeight will return the height.  
  */  
    
   public double getHeight()  
   {  
      return height;  
   }  
   
}



















































































