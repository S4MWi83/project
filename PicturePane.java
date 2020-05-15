import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class PicturePane extends JLayeredPane {
	
	public void addFurniture(File pic) {
		
		int x = 0;
        int y = 0;

        try {
        	if(pic != null)
        	{
        		
		        BufferedImage img = ImageIO.read(pic);        
		        JLabel label = new JLabel(new ImageIcon(img));
		        label.setSize(label.getPreferredSize());
		        label.setLocation(x, y);
		        MouseHandler mh  = new MouseHandler();
		        label.addMouseListener(mh);
		        label.addMouseMotionListener(mh);
		        this.add(label);
		
        	}
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
		this.revalidate();
	}
	
	
	public class MouseHandler extends MouseAdapter {

        private Point offset;

        @Override
        public void mousePressed(MouseEvent e) {
            JLabel label = (JLabel) e.getComponent();
            moveToFront(label);
            offset = e.getPoint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getPoint().x - offset.x;
            int y = e.getPoint().y - offset.y;
            Component component = e.getComponent();
            Point location = component.getLocation();
            location.x += x;
            location.y += y;
            
            if(location.x > 3 && location.x < 778 - component.getWidth() && location.y > 0 && location.y < 473 - component.getHeight()) {
            component.setLocation(location);
            }
        }

    }
}
