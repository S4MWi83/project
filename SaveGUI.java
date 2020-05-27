import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SaveGUI extends JPanel {

	public void openWindow(RoomSketcher saveRoom) {
		
        JFrame frame 		= new JFrame("Save design"); 
        JButton saveButton 	= new JButton("Save"); 
        JTextField name 	= new JTextField("Name of design");
        
        saveButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				 
			DataStucture data = new DataStucture(name.getText(), 
					saveRoom.getPicpane().getLabels());
			
			try {
			 	String filepath = "C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\stored designs\\" + name.getText();
		        FileOutputStream fileOut = new FileOutputStream(filepath);
		        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		        objectOut.writeObject(data);
		        
		        objectOut.close();
		        fileOut.close();
		 
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
			});
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        
        p1.add(saveButton);
        p1.setSize(p1.getPreferredSize());
        
        p2.add(name);
        p2.setSize(p2.getPreferredSize());
        
        frame.add(p1);
        frame.add(p2);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(270, 120)); 
        frame.setLocation(500, 180);
        
        frame.setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
        
    } 
	
}