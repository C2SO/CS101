import java.util.*;

public class Switch
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("What is your favorite color? ");
    String color = in.next();
    in.nextLine();
    switch(color.toLowerCase())
    {
      case "blue": System.out.println("great choice, you have a great future.");
                    break;
      case "green": System.out.println("That is unfortunate");
                    break;
      case "pink": System.out.println("almost red");
                    break;
      case "purple": System.out.println("rhymes with orange");
                    break;
      case "orange": System.out.println("rhymes with purple");
                    break;
      default : System.out.println("Is that a color?");
    }
  }
}