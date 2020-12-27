package bok.kapitel2;

import javax.swing.*;
import java.util.Calendar;

public class pgup21 {
    public static void main(String[] args) {
        String a = Calendar.getInstance() .getTime() .toString();
        int i = a.indexOf(':') - 2;
        int j = a.lastIndexOf(':') + 3;
        a = a.substring(i,j);
        JOptionPane.showMessageDialog(null, "Klockan är: " + a);
    }
}
