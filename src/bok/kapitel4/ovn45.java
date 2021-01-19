package bok.kapitel4;

import javax.swing.*;

public class ovn45 {
    public static void main(String[] args) {
        double norkos, kvalhelgkos, start, knap, minu, kostnad;
        norkos = 2.5;
        kvalhelgkos = 0.55;
        start = 0.6;
        minu = Double.parseDouble(JOptionPane.showInputDialog("hur många minuter varade samtalet?"));
        knap = JOptionPane.showConfirmDialog(null, "Ringde du samtalet under kvällstid eller på helgen?");
        if (knap == 0) {
            kostnad = start + (kvalhelgkos*minu);
            JOptionPane.showMessageDialog(null, kostnad+"kr kostade samtalet.");
        } else if (knap == 1) {
            kostnad = start + (norkos*minu);
            JOptionPane.showMessageDialog(null, kostnad+"kr kostade samtalet.");
        } else {
            JOptionPane.showMessageDialog(null, "Beräkningen avbrutes");
            System.exit(0);
        }

    }
}
