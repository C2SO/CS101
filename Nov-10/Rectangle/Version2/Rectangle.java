public class Rectangle
{
  private double length;
  private double width;
  
  public Rectangle() //noargs constructor
  {
    setLength(0.0);
    setWidth(0.0);
  }
  
  public Rectangle(double length, double width)
  {
    setLength(length);
    setWidth(width);
  }
  
  public void setLength(double length)
  {
    this.length = length;
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