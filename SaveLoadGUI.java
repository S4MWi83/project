import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SaveLoadGUI extends JPanel implements ActionListener{

	public void openWindow() {
		// create a frame 
        JFrame f = new JFrame("Save design"); 
  
        // create a label 
        JLabel l = new JLabel("This is a popup"); 
  
        f.setSize(250, 100); 
        f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
  
        // create a panel 
        JPanel p2 = new JPanel(); 
  
        // set Background of panel 
        p2.setBackground(Color.LIGHT_GRAY); 
  
        p2.add(l); 
  
        // create a label 
        l = new JLabel(); 
  
        // create a button 
        JButton b = new JButton("Save"); 
  
        // add action listener 
        b.addActionListener(this); 
  
        // create a panel 
        JPanel p1 = new JPanel(); 
        
        JTextField enterText = new JTextField("Enter name");
  
        p1.add(b); 
        p1.add(enterText);
        f.add(p1); 
        f.show(); 
    } 
  
    // if the button is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
    	JTextField enterText = new JTextField("Enter name");
        l.add(enterText);
    } 
	
	JLabel l;
	
}
