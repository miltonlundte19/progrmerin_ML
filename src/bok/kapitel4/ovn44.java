package bok.kapitel4;

import javax.swing.*;

public class ovn44 {
    public static void main(String[] args) {
        int bredd, langd, tjocklek, total;
 //       bredd = 110;
   //     längd = 500;
     //   tjocklek = 90;

        bredd = Integer.parseInt(JOptionPane.showInputDialog("vilken bredd har brevet i mm"));
        langd = Integer.parseInt(JOptionPane.showInputDialog("vilken längd har brevet i mm"));
        tjocklek = Integer.parseInt(JOptionPane.showInputDialog("vilken tjocklek har brevet i mm"));
        if ((langd < 140)||(600 < langd))
            JOptionPane.showMessageDialog(null, "Felaktiga mått 1");
        else if (bredd < 90)
            JOptionPane.showMessageDialog(null, "Felaktiga mått 2");
        else  if (100 < tjocklek)
            JOptionPane.showMessageDialog(null, "Felaktiga mått 3");
        else {
            total = bredd + langd + tjocklek;
            if (total > 900)
                JOptionPane.showMessageDialog(null, "Felaktiga mått 4");
            else
                JOptionPane.showMessageDialog(null, "Måtten OK");
        }
    }
}
