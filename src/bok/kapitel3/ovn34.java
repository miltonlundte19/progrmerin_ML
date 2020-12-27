package bok.kapitel3;

import javax.swing.*;

public class ovn34 {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("hur många minuter ringer du i månaden i genomsnit"));
        double minpri = Double.parseDouble(JOptionPane.showInputDialog("vad kostar samtalen pär minut"));
        double tokos = min * minpri;
        JOptionPane.showMessageDialog(null, tokos + " ");
    }
}
