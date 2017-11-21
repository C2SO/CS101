/*
   String Stuff
   Rahbany, Nicholas
*/

public class StringStuff {
   public static void main(String [] args) {
      
      String s = "I'm never gonna give you up, never gonna let you down, never gonna run around and hurt you.";
      int pos = s.indexOf('d');
      pos = s.indexOf('g');
      pos = s.indexOf('g', pos + 1);
      s.toUpperCase();
      String t = s.toUpperCase();
      String z = s.toLowerCase();
      int indexOfU = s.indexOf('u');
      String sub = s.substring(3, indexOfU);
      String sub2 = s.substring(indexOfU + 1);
      
      String name = "Ray Thomas";
      int indexSpace = name.indexOf(' ');
      String firstName = name.substring(0, indexSpace);
      String lastName = name.substring(indexSpace + 1);
      System.out.println(firstName + " " + lastName);
      System.out.println(lastName + ", " + firstName);      
      
   }
}