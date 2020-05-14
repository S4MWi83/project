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
	
	public PicturePane() {
        File[] images = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName().toLowerCase();
                return name.endsWith(".png") || name.endsWith(".jpg");
            }
        });
        
        int x = 0;
        int y = 0;
        for (File imgFile : images) {

            try {
                BufferedImage img = ImageIO.read(imgFile);
                JLabel label = new JLabel(new ImageIcon(img));
                label.setSize(label.getPreferredSize());
                label.setLocation(x, y);
                MouseHandler mh  = new MouseHandler();
                label.addMouseListener(mh);
                label.addMouseMotionListener(mh);
                add(label);
                x += 20;
                y += 20;
            } catch (IOException exp) {
                exp.printStackTrace();
            }

        }
        
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
            component.setLocation(location);
        }

    }
}
