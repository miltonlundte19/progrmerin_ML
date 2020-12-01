package bok.kapitel5;

import javax.swing.*;

public class ov51 {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("n?");
        int n = Integer.parseInt(s);
        int summa=0;
        int k=1;
        while (k <= n) {
            summa = summa + k*k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "summan blir " + summa);
    }
}
