import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.swing.JPanel;


public class RoomComponent extends JPanel  {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
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

		
		
	}
	
	public void addFurniture(File pic) {
		
	}
    
}