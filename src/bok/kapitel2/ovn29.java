package bok.kapitel2;

import javax.swing.*;

public class ovn29 {
    public static void main(String[] args) {
        String a = " Erik Andersson 860314-2714 ";
        a = a.trim();
        int i = a.lastIndexOf(' ') + 1;
        int j = a.indexOf('-');
        String b = a.substring(i,j);
        System.out.println(b);
        i = b.indexOf('6') + 1;
        j = b.indexOf('1');
        String k = b;
        String c = b.substring(i,j);
        String d = b.substring(j);
        System.out.println(c);
        System.out.println(d);
        b = c + "/" + d;
        k = k.substring(i,j) + "/" + k.substring(j);
        JOptionPane.showMessageDialog(null, b + "\n" + k);

    }
}
