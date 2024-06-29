import java.time.*;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class DaysUntil {
    public static void main(String[] args) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate target = LocalDate.of(2024, 11, 26);
        int daysUntil = (int) ChronoUnit.DAYS.between(today, target);
        JOptionPane.showMessageDialog(null, daysUntil + " days until November 26!");
    }
}
