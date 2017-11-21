import java.util.*;

public class Star {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("How many stars would you like?");
        int star = scan.nextInt();
        System.out.println();
        for ( int index = 1; index <= star ; index++ ){
            for (int spaces = 1 ; spaces <= star - index; spaces++) {
               System.out.print(" ");
            }
            for (int line = index; line >= 1; line-- ) {
                 System.out.print("* ");
            }
            System.out.println();
        }
    }  
}