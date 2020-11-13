package kapitel5;

import javax.swing.*;

public class ov53 {
    public static void main(String[] args) {
        String hh = JOptionPane.showInputDialog("vilken höjd slepte du billen (i meter)");
        double h = Double.parseDouble(hh);
        h = h*100;
        System.out.println(h);
        int stuts = 0;
        while (h >= 1) {
        h = h * 0.7;
        System.out.println(h);
        stuts++;
        }
        JOptionPane.showMessageDialog(null,"bollen stutsade " + stuts + " gånger");
    }
}
