package bok.kapitel3;

import javax.swing.*;

public class radienvcirkel {
    public static void main(String[] args) {
        String radien = JOptionPane.showInputDialog("vad är radien av cirkeln?");
        double r = Double.parseDouble(radien);
        double pi = 3.1415926536;
        double ar = pi * r * r;
        double om = 2 * pi * r;
        JOptionPane.showMessageDialog(null, "Cirkelns omkrets är " + om + "\noch arian är " + ar);
    }
}
//- 3.3