import javax.swing.*;

public class notpadclone {
    public static void main(String[] args) {
        JFrame frame = new JFrame("notpadclone");
        frame.setContentPane(new notpadclone().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
}
