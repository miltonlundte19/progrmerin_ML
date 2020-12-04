package Diagnos;

import javax.swing.*;
import java.awt.*;

public class gisasimpel {
    public static void main(String[] args) {
        double taldec;
        int talet;
        int gis;
        taldec = Math.random()*100;
        talet = (int) taldec;
        boolean gisningen = true;
        boolean gisapåtall = true;
        int agis = 0;
        while (gisningen) {
            agis++;
            while (gisapåtall) {
                gisapåtall = false;
                try {
                    gis = Integer.parseInt(JOptionPane.showInputDialog("gisa på talet"));
                } catch (NumberFormatException e) {
                    gisapåtall = true;
                    String exit = JOptionPane.showInputDialog("exit?");
                    if (exit == null)
                        break;
                    e.printStackTrace();
                } catch (HeadlessException e) {
                    e.printStackTrace();
                }
            }
            if (gis == talet) {
                break;
            }
            else if (gis < talet) {
                JOptionPane.showMessageDialog(null, "talet är mindre.");
                gis = talet;
            }
            else if (gis > talet) {
                JOptionPane.showMessageDialog(null, "talet är störe.");
                gis = talet;
            }

        }
    }
}
