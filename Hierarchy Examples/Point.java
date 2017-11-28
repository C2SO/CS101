/**  
* @author Dr. Vineyard  
* All GeometricObjects will have a base Point.  
*/  
  
public class Point extends GeometricObject  
{  
   protected double xValue;  
   protected double yValue;  
    
  /**  
  * By default, a Points coordinates will be (0,0).  
  */  
   public Point()  
   {  
      this(0.0, 0.0);  
   }  
    
  /**  
  * Both x and y coordinates are necessary to specify  
  * coordinates of something other than (0,0).  
  */  
   public Point (double x, double y)  
   {  
      xValue = x;  
      yValue = y;  
   }  
    
  /**  
  * A Point can be made equal to an argument Point.  
  */  
    
   public Point(Point point)  
   {  
      xValue = point.xValue;  
      yValue = point.yValue;  
   }  
    
  /**   
  *  A Point has 0 area.  
  *  Override the abstract area method of GeometricObject.  
  */  
   public double area()  
   {  
      return 0.0;  
   }  
    
  /**   
  *  A Point has 0 volume.  
  *  Override the abstract volume method of GeometricObject.  
  */  
   public double volume()  
   {  
      return 0.0;  
   }  
    
  /**  
  * toString returns a String representation of Point  
  */  
    
   public String toString()  
   {  
      return "Point with coordinates (" + xValue + ", " + yValue + ")";  
   }  
  
}
































































