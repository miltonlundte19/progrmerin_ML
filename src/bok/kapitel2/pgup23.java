package bok.kapitel2;

import javax.swing.*;

public class pgup23 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Skriv en menig med minst två ord");
        a = a.trim();
        int u = a.length();
        int i = a.indexOf(" ");
        int j = a.lastIndexOf(" ");
        JOptionPane.showMessageDialog(null, "DU skrev en text med " + u + " tecken \n " +
                "Det första ordet var \"" + a.substring(0,i) + "\"" +
                "\nDet sisra ordet var \"" + a.substring(j) + "\"");
    }
}
