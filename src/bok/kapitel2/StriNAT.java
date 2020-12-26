package bok.kapitel2;

import javax.swing.*;

public class StriNAT {
    public static void main(String[] args) {
        String s1, s2, s3, s4;
        s1 = "Milton Lund";
        s2 = "Trägårdsgatan23b";
        s3 = "072-533-95-19";
        s4 = s1 + "\n" + s2 + "\n" + s3;
        JOptionPane.showMessageDialog(null, s4);
    }
}
