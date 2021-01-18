package bok.kapitel4;

import javax.swing.*;

public class ovn41 {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Hur många minuter ringer du i månaden i genomsnit?"));
        double minpri = Double.parseDouble(JOptionPane.showInputDialog("Vad kostar samtalen pär minut?"));
        double tokos = min * minpri;
        if (tokos >= 1000) {
            tokos = tokos*0.9;
        }
        JOptionPane.showMessageDialog(null, "det kostar " + tokos + " för dej att ringa i månaden.");
    }
}
