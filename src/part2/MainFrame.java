package part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MainFrame extends JFrame {

    int spacing = 5;

    public int mx = -100;
    public int my = -100;

    public MainFrame() {
        this.setTitle("Traffic Simulator");
        this.setSize(1286, 829);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        Simulator simulator = new Simulator();
        this.setContentPane(simulator);

        Move move = new Move();
        this.addMouseMotionListener(move);

        Click click = new Click();
        this.addMouseListener(click);
    }

    public class Simulator extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0, 0, 1280, 800);
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 9; j++) {
                    g.setColor(Color.GRAY);
                    if (mx >= spacing+i*80 && mx < spacing+i*80+80-2*spacing && my >= spacing+j*80+80+26 && my < spacing+j*80+26+80+80-2*spacing){
                        g.setColor(Color.WHITE);
                    }
                    g.fillRect(spacing + i * 80, spacing + j * 80 + 80, 80 - 2 * spacing, 80 - 2 * spacing);
                }
            }
        }
    }

    public class Move implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent arg0) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("The mouse was moved!");
            mx = e.getX();
            my = e.getY();
            System.out.println("X:" + mx + ", Y:" + my);
        }
    }

    class Click implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("The mouse was clicked!");
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }
}