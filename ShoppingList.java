import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ShoppingList extends JPanel{

	public ShoppingList()
	{
		
	}	
	/**
	Adds an Item to the list.
	@param check so string is not null and price > 0
	@precondition name != null
	@precondition price >= 0.00
	*/
	public void addToList(String name, double price) {
		
		assert name != null : "violated precondition name != NULL";
		assert price >= 0.00 : "violated precondition price >= 0.00";
		
		Item thing = new Item();
  
		thing.setName(name);
		thing.setPrice(price);
  
		JTextField text = new JTextField(thing.getName(), 16);
		
		text.setSize(text.getPreferredSize());
		text.setForeground(Color.white);
		text.setBackground(Color.DARK_GRAY);
		text.setBorder(BorderFactory.createLineBorder(Color.black));
		text.setLocation(10, y);
		y = y + 25;
		list.add(thing);
		this.add(text);
		
		amount.setText("Amount " + this.findTotal() + " kr ");
		amount.setSize(amount.getPreferredSize());
		amount.setForeground(Color.DARK_GRAY);
		amount.setBackground(new Color(53, 144, 116));
		amount.setBorder(BorderFactory.createLineBorder(Color.black));
		amount.setLocation(10, 450);
		this.add(amount);
	  
	}
  
	public void removeFromList() {
	  
		for(int index = list.size() - 1; index >= 0; index--) 
			list.remove(index);	
		
		sum = 0.00;
		y = 10;
		this.removeAll();
		this.revalidate();
		this.repaint();
  
	}

	@SuppressWarnings("rawtypes")
	public double findTotal()
	{
		sum = 0.0;
		Iterator it = list.iterator();
		while (it.hasNext())
			sum = sum + ((Item)it.next()).getPrice();
		
    return sum;
	}


  private ArrayList<Item> list 	= new ArrayList<Item>();
  JTextField amount = new JTextField("Amount: " + 0.00 + " kr ", 16);
  double sum = 0.00;
  int y = 10;
}