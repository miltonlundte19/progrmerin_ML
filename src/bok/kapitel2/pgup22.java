package bok.kapitel2;

import javax.swing.*;

public class pgup22 {
    public static void main(String[] args) {
        String fulnam = JOptionPane.showInputDialog("Vad är dit namn (efternamn, förnamn)");
        int i = fulnam.indexOf(" ") + 1;
        fulnam = fulnam.substring(i);
        char febok = fulnam.charAt(0);
        febok = Character.toUpperCase(febok);
        fulnam = fulnam.substring(1);
        fulnam = febok + fulnam;
        JOptionPane.showMessageDialog(null, "Hej " + fulnam);
    }
}
