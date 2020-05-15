import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public abstract class Designer {

	public abstract JPanel createBackComponent();
	public abstract JLayeredPane createPicturePane();
	
	public abstract void saveButtonPressed();	
	public abstract void loadButtonPressed();
	public abstract void removeButtonPressed();
	
	public abstract void bedButtonPressed();
	public abstract void sofaButtonPressed();
	public abstract void diningButtonPressed();
	public abstract void chairButtonPressed();
	public abstract void deskButtonPressed();
	public abstract void wardrobeButtonPressed();
	public abstract void bedsideTableButtonPressed();
	
	
	public Designer() {
	
		JButton saveButton 	= new JButton("Save design");
		JButton loadButton 	= new JButton("Load designs");
		JButton removeButton 	= new JButton("Remove furniture");
		
		JButton bedButton = new JButton("Bed");
		JButton diningTableButton = new JButton("Dining table");
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
		
		saveButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				saveButtonPressed();				
				
			}
		});
		
		loadButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				loadButtonPressed();
			}
		});
		
		removeButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				removeButtonPressed();
			}
		});
		
		bedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				bedButtonPressed();
				
			}
		});
		
		sofaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sofaButtonPressed();
				
			}
		});
		
		diningTableButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				diningButtonPressed();
				
			}
		});
		chairButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				chairButtonPressed();
				
			}
		});
		deskButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				deskButtonPressed();
				
			}
		});
		wardrobeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				wardrobeButtonPressed();
				
			}
		});
		bedsideTableButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				bedsideTableButtonPressed();
				
			}
		});
		
		panel.add(saveButton);
		panel.add(loadButton);
		panel.add(removeButton);
		
		panel.add(saveButton);
		panel.add(loadButton);
		panel.add(bedButton);
		panel.add(diningTableButton);
		panel.add(sofaButton);	
		panel.add(refrigeratorButton);
		panel.add(chairButton);	
		panel.add(bedsideTableButton);
		panel.add(wardrobeButton);
		panel.add(stoveButton);
		panel.add(countertopButton);	
		panel.add(deskButton);
		panel.add(coffeTableButton);
		panel.add(toiletButton);
		panel.add(showerButton);	
		panel.add(bathtubButton);
		panel.add(sinkButton);
		
		pane.setPreferredSize(new Dimension(795, 495));
		comp.setPreferredSize(new Dimension(800, 500));
		panel.setPreferredSize(new Dimension(780, 200));
		
		pane.setLayout(new FlowLayout());
		comp.setLayout(new FlowLayout());
		panel.setLayout(new FlowLayout());
		
		comp.add(pane);
		frame.add(comp);	
		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 650);
		frame.setVisible(true);
		
	}
	
	private JPanel panel	= new JPanel();
	private JFrame frame 	= new JFrame("Room Sketcher");
	private JComponent comp = createBackComponent();
	private JComponent pane = createPicturePane();
	
}