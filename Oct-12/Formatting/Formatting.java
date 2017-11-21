import java.text.DecimalFormat;
import javax.swing.*;

public class Formatting {
    public static void main(String[] args) {

        final String MONEY_FORMAT = "$#,##0.00";
        DecimalFormat f = new DecimalFormat(MONEY_FORMAT);
        double x = 1234.5678;
        String s = f.format(x);
        System.out.println();
        System.out.println(s);

        final String PERCENT = "#,###.000%";
        double d = .0127;
        DecimalFormat g = new DecimalFormat(PERCENT);
        s = g.format(d);
        System.out.println(s);
        System.out.println(Math.PI);

        int a = 17;
        a = Math.abs(a);
        a = -a;
        a = Math.abs(a);

        long v = 12L;
        double min = Math.min(x, v);
        //long min2 = Math.min(x, v); <-- Doesn't work because of the invalid datatype. You cannot convert a double into a long
        long min2 = Math.min((long) x, v); //Casts x as a long

        String s2 = JOptionPane.showInputDialog(null, "Where do you live?");
        JOptionPane.showMessageDialog(null, "You live in " + s2);

    }
}
