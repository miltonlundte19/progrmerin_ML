package bok.kapitel5;

import javax.swing.*;

public class ov54 {
    public static void main(String[] args) {
        while (true) {
            String hh = JOptionPane.showInputDialog("vilken höjd slepte du billen (i meter)");
            if (hh == null)
                break;
            double h = Double.parseDouble(hh);
            h = h*100;
            int stuts = 0;
            while (h >= 1) {
                h = h*0.7;
                stuts++;
            }
            JOptionPane.showMessageDialog(null,"bollen stutsade " + stuts + " gånger");
        }

    }
}
