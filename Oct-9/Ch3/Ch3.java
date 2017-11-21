/* Class Definitions
   Rahbany, Nicholas
*/

//Object - Thing (instance of class is synonym)
//Objects have data (fields) and operations
//Fields are stored in varables which belong to the object (instance variables)
//Operations are coded in methods

//Some methods belong to the class
//The static keyword modified these method names

//Construction of an object:
//ClassName variable;
//This declares variable or be a reference type
//It may contain the address of an object constructed from the class

//Calling a constructor:
//variable = new ClassName();

//Calling a method of an object:
//variable.methodName();

//variable - null;
//variable refers to no object;

//If two variables refer to the same object, they are aliases 

//An object with no references is GARBAGE
//Java has an automatic garbage collector

public class Ch3 {
   public static void main(String [] arg) {
   
      String s = new String();
      System.out.println("s: " + s);
      System.out.println("Length of s: " + s.length());
      System.out.println();
      String t = new String("Hello");
      System.out.println("t: " + t);
      System.out.println("Length of t: " + t.length());
      System.out.println();
      // s = null;
      // System.out.println("s: " + s);
      // System.out.println("Length of s: " + s.length);
      // A runtime error will be made
      s = t; //s and t are aliases
      System.out.println("s: " + s + ", t: " + t + ", therefore s = t");
      System.out.println("Length of s: " + s.length());
      System.out.println();
      System.out.println("s at character 0: " + s.charAt(0));
      System.out.println("s at character 1: " + s.charAt(1));
      System.out.println("s at character 2: " + s.charAt(2));
      System.out.println("s at character 3: " + s.charAt(3));
      System.out.println("s at character 4: " + s.charAt(4));
      //System.out.println("s at character 5: " + s.charAt(5));
      //An error occurs when you go out of range
      
   }
}