import java.util.*;

public class Methods {
    public static void main(String [] args) {
        System.out.println();
        //Find sum of three ints on an input line, where the numbers are separated by whitespace
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int sum = add3(line); //Line is an argument, technically line is an actual perameter
        System.out.println(sum);
    }

    public static int add3(String numbers) {
        Scanner stringScan = new Scanner(numbers);
        int num1 = stringScan.nextInt();
        int num2 = stringScan.nextInt();
        int num3 = stringScan.nextInt();
        int sumOf3 = num1 + num2 + num3;
        return sumOf3;
    }
}