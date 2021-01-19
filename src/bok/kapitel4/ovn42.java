package bok.kapitel4;

import javax.swing.*;
//gympris
public class ovn42 {
    public static void main(String[] args) {
        double årkor, billje, biltopris;
        int besök;
        årkor = Double.parseDouble(JOptionPane.showInputDialog("Vad kostar ett årskort?"));
        billje = Double.parseDouble(JOptionPane.showInputDialog("Vad kostar en biljett?"));
        besök = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger tenker du besöka gymet?"));
        biltopris = billje * besök;
        if (biltopris > årkor) {
            JOptionPane.showMessageDialog(null, "Du sparar inte några pengar på att köpa ett årskort.");
        } else {
            JOptionPane.showMessageDialog(null, "du sparar pengar på att köpa ett årskort.");
        }
    }
}
