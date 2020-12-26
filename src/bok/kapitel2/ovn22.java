package bok.kapitel2;

import javax.swing.*;

public class ovn22 {
    public static void main(String[] args) {
        String namn = "Milton Lund";
        String adres = "Trädgårdsgatan 23b";
        String tele = "072-533-95-19";
        String allas = namn + "\n" + adres + "\n" + tele;
        JOptionPane.showMessageDialog(null, allas);
    }
}
