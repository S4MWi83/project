import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import java.awt.event.*;
public class Frame extends JFrame {
	private class DemoPanel extends JPanel implements MouseListener {
		private int BOX_WIDTH = 60;
		private int FRAME_WIDTH = 781;
		private int FRAME_HEIGHT = 481;
		private int x = -50;
		private int y = -50;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i=0; i<13; i++) {
				for (int j=0; j<8; j++) {
					if (x == i && y == j) {
						g.setColor(Color.darkGray);
						g.fillRect(3+i*BOX_WIDTH,3+j*BOX_WIDTH,
								BOX_WIDTH,BOX_WIDTH);
					} 
					else {
						g.setColor(Color.black);
						//Left outline
						g.drawLine(0, 0, 0, 481);
						g.drawLine(1, 1, 1, 481);
						g.drawLine(2, 2, 2, 481);
						//Top outline
						g.drawLine(0, 0, 781, 0);
						g.drawLine(1, 1, 781, 1);
						g.drawLine(2, 2, 781, 2);
						//Right outline
						g.drawLine(778, 0, 778, 478);
						g.drawLine(779, 0, 779, 479);
						g.drawLine(780, 0, 780, 480);
						//Bottom outline
						g.drawLine(0, 478, 778, 478);
						g.drawLine(1, 479, 779, 479);
						g.drawLine(2, 480, 780, 480);
						//Walls
						g.drawLine(363, 0, 363, 123);
						g.drawLine(363, 183, 363, 303);
						g.drawLine(363, 363, 363, 481);
						g.drawLine(363, 243, 781, 243);
						//Doors
//						g.drawLine(363, 123, 333, 153);
//						g.drawLine(363, 363, 333, 333);
					}
//					else {
//						g.drawRect(i*BOX_WIDTH,j*BOX_WIDTH,
//								BOX_WIDTH,BOX_WIDTH);
//					}
				}
			}
		}
		//ser till vart du målar
		public void mouseClicked(MouseEvent e) {
            x = e.getX() / BOX_WIDTH;
            y = e.getY() / BOX_WIDTH;
            this.repaint();
        }
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
	}
	public Frame() {
		JFrame frame = new JFrame();
		DemoPanel panel = new DemoPanel();
		frame.setLayout(new FlowLayout());
		frame.setSize(850, 600);
		frame.setLocation(300, 170);
		frame.add(panel);
		panel.addMouseListener(panel);
		panel.setBackground(Color.lightGray);
		panel.setLocation(80, 150);
		panel.setPreferredSize(new Dimension(781, 481));
		JButton bedButton = new JButton("Bed");
		JButton tableButton = new JButton("Table");
		JButton sofaButton = new JButton("Sofa");
		JButton refrigeratorButton = new JButton("Refrigerator");
		JButton chairButton = new JButton("Chair");
		JButton bedsideTableButton = new JButton("Bedside table");
		JButton wardrobeButton = new JButton("Wardrobe");
		JButton stoveButton = new JButton("Stove");
		JButton countertopButton = new JButton("Countertop");
		JButton deskButton = new JButton("Desk");
		JButton coffeTableButton = new JButton("Coffe table");
		JButton toiletButton = new JButton("Toilet");
		JButton showerButton = new JButton("Shower");
		JButton bathtubButton = new JButton("Bathtub");
		JButton sinkButton = new JButton("Sink");
//		bedButton.addActionListener(event -> bedButton.setBackground(Color.pink));
		frame.add(bedButton);
		frame.add(tableButton);
		frame.add(sofaButton);	
		frame.add(refrigeratorButton);
		frame.add(chairButton);	
		frame.add(bedsideTableButton);
		frame.add(wardrobeButton);
		frame.add(stoveButton);
		frame.add(countertopButton);	
		frame.add(deskButton);
		frame.add(coffeTableButton);
		frame.add(toiletButton);
		frame.add(showerButton);	
		frame.add(bathtubButton);
		frame.add(sinkButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
	}
	public static void main(String[] args) {
		Frame frame = new Frame();
	}
}