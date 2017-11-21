import java.util.*;
public class ComplexNumber{	
   private double real;
   private double imaginary;	
   private static int count;
   public ComplexNumber(double real, double imaginary){
      setReal(real);
      setImaginary(imaginary);
      count++;
   }
   public ComplexNumber(){
      this(0.0, 0.0);
   }
   public ComplexNumber(double real){
      this(real, 0.0);
   }
   public ComplexNumber(ComplexNumber value){
      this(value.getReal(), value.getImaginary());
   }
   public void setReal(double real){
      this.real = real;
   }
   public double getReal(){
      return real;
   }
   public void setImaginary(double imaginary){
      this.imaginary = imaginary;
   }
   public double getImaginary(){
      return imaginary;
   }
   public int getCount(){
      return count;
   }
   public double add(){
      return real + imaginary;
   }
   public double subtract(){
      return real - imaginary;
   }
   public double multiply(){
      return real * imaginary;
   }
   public boolean isZero(){
      if (real == 0.0 && imaginary == 0.0)
         return true;
      else
         return false;
   }
   public String toString(){
      if (imaginary >= 0.0)
         return real + " + " + imaginary + "i";
      else
         return real + " - " + imaginary + "i";
   }
   public ComplexNumber valueOf(String x){
      x = x.replace('+', ' ');
      x = x.replace('i', ' ');
      Scanner stringIn = new Scanner(x);
      return new ComplexNumber(stringIn.nextDouble(), stringIn.nextDouble());            
   }	
}