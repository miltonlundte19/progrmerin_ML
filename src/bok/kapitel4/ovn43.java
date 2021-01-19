package bok.kapitel4;

import javax.swing.*;

public class ovn43 {
    public static void main(String[] args) {
        int poäng = Integer.parseInt(JOptionPane.showInputDialog("Hur mångapoäng fik du på provet?"));
        if (poäng < 25)
            JOptionPane.showMessageDialog(null, "Du lykades inte på provet. F");
        else if (poäng < 30)
            JOptionPane.showMessageDialog(null, "du fick E på provet.");
        else if (poäng < 35)
            JOptionPane.showMessageDialog(null, "du fick D på provet.");
        else if (poäng < 40)
            JOptionPane.showMessageDialog(null, "Du fick C på provet.");
        else if (poäng < 45)
            JOptionPane.showMessageDialog(null, "Du fick B på provet.");
        else
            JOptionPane.showMessageDialog(null, "Du fick A på provet.");
    }
}
