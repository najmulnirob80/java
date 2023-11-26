import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;

public class OpenUrlWithButton extends JFrame implements ActionListener {
    private JButton button;

    public OpenUrlWithButton() {
        super("Open URL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to open the URL
        button = new JButton("Open URL");
        button.addActionListener(this);

        // Add the button to the frame
        JPanel panel = new JPanel();
        panel.add(button);
        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String url = "https://www.example.com";
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI(url));
                }
            } else {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("xdg-open " + url);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to open URL: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new OpenUrlWithButton();
    }
}
