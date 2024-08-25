package n0rzik.idealauncher;

import javax.swing.*;
import java.awt.*;

public class Launcherideal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Launcherideal::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("IdeaLauncheR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        frame.setVisible(true);
    }
}