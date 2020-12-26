package bok.kapitel2;

import javax.swing.*;

public class ovn26 {
    public static void main(String[] args) {
        char c1, c2;
        c1 = '\u00d8';
        c2 = '\u00f8';
        String s = c1 + " " + c2;
        JOptionPane.showMessageDialog(null, s);
    }
}
