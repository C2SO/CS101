import java.util.*;

public class Recursion {
    public static void main( String [] args) {
        Scanner scan = new Scanner(System.in);
        String original;
        String reverse = "";
        System.out.println("What do you want to reverse?");
        original = scan.next();
        reverse = reversal(original, reverse);
        System.out.println(reverse);
    }
    
    public static String reversal(String original, String reverse) {
        for (int index = original.length()-1; index >= 0; index--) {
            reverse += original.charAt(index);
        }
        return reverse;
    }
}