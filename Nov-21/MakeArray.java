public class MakeArray {
    public static int [] unsorted(int size, int lowBound, int highBound){
        int range = highBound - lowBound + 1;
        int [] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            int value = (int)(Math.random() * range) + lowBound;
            a[i] = value;
        }
        return a;
    }

    public static int [] sorted(int size, int lowBound, int gap){
        int [] a = new int[size];
        a[0] = lowBound + (int)(Math.random() * gap);
        for (int i = 1; i < a.length; i++) {
            int displacement = (int)(Math.random() * gap) + 1;
            a[i] = a[i - 1] + displacement;
        }
        return a;
    }
}