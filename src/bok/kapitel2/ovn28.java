package bok.kapitel2;

import javax.swing.*;

public class ovn28 {
    public static void main(String[] args) {
        String a, b;
        a = "Programspråk";
        b = a.substring(4,8);
        b = b + a.charAt(5);
        JOptionPane.showMessageDialog(null, b);
    }
}
