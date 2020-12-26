package bok.kapitel2;

import javax.swing.*;

public class ovn27 {
    public static void main(String[] args) {
        char c1, c2, c3;
        c1 = '\u00d8';
        c2 = '\u00f8';
        c3 = '\u03c0';
        String s = c1 + " " + c2 + " " + c3;
        JOptionPane.showMessageDialog(null, s);
    }
}
