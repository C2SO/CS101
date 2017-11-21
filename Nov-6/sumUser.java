import java.util.*;

public class sumUser {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        final int SENTINEL = -1;
        int userNumber;
        double counter = 0;
        int sumNumber = 0;
        System.out.println("Enter an integer you want to add. Type -1 to stop.");
        userNumber = scan.nextInt();
        while (userNumber != SENTINEL) {
            sumNumber = sumNumber + userNumber;
            counter++;
            System.out.println("Add another number. Type -1 to stop.");
            userNumber = scan.nextInt();
        }
        if (counter == 0)
            System.out.println("You did not input a number");
        else {
            System.out.println("The sum is " + sumNumber);
            System.out.println("The average is " + sumNumber/counter);
        }
    }
}