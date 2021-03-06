public class CompareFloatingPoint {
    public static void main(String [] args) {
        double d = 0.001;
        double e = 0.0001;
        double f = e+e+e+e+e+e+e+e+e+e;
        System.out.println();
        if (d == f)
            System.out.println("equal");
        else
            System.out.println("not equal");

        //Numbers are not stored with complete accuracy, errors accumulate

        final double DELTA = 0.0000000001;
        //if two floating points are within DELTA of each other, we consider them to be the same

        if (Math.abs(d - f) < DELTA)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}