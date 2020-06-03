import java.util.Iterator;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class RoomSketcher extends Designer {
	
	public RoomSketcher() {	
		
	}
	
	/**
	Returns background JPanel for its super class Designer
	@return JComponent 
	*/
	@Override	
	public JPanel createBackComponent() {
		comp = new RoomComponent();
		comp.createGrid();
		return comp;
	}
	
	/**
	Returns a JLayeredPane to place JLabels on to its super class
	@return JComponent 
	*/
	@Override
	public JLayeredPane createPicturePane() {
		picpane = new PicturePane();
		return picpane;
	}
	
	/**
	Returns JPanel component to list furniture names and total price for its super class
	@return JComponent 
	*/
	@Override
	public JPanel createShoppingComponent() {
		checkOut = new ShoppingList();
		return checkOut;
	}

	@Override
	public void saveButtonPressed() {
		saveGUI = new SavePopUp();
		saveGUI.openWindow(this);
	}
	
	@Override
	@SuppressWarnings("rawtypes")
	public void loadButtonPressed() {
		loadGUI = new LoadWindow();
		DataStucture data = loadGUI.fileChooser();
		picpane.removeFurniture();
		if(data != null) {
			Iterator it = data.getLabelList().iterator();
			Furniture temp = null;
			int index = 0;
			while(it.hasNext() && data.getLabelList().size() > index) {
				picpane.add(data.getLabelList().get(index));
				temp = data.getFurnitureList().get(index);
				checkOut.addToList(temp.getName(), temp.getPrice());
				index++;
			}
		}
	}
	
	@Override
	public void removeButtonPressed() {
		picpane.removeFurniture();
		checkOut.removeFromList();
	}
	
	@Override
	public void chairButtonPressed() {
		Furniture f = shoppingList.getFurniture("chair");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void bedButtonPressed() {
		Furniture f = shoppingList.getFurniture("bed");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}	
	
	@Override
	public void sofaButtonPressed() {
		Furniture f = shoppingList.getFurniture("sofa");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void diningTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("diningtable");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void deskButtonPressed() {
		Furniture f = shoppingList.getFurniture("desk");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void bedsideTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("bedsidetable");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void wardrobeButtonPressed() {
		Furniture f = shoppingList.getFurniture("wardrobe");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void bathtubButtonPressed() {
		Furniture f = shoppingList.getFurniture("bathtub");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}

	@Override
	public void toiletButtonPressed() {
		Furniture f = shoppingList.getFurniture("toilet");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}

	@Override
	public void stoveButtonPressed() {
		Furniture f = shoppingList.getFurniture("stove");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}

	@Override
	public void coffeTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("coffeetable");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	@Override
	public void sinkButtonPressed() {
		Furniture f = shoppingList.getFurniture("sink");
		picpane.addFurniture(f);
		checkOut.addToList(f.getName(), f.getPrice());
	}
	
	
	public PicturePane getPicpane() {
		return picpane;
	}
	
	
	private FurnitureFactory shoppingList = new FurnitureFactory();
	private RoomComponent comp;
	private PicturePane picpane;
	private SavePopUp saveGUI;
	private LoadWindow loadGUI;
	private ShoppingList checkOut;
	
}