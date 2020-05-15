
import java.io.File;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class RoomSketcher extends Designer {
	
	public RoomSketcher() {}
	
	@Override	
	public JPanel createBackComponent() {
		// create room
		comp = new RoomComponent();
		return comp;
	}
	
	@Override
	public JLayeredPane createPicturePane() {
		//drag and drop images
		picpane = new PicturePane();
		return picpane;
	}
	
	@Override
	public void saveButtonPressed() {
		designs[count] = new DesignProject("project", picpane);
	}
	
	@Override
	public void loadButtonPressed() {
		
	}
	
	
	@Override
	public void bedButtonPressed() {
		Furniture f = shoppingList.getFurniture("bed");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void sofaButtonPressed() {
		Furniture f = shoppingList.getFurniture("sofa");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void diningButtonPressed() {
		Furniture f = shoppingList.getFurniture("diningtable");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void deskButtonPressed() {
		Furniture f = shoppingList.getFurniture("desk");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void bedsideTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("bedsidetable");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void chairButtonPressed() {
		Furniture f = shoppingList.getFurniture("chair");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void wardrobeButtonPressed() {
		Furniture f = shoppingList.getFurniture("wardrobe");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}

	private FurnitureFactory shoppingList = new FurnitureFactory();
	private RoomComponent comp;
	private PicturePane picpane;
	private DesignProject[] designs = new DesignProject[25];
	private File pic = new File("");
	private int count = 0;
	
}
