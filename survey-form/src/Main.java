import javax.swing.*;
import packages.informationPage;
import java.awt.Font;
public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("Survey Form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Font customFont = new Font("Arial", Font.PLAIN, 14);
        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create title label
        JLabel title = new JLabel("Survey Form");
        title.setBounds(10, 10, 100, 20);
        title.setFont(customFont);

        // Create start button
        JButton startButton = new JButton("start!");
        startButton.setBounds(10, 40, 100, 20);
        startButton.setFont(customFont);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
