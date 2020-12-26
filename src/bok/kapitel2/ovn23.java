package bok.kapitel2;

import javax.swing.*;

public class ovn23 {
    public static void main(String[] args) {
        String fnamn, enamn, helsning;
        fnamn = JOptionPane.showInputDialog("Vad är dit förnamne");
        enamn = JOptionPane.showInputDialog("Vad är dit efternamn");
        helsning = "Välkommen " + fnamn + " " + enamn;
        JOptionPane.showMessageDialog(null, helsning);
    }
}
