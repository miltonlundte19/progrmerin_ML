package bok.kapitel6;

import javax.swing.*;

public class ovn62 {
    public static void main(String[] args) {
        double m = Double.parseDouble(JOptionPane.showInputDialog("m?"));
        double n = Double.parseDouble(JOptionPane.showInputDialog("n?"));
        double r = 2;
        System.out.print(m);
        System.out.println(n);
        if (r >= 0) {
            r = m/n;
            System.out.println(r);
            m = n;
            n = r;
            System.out.println(m);
            System.out.println(n);
        }
        JOptionPane.showMessageDialog(null, n);
    }
}
