package bok.kapitel2;

import javax.swing.*;

public class Hej2 {
    public static void main(String[] args) {
        String namn;
        String hälsning;
        namn = JOptionPane.showInputDialog("Vad heter du?");
        hälsning = "välkommen " + namn;
        JOptionPane.showMessageDialog(null, hälsning);
    }
}
