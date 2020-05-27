
import java.util.Iterator;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class RoomSketcher extends Designer {
	
	public RoomSketcher() {
		
	}

	
	public PicturePane getPicpane() {
		return picpane;
	}
	
	@Override	
	public JPanel createBackComponent() {
		comp = new RoomComponent();
		return comp;
	}
	
	@Override
	public JPanel createSaveGUIComponent() {
		saveGUI = new SaveGUI();
		return saveGUI;
	}
	
	@Override
	public JPanel createLoadGUIComponent() {
		loadGUI = new LoadGUI();
		return loadGUI;
	}
	
	@Override
	public JLayeredPane createPicturePane() {
		picpane = new PicturePane();
		return picpane;
	}
	
	@Override
	public void saveButtonPressed() {
		saveGUI.openWindow(this);
	}
	
	@Override
	public void loadButtonPressed() {
		DataStucture data = loadGUI.openWindow();
		picpane.removeFurniture();
		@SuppressWarnings("rawtypes")
		Iterator it = data.getList().iterator();
		int index = 0;
		while(it.hasNext()) {
			picpane.add(data.getList().get(index));
			index++;
		}
	}
	
	@Override
	public void removeButtonPressed() {
		picpane.removeFurniture();
	}
	
	@Override
	public void chairButtonPressed() {
		Furniture f = shoppingList.getFurniture("chair");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void bedButtonPressed() {
		Furniture f = shoppingList.getFurniture("bed");
		picpane.addFurniture(f.getPicture());
	}	
	
	@Override
	public void sofaButtonPressed() {
		Furniture f = shoppingList.getFurniture("sofa");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void diningTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("diningtable");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void deskButtonPressed() {
		Furniture f = shoppingList.getFurniture("desk");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void bedsideTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("bedsidetable");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void wardrobeButtonPressed() {
		Furniture f = shoppingList.getFurniture("wardrobe");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void bathtubButtonPressed() {
		Furniture f = shoppingList.getFurniture("bathtub");
		picpane.addFurniture(f.getPicture());
	}

	@Override
	public void toiletButtonPressed() {
		Furniture f = shoppingList.getFurniture("toilet");
		picpane.addFurniture(f.getPicture());
	}

	@Override
	public void stoveButtonPressed() {
		Furniture f = shoppingList.getFurniture("stove");
		picpane.addFurniture(f.getPicture());
	}

	@Override
	public void coffeTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("coffeetable");
		picpane.addFurniture(f.getPicture());
	}
	
	@Override
	public void sinkButtonPressed() {
		Furniture f = shoppingList.getFurniture("sink");
		picpane.addFurniture(f.getPicture());
	}
	
	private FurnitureFactory shoppingList = new FurnitureFactory();
	private RoomComponent comp;
	private PicturePane picpane;
	private SaveGUI saveGUI;
	private LoadGUI loadGUI;
	
}