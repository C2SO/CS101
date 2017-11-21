import javax.swing.*;
import java.text.DecimalFormat;

public class JOptionPaneTest {
    public static void main(String[] args) {
    
    //Display Name
    
    String name = JOptionPane.showInputDialog(null, "What is your name?");
    JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    
    //Display Age after 10 years
     
    String age = JOptionPane.showInputDialog(null, "What is your age?");
    int ageTen = Integer.parseInt(age) + 10;
    JOptionPane.showMessageDialog(null, "In ten years, you will be " + ageTen);
    
    //Display salary after 10% raise
    
    final String SALARY_FORMAT = "$#,###,##0.00";
    DecimalFormat f = new DecimalFormat(SALARY_FORMAT);
    String salary = JOptionPane.showInputDialog(null, "What is your salary?");
    double salaryTen = Integer.parseInt(salary) * 1.1;
    JOptionPane.showMessageDialog(null, "With a 10% raise, your salary will be " + f.format(salaryTen) );
    
    }
}