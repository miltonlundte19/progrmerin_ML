package bok.kapitel1;

import javax.swing.*;

public class Verson {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Du kör " + System.getProperty("os.name") + " idag");
        JOptionPane.showMessageDialog(null, System.getProperty("os.name") + " skall vara namnet på det operativsystem som används.");
    }
}
