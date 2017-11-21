public class BubbleSortV1 {
    public static void main(String[] args) {
        int[] a = MakeArray.unsorted(10, 1, 100);
        sort(a);
    }

    public static void sort(int a[]) {
        boolean sorted = false;
        int bottom = a.length - 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < bottom; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}