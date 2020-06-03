
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class PicturePane extends JLayeredPane {
		
	/**
	Adds Furniture on JLabel then on JLayeredPane
	@param check so furniture and furniture's picture is not null
	@precondition furniture 		!= null
	@precondition furniture.picture != null
	*/
	public void addFurniture(Furniture f) {
		
		assert f != null 				: "violated precondition furniture != NULL";
		assert f.getPicture() != null 	: "violated precondition furniture.picture > 0";
		
		list.add(f);
		
		int x = 150;
		int y = 250;
		
        try {
        	if(f.getPicture() != null)
        	{
		        BufferedImage img = ImageIO.read(f.getPicture());        
		        JLabel label = new JLabel(new ImageIcon(img));
		        label.setSize(label.getPreferredSize());
		        label.setLocation(x, y);
		        MouseHandler mh  = new MouseHandler();
		        label.addMouseListener(mh);
		        label.addMouseMotionListener(mh);
		        label.revalidate();
		        this.add(label);
        	}
        } catch (IOException exp) {
            exp.printStackTrace();
        }
	}
	
	public ArrayList<Component> getLabels(){
		ArrayList<Component> ret = new ArrayList<Component>();
		for (Component c : this.getComponents()) {
			ret.add(c);
		}
		return ret;
	}
	
	public ArrayList<Furniture> getFurniture(){
		return list;
	}
	
	public void removeFurniture() {
		this.removeAll();
		this.revalidate();
		this.repaint();
	}
	
	public PicturePane getAllFurniture() {
		return this;
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
            
            if(location.x > 2 && location.x < 779 - component.getWidth() && location.y > -3 && location.y < 474 - component.getHeight()) {
            component.setLocation(location);
            }
        }

        public void mouseReleased(MouseEvent e) {
        	
        	Component component = e.getComponent();
        	location = component.getLocation();
      
        	//The first door
        	if(location.y > 123 - component.getHeight() && location.y < 182 && location.x > 363 - 50 - component.getWidth() && location.x < 363 + 50) {
        		if(location.x > 363 - component.getWidth() /2 ) {
        			if(location.y > 243 - component.getHeight()) {
        				location.y = 242 - component.getHeight();
        			}
        			location.x = 363 + 50;
        		}
        		else if(location.x < 363 + component.getWidth()/2) {
        			location.x = 363 - 50 - component.getWidth();
        		}
        		component.setLocation(location);
        	}
        	//The second door
        	if(location.y > 303 - component.getHeight() && location.y < 363 && location.x > 363 - 50 - component.getWidth() && location.x < 363 + 50) {
        		if(location.x > 363 - component.getWidth()/2 ) {
        			if(location.y < 243 - component.getHeight()/2) {
        				location.y = 242;
        			}
        			location.x = 363 + 50;
        		}
        		else if(location.x < 363 + component.getWidth()/2) {
        			location.x = 363 - 50 - component.getWidth();
        		}
        		component.setLocation(location);
        	}
        	//The big wall
        	else if(location.x < 363 && location.x > 363 - component.getWidth()) {
        		if(location.x < 364 - component.getWidth()/2) {
        			location.x = 362 - component.getWidth();
        		}
        		else{
        			location.x = 364;
        		}
        		if(location.y < 240 && location.y > 240 - component.getHeight() && location.x > 363) {
            		if(location.y < 240 - component.getHeight()/2) {
            			location.y = 238 - component.getHeight();
            		}
            		else{
            			location.y = 240;
            		}
    			}
        		component.setLocation(location);
        	}
        	//The small wall
        	else if(location.y < 240 && location.y > 240 - component.getHeight() && location.x > 363) {
        		if(location.y < 240 - component.getHeight()/2) {
        			location.y = 238 - component.getHeight();
        		}
        		else{
        			location.y = 240;
        		}
        		component.setLocation(location);
        	}	
        }
	}
	
    Point location = null;
    ArrayList<Furniture> list = new ArrayList<Furniture>();
    
}