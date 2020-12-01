package Diagnos;

import javax.swing.*;
import java.awt.*;

public class gissatalet {
    public static void main(String[] args) {
        double svar1;
        int svar2 = 1;
        svar1 = Math.random()*100;
        svar2 = (int) svar1;
        boolean k = true;
//---------------------------------------------Debug-----------------------------
        System.out.print(svar2);
//---------------------------------------------Debug-----------------------------
        int nedre = 1;
        int uppre = 100;
        int fgis = 0;
        int gis = 0;
        int agis = 0;
        String svar = "dat tog " + gis + " försök att gisa på " + svar2;
        boolean i = true;
        boolean c = false;
        boolean y = true;
//---------------------------------------------temporär-----------------------------
        String text = "Gisa på ett tall mellen " + nedre + " och " + uppre;
//---------------------------------------------temporär-----------------------------
        try {
            gis = Integer.parseInt(JOptionPane.showInputDialog(text));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "skrivit fell så gisningen blir 50" );
            gis = 50;
            fgis++;
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        while (k) {
//---------------------------------------------Debug-----------------------------<
            System.out.print("a");
            int noo = 0;
            System.out.print(noo);
            noo++;
            if (noo == 100) {
                System.exit(0);
            }
//---------------------------------------------Debug----------------------------->
            if (gis == svar2) {
//---------------------------------------------Debug-----------------------------<
            System.out.print("g");
//---------------------------------------------Debug----------------------------->
                if (agis == 0) {
                    svar = "gratis du gisade rett på första försöket!!";
                    y = false;
                    k = false;
                    break;
                }
                agis++;
                k = false;
//---------------------------------------------Debug-----------------------------<
                System.out.print("y");
//---------------------------------------------Debug----------------------------->
            } else if (gis < svar2) {
                nedre = gis;
                agis++;
//---------------------------------------------Debug-----------------------------<
                System.out.print(3);
                gis = -1000;
//---------------------------------------------Debug----------------------------->
            } else if (gis > svar2) {
                uppre = gis;
                agis++;
//---------------------------------------------Debug-----------------------------<
                System.out.print(4);
                gis = 1000;
//---------------------------------------------Debug----------------------------->
            } else {
                fgis++;
                JOptionPane.showMessageDialog(null,"du gisade på ett tal som inte är giltigt");
            }
            i =false;
        }

    }

}

/*
            System.out.print("jj");
            while (i = false) {
                System.out.print("L");
                i = true;
                try {
                    gis = Integer.parseInt(JOptionPane.showInputDialog("Gisa på ett tall mellen " + nedre + " och " + upppre));
                } catch (NumberFormatException e) {
                    i = false;
                    fgis++;
                    JOptionPane.showMessageDialog(null,"du gisade fell försök i gen!" + "\nmåste vara ett hel tal");
                } catch (HeadlessException e) {
                    e.printStackTrace();
                }
                System.out.println("h " + svar2 + gis);
            }
            System.out.println(gis + " " + svar2);
        }
        if (fgis > 5) {
            y = false;
        }
        if (y) {
            svar = svar + "\ndu gisade fell " + fgis + " gånger";
        }
        JOptionPane.showMessageDialog(null, svar);
 */