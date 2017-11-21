public class LetterFun {
    public static void main (String [] args) {
        for (char letters = 'a'; letters <= 'z' ; letters ++)  {
            for (char letter = letters; letter <= 'z'; letter ++) {
                System.out.print("" + letters + letter + " ");
            }
            System.out.println();
        }
    }
}