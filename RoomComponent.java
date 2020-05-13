import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoomComponent extends JPanel implements MouseListener {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i=0; i<13; i++) {
			for (int j=0; j<8; j++) {
				if (x == i && y == j) {
					g.setColor(Color.white);
					g.fillRect(3+i*BOX_WIDTH,3+j*BOX_HEIGHT,
							BOX_WIDTH,BOX_HEIGHT);
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
//					g.drawLine(363, 123, 333, 153);
//					g.drawLine(363, 363, 333, 333);
				}
//				else {
//					g.drawRect(i*BOX_WIDTH,j*BOX_WIDTH,
//							BOX_WIDTH,BOX_WIDTH);
//				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
        x = e.getX() / BOX_WIDTH;
        y = e.getY() / BOX_HEIGHT;
        this.repaint();
    }
			
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    

	private int BOX_WIDTH 	= 60;
	private int BOX_HEIGHT 	= 60;
	private int PANEL_WIDTH = 781;
	private int PANEL_HEIGHT= 481;
	private int x = -50;
	private int y = -50;
    
}