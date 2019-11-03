package part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
//Main GUI panel spacing constants
    int spacing = 5;

    public int mx = -100;
    public int my = -100;

    boolean [][] selected = new boolean[16][9];

    ArrayList<Integer> coordinate = new ArrayList<>();

    public MainFrame() {
        //Setup for simulator GUI
        this.setTitle("Traffic Simulator");
        this.setSize(1286, 829);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                selected[i][j] = false;
            }
        }

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
                    if(selected[i][j]){
                        g.setColor(Color.WHITE);
                    }
                    if (mx >= spacing+i*80 && mx < i*80+80-spacing && my >= spacing+j*80+106 && my < j*80+186-spacing){
                        g.setColor(Color.LIGHT_GRAY);
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
            //Obtaining cursor X and Y coordinates
            //System.out.println("The mouse was moved!");
            mx = e.getX();
            my = e.getY();
            //System.out.println("X:" + mx + ", Y:" + my);
        }
    }

    class Click implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            //Custom road section coordinates for each box
            if(inBoxX() != -1 && inBoxY() != -1) {
                coordinate.add(inBoxX());
                coordinate.add(inBoxY());
                selected[inBoxX()][inBoxY()] = true;
                System.out.println("The mouse is in the box " + coordinate);
                coordinate.clear();
            }else{
                System.out.println("Please select a box!");
            }
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
    public int inBoxX(){
        //Range for cursor being classified inside the X road section
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if(mx >= spacing+i*80 && mx < i*80+80-spacing && my >= spacing+j*80+106 && my < j*80+186-spacing){
                    return i;
                }
            }
        }
        return -1;
    }
    public int inBoxY(){
        //Range for cursor being classified inside the Y road section
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if(mx >= spacing+i*80 && mx < i*80+80-spacing && my >= spacing+j*80+106 && my < j*80+186-spacing){
                    return j;
                }
            }
        }
        return -1;
    }
}