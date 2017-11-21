public class ArrayGet {
    public static void main(String [] args) {
        int startIndex = 5;
        int [] a = {2,6,2,8,2,4,8,2,4,8,21,4,8,1,4,8,5,4,7,85,5};
        int returnVal = arrayGet(a, startIndex);
        System.out.println(returnVal);
    }

    public static int arrayGet(int [] a, int startIndex) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        while (startIndex < a.length) {
            if (startIndex < a.length && a[startIndex] < min) {
                min = a[startIndex];
                minIndex = startIndex;
            }
            startIndex++;
        }
        return minIndex;
    }
}