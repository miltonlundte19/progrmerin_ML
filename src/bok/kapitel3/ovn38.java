package bok.kapitel3;

import javax.swing.*;

public class ovn38 {
    public static void main(String[] args) {
        int mån, tis, ons, tor, fre, lör, sön, max;
        mån = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena måndagen"));
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+mån );
        tis = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena tisdagen"));
        max = Math.max(mån,tis);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
        ons = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena onsdag"));
        max = Math.max(ons,max);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
        tor = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena torsdagen"));
        max = Math.max(tor,max);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
        fre = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena fredag"));
        max = Math.max(fre,max);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
        lör = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena lördag"));
        max = Math.max(lör,max);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
        sön = Integer.parseInt(JOptionPane.showInputDialog("vilken tempratur var det klokan 13 dena söndag"));
        max = Math.max(sön,max);
        JOptionPane.showMessageDialog(null, "Den hittills högsta tempraturen är "+max );
    }
}
