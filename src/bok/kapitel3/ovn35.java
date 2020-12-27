package bok.kapitel3;

import javax.swing.*;

public class ovn35 {
    public static void main(String[] args) {
        double var = Double.parseDouble(JOptionPane.showInputDialog("vad kostar varan"));
        int moms = Integer.parseInt(JOptionPane.showInputDialog("vad är momsen (i hela prosent)"));
        double momsd, imomsd, momspr, varmm;
        momsd = moms / 100.0;
        imomsd = 1 - momsd;
        momspr  = var * momsd;
        varmm = var * imomsd;
        JOptionPane.showMessageDialog(null, "");

    }
}
