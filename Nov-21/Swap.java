public class Swap {
    public static void main(String [] args) {
        int [] a = {25,8,1,48,15,4815,8,15,48,51,48,15,4,5,6,5,46,1,64,45,6,4,4};
        swap(a, 5,15);
    }

    public static void swap(int [] a, int firstIndex, int secondIndex) {
        int firstTemp = a[firstIndex];
        int secondTemp = a[secondIndex];
        a[firstIndex] = secondTemp;
        a[secondIndex] = firstTemp;
    }
}