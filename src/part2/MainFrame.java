package part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame {

    int spacing = 5;

    public MainFrame() {
            this.setTitle("Traffic Simulator");
            this.setSize(1286, 829);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setResizable(false);

            Simulator simulator = new Simulator();
            this.setContentPane(simulator);
        }
        public class Simulator extends JPanel {
            public void paintComponent(Graphics g) {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(0, 0, 1280, 800);
                g.setColor(Color.GRAY);
                for (int i = 0; i < 16; i++) {
                    for (int j = 0; j < 9; j++) {
                        g.fillRect(spacing + i * 80, spacing + j * 80 + 80, 80 - 2 * spacing, 80 - 2 * spacing);
                    }
                }
            }
        }
    }
