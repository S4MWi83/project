import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class Designer {

	public abstract JPanel createCenterComponent();
	public abstract void bedButtonPressed();	

	public Designer() {
	
		JButton bedButton 	= new JButton("Bed");
		JButton prevButton 	= new JButton("Table");
		
		bedButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				bedButtonPressed();				
			}
		});
		prevButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
		panel.add(prevButton);
		panel.add(bedButton);
		
		JComponent comp;
		comp = createCenterComponent();
		comp.setPreferredSize(new Dimension(500, 500));
		
		frame.add(comp);
		frame.add(panel);
		
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 650);
		frame.setVisible(true);
		
	}
	
	private JPanel panel 	= new JPanel();
	private JFrame frame 	= new JFrame("Slide Show");
	private JTextField textField = new JTextField(20);
	
	public void showText(String text) {
		textField.setText(text);
	}
	
}