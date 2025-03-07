package packages;

import javax.swing.*;
import java.awt.Font;
public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);
        Font customFont = new Font("Arial", Font.PLAIN, 16);
        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your participation!");
        thankYouLabel.setBounds(10, 10, 200, 20);
        thankYouLabel.setFont(customFont);
        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
