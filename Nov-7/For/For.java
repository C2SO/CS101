public class For {
    public static void main(String [] args) {
        System.out.println();
        int index;
        for(index = 0; index <= 10; index++)
            System.out.println(index);
        System.out.println();
        for(index = 10; index >= 0; index--)
            System.out.println(index);
        System.out.println();
        for(index = 5; index <= 100; index += 5)
            System.out.println(index);
        System.out.println();
        String line = "abcdefghijklmnopqrstuvwxyz";
        for(index = 0; index <= line.length() - 1; index ++)
            System.out.println(line.charAt(index));
        System.out.println();
        for (char letter = 'a'; letter <= 'z'; letter++)
            System.out.println(letter);
    }       
}