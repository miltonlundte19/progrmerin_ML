import javax.swing.*;

public class gympris {
    public static void main (String[] arg) {
        int visits = Integer.parseInt(JOptionPane.showInputDialog("hur m\u00e5nga g\u00e5nger planerar du att bes\u00f6ka gymet"));
        double biljet = Double.parseDouble(JOptionPane.showInputDialog("hur myket kostar en biljet"));
        double kort = Double.parseDouble(JOptionPane.showInputDialog("hur myket kostar ett \u00e5rskort"));
        double prisvisi = visits * biljet;
        if (prisvisi > kort) {
            JOptionPane.showMessageDialog(null, "du beh\u00f6ver inte k\u00f6pa \u00e5rskortet f\u00f6r att spara pengar");
        } else {
            JOptionPane.showMessageDialog(null, "du sparar pengar p\u00e5 att k\u00f6pa ett \u00e5rskort");
        }

    }
    }
