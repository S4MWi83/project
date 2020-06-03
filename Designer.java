import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public abstract class Designer {
	
	public abstract JPanel createBackComponent();
	public abstract JPanel createShoppingComponent();
	public abstract JLayeredPane createPicturePane();
	
	public abstract void saveButtonPressed();
	public abstract void loadButtonPressed();	
	public abstract void removeButtonPressed();
	
	public abstract void chairButtonPressed();
	public abstract void bedButtonPressed();	
	public abstract void sofaButtonPressed();
	public abstract void diningTableButtonPressed();
	public abstract void deskButtonPressed();
	public abstract void wardrobeButtonPressed();
	public abstract void bedsideTableButtonPressed();
	public abstract void sinkButtonPressed();
	public abstract void bathtubButtonPressed();
	public abstract void toiletButtonPressed();
	public abstract void stoveButtonPressed();
	public abstract void coffeTableButtonPressed();
	
	public Designer() {
		
		JFrame frame 		= new JFrame("Room Sketcher");
		JPanel buttonPanel	= new JPanel();

		JMenuBar menuBar 	= new JMenuBar();
	    JMenu menu1    	 	= new JMenu("File");
	    JMenu menu2    	 	= new JMenu("Edit");
	        
		JMenuItem open 		= new JMenuItem("Open");
	    JMenuItem save 		= new JMenuItem("Save");
	    
	    JMenuItem remove = new JMenuItem("Remove");
		
		JButton buttonOne 		= new JButton("Bed");
		JButton buttonTwo 		= new JButton("Dining table");
		JButton buttonThree 	= new JButton("Sofa");
		JButton buttonFour 		= new JButton("Chair");
		JButton buttonFive 		= new JButton("Bedside table");
		JButton buttonSix 		= new JButton("Wardrobe");
		JButton buttonSeven 	= new JButton("Stove");
		JButton buttonEight 	= new JButton("Desk");
		JButton buttonNine 		= new JButton("Coffe table");
		JButton buttonTen 		= new JButton("Toilet");
		JButton buttonEleven 	= new JButton("Bathtub");
		JButton buttonTwelve 	= new JButton("Sink");

		
		save.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				saveButtonPressed();				
			}
		});
		open.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				loadButtonPressed();
				
			}
		});
		remove.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				removeButtonPressed();
			}
		});
		
		
		buttonFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chairButtonPressed();
			}
		});
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bedButtonPressed();
			}
		});
		buttonThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sofaButtonPressed();
			}
		});
		buttonTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				diningTableButtonPressed();
			}
		});
		buttonEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deskButtonPressed();
			}
		});
		buttonSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wardrobeButtonPressed();
			}
		});
		buttonFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bedsideTableButtonPressed();
			}
		});
		buttonTwelve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sinkButtonPressed();
			}
		});
		buttonSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stoveButtonPressed();
			}
		});
		buttonTen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				toiletButtonPressed();
			}
		});		
		buttonEleven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bathtubButtonPressed();
			}
		});		
		buttonNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coffeTableButtonPressed();
			}
		});		
		
		JComponent comp 	= createBackComponent();
		JComponent pane 	= createPicturePane();
		JComponent checkOut	= createShoppingComponent();
		
		checkOut.setBorder(BorderFactory.createLineBorder(Color.black));
		checkOut.setPreferredSize(new Dimension(200, 480));	
		checkOut.setBackground(Color.gray);
		
		pane.setPreferredSize(new Dimension(780, 480));	
		comp.setPreferredSize(new Dimension(780, 480));
		comp.setBorder(BorderFactory.createLineBorder(Color.black));
		comp.setBackground(Color.LIGHT_GRAY);
		comp.add(pane);
		
		menu1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		menu2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		menu1.add(save);
        menu1.add(open);
        menu2.add(remove);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        
		buttonPanel.add(buttonEleven);
		buttonPanel.add(buttonFive);	
		buttonPanel.add(buttonOne);
		buttonPanel.add(buttonNine);
		buttonPanel.add(buttonFour);
		buttonPanel.add(buttonEight);
		buttonPanel.add(buttonTwo);
		buttonPanel.add(buttonTwelve);
		buttonPanel.add(buttonThree);	
		buttonPanel.add(buttonSeven);
		buttonPanel.add(buttonTen);
		buttonPanel.add(buttonSix);
		buttonPanel.setLayout(new GridLayout(2, 6));
		
		frame.add(comp);
		frame.add(checkOut);
		frame.add(buttonPanel);
		frame.setJMenuBar(menuBar);
		
		frame.setSize(1050, 610);
		frame.setLocation(125, 35);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}