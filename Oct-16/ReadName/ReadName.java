/*
   Read Name
   Rahbany, Nicholas
*/

import java.util.*;

public class ReadName {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String swap = SwapMethod(line);
        System.out.println(swap);
    }
    public static String SwapMethod(String name) {
        Scanner nameFor = new Scanner(name);
        String firstName = nameFor.next();
        String lastName = nameFor.next();
        String firstLetter = firstName.substring(0,1);
        String lastLetter = lastName.substring(0,1);
        String firstRemoved = firstName.substring(1);
        String lastRemoved = lastName.substring(1);
        String finalSwap = lastLetter + firstRemoved + " " + firstLetter + lastRemoved;
        return finalSwap;
    }
}