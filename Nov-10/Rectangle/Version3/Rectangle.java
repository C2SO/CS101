public class Rectangle
{
  private double length;
  private double width;
  
  //class constants
  public static final double DEFAULT_LENGTH = 2.0;
  public static final double DEFAULT_WIDTH = 1.0;
  
  public Rectangle() //noargs constructor
  {
    this(DEFAULT_LENGTH, DEFAULT_WIDTH);
  }
  
  public Rectangle(double length, double width)
  {
    setLength(length);
    setWidth(width);
  }
  
  public void setLength(double length)
  {
    if (length >= 0.0)
      this.length = length;
    else
      this.length = DEFAULT_LENGTH;  
  }
  
  public double getLength()
  {
    return length;
  }
  
  public void setWidth(double width)
  {
    this.width = width;
  }
  
  public double getWidth()
  {
    return width;
  }
  
  public String toString()
  {
    return "A rectangle with length: " + length +
           "\n         and width: " + width;
  }
  
  public double area()
  {
    return length * width;
  }
  
  public double perimeter()
  {
    return 2 * (length + width);
  }

}