public class TwoDArray {
    public static void main(String[] args) {
        System.out.println();
        //The ammount of arrays listed is the amount of dimensions the array is
        int[][] a = new int[3][4]; //2 dimensional
        for (int row = 0; row < a.length; row++) { //Size of first array
            for (int col = 0; col < a[row].length; col++) { //Size of second array
                a[row][col] = (row + 1) * 10 + col + 5;
            }
        }
        for (int row = 0; row < a.length; row++) {
            System.out.print("Row " + row + ": ");
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] b = new int[3][];
        b[0] = new int [3];
        b[1] = new int [4];
        b[2] = new int [2];
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                a[row][col] = (row + 1) * 10 + col + 5;
            }
        }
        for (int row = 0; row < b.length; row++) {
            System.out.print("Row " + row + ": ");
            for (int col = 0; col < b[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}