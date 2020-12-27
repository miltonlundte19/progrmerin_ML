package bok.kapitel1;

import javax.swing.*;
import java.util.Calendar;

public class pgup11 {
    public static void main(String[] args) {
        String a = Calendar.getInstance() .getTime() .toString();
        JOptionPane.showMessageDialog(null, "Datum och tid:\n" + a);
    }
}
