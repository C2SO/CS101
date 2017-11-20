public class LinearSortedSearch {
    public static void main(String[] args) {
        //size, lower bound, gap
        int[] a = MakeArray.sorted(10, 20, 5);
        int value = 27;
        int index = search(a, value);
        System.out.println(index);
    }

    public static int search(int [] a, int value) {
        int index = 0;
        boolean found = false;
        while (index < a.length && !found){
            if (a[index] == value)
                found = true;
            else if (a[index] > value)
                return -1;
            else
                index++;
        }
        if (found)
            return index;
        else
            return -1;
    }
}