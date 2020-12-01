package Diagnos;

import javax.swing.*;

public class multiwhile {
    public static void main(String[] args) {
        while (true) {
            String m = JOptionPane.showInputDialog("vilken multiplikationstabell?");
            if (m == null)
                break;
            int n = Integer.parseInt(m);
            int i = 1;
            String mult = n + "*1" + n;
            while (i <= 9) {
                i++;
                int mult1 = n * 1;
                mult = mult + "\n" + n + "*" + i + "=" + mult1;
            }
            JOptionPane.showMessageDialog(null, mult);
        }
    }
}