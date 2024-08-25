package n0rzik.idealauncher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcherideal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Launcherideal::GUI);
    }

    private static void GUI() {
        JFrame frame = new JFrame("IdeaLauncheR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
        buttonPanel.setOpaque(false);

        JButton playButton = new JButton("Play");
        JButton settingsButton = new JButton("Setting");

        playButton.setPreferredSize(new Dimension(150, 50));
        settingsButton.setPreferredSize(new Dimension(150, 50));

        playButton.setBackground(Color.GREEN);
        playButton.setForeground(Color.BLACK);
        playButton.setFont(new Font("Arial", Font.BOLD, 16));
        playButton.setFocusPainted(false);

        settingsButton.setBackground(Color.LIGHT_GRAY);
        settingsButton.setForeground(Color.BLACK);
        settingsButton.setFont(new Font("Arial", Font.BOLD, 16));
        settingsButton.setFocusPainted(false);

        buttonPanel.add(playButton);
        buttonPanel.add(settingsButton);

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog settingsDialog = new JDialog(frame, "Setting", true);
                settingsDialog.setSize(400, 300);
                settingsDialog.setLocationRelativeTo(frame);

                JPanel settingsPanel = new JPanel();
                settingsPanel.setLayout(new BorderLayout());

                settingsDialog.add(settingsPanel);
                settingsDialog.setVisible(true);
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(buttonPanel, gbc);

        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}