package bok.kapitel3;

import javax.swing.*;

public class ovning36 {
    public static void main(String[] args) {
        int tid, tim, min, sek;
        tid = Integer.parseInt(JOptionPane.showInputDialog("Hur många sekunder tog datorberäkningen"));
        tim = tid/3600;
        tid = tid % 3600;
        min = tid/60;
        sek = tid%60;
        JOptionPane.showMessageDialog(null, "Datorberäkningen tog " + tim + " timar " + min + " minuter och " + sek + " sekunder");
    }
}
