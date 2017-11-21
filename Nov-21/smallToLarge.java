public class smallToLarge {
    public static void main(String[] args) {
        int[] a = MakeArray.unsorted(10, 1, 100);
        sort(a);
    }

    public static void sort(int a[]) {
        for (int selection = 0; selection < a.length - 1; selection++) {
            int smallIndex = findSmallIndex(a, selection);
            swap(a, smallIndex, selection);
        }
    }

    public static int findSmallIndex(int[] a, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < a.length; i++)
            if (a[i] < a[minIndex])
                minIndex = i;
        return minIndex;
    }

    public static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}