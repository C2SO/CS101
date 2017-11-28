/**  
@author Dr. Vineyard  
This is a driver program to demonstrate a class hierarchy in Java.  
*/  
  
public class Geometry  
{  
  
  /**  
  The main method will demonstrate polymorphism.  
  */  
    
   public static void main (String [] args)  
   {  
    
      GeometricObject geometricObject1;  
      geometricObject1 = new Point(5, -7);  
      System.out.println(geometricObject1 + "\narea: " + geometricObject1.area()  
                       + "\tvolume: " + geometricObject1.volume() + "\n");  
   						    
      GeometricObject geometricObject2;  
      geometricObject2 = new Circle(4, 5, -7);  
      System.out.println(geometricObject2 + "\narea: " + geometricObject2.area()  
                       + "\tvolume: " + geometricObject2.volume() + "\n");  
   					    
   						    
      GeometricObject geometricObject3;  
      geometricObject3 = new Cylinder(2, 4, 5, -7);  
      System.out.println(geometricObject3 + "\narea: " + geometricObject3.area()  
                       + "\tvolume: " + geometricObject3.volume() + "\n");  
     
      GeometricObject geometricObject4;  
      geometricObject4 = new Rectangle(3, 4, 5, 6);  
      System.out.println(geometricObject4 + "\narea: " + geometricObject4.area()  
                       + "\tvolume: " + geometricObject4.volume() + "\n");  
      GeometricObject geometricObject5;  
      geometricObject5 = new Square(7, 8, 9);  
      System.out.println(geometricObject5 + "\narea: " + geometricObject5.area()  
                       + "\tvolume: " + geometricObject5.volume() + "\n");  
   						    
      GeometricObject geometricObject6;  
      geometricObject6 = new Box(9, 8, 5, 3, 3);  
      System.out.println(geometricObject6 + "\narea: " + geometricObject6.area()  
                       + "\tvolume: " + geometricObject6.volume() + "\n");  
     
      GeometricObject geometricObject7;  
      geometricObject7 = new Cube(5, 4, 3);  
      System.out.println(geometricObject7 + "\narea: " + geometricObject7.area()  
                       + "\tvolume: " + geometricObject7.volume() + "\n");  
   						    
      GeometricObject[] shapes = new GeometricObject[7];  
      shapes[0] = geometricObject1;  
      shapes[1] = geometricObject2;  
      shapes[2] = geometricObject3;  
      shapes[3] = geometricObject4;  
      shapes[4] = geometricObject5;  
      shapes[5] = geometricObject6;  
      shapes[6] = geometricObject7;  
     
      for (int i = 0; i < shapes.length; i++)  
      {  
         System.out.println("GeometricObject number " + (i + 1));  
         System.out.println(shapes[i]);  
         System.out.println("area = " + shapes[i].area());  
         System.out.println("volume = " + shapes[i].volume());  
         if (shapes[i] instanceof Circle)  
         {  
            System.out.println("Circle radius = " + ((Circle) shapes[i]).getRadius());  
         }  
         if (shapes[i] instanceof Cylinder)  
         {  
            System.out.println("Cylinder height = " + ((Cylinder) shapes[i]).getHeight());  
         }  
         if (shapes[i] instanceof Rectangle)  
         {  
            System.out.println("Rectangle length = " + ((Rectangle) shapes[i]).getLength()  
                            + " Rectangle width = " + ((Rectangle) shapes[i]).getWidth());  
         }  
         if (shapes[i] instanceof Square)  
         {  
            System.out.println("Square side = " + ((Square) shapes[i]).getSide());  
         }  
         if (shapes[i] instanceof Box)  
         {  
            System.out.println("Box height = " + ((Box) shapes[i]).getHeight());  
         }  
       
         System.out.println("\n\n");  
          
      }  
   						    
     
   }  
    
}





























































































