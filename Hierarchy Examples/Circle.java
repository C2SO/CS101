/**  
* @author Dr. Vineyard  
* A Circle is defined by a Point and a radius.  
* The points on the circle are all the points at  
* the radius distance from the given Point.  
*/  
  
  
public class Circle extends Point  
{  
   protected double radius;  
    
  /**  
  * A radius and a Point are required to construct a Circle.  
  * A constructor with no Point parameter implies Point (0,0).  
  */  
    
   public Circle(double radius)  
   {  
      super();  
      this.radius = radius;  
   }   
    
  /**  
  * Construct the Circle by specifying radius, x, and y.  
  */  
    
   public Circle(double radius, double x, double y)  
   {  
      super(x, y);  
      this.radius = radius;  
   }  
    
  /**  
  * Construct the Circle by specifying radius and a Point.  
  */  
    
   public Circle(double radius, Point p)  
   {  
      super(p);  
      this.radius = radius;  
   }  
    
  /**   
  *  A Circle has area.  
  *  Override the  area method of Point.  
  */  
    
   public double area()  
   {  
      return Math.PI * radius * radius;  
   }  
    
  /**  
  * toString returns a String representation of Circle  
  */  
  
    
   public String toString()  
   {  
      return "Circle with radius " + radius + " and " + super.toString();  
   }  
    
  /**  
  * getRadius will return the radius.  
  */  
    
   public double getRadius()  
   {  
      return radius;  
   }  
   
}







































































