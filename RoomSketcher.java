
import java.io.File;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class RoomSketcher extends Designer {
	
	public RoomSketcher() {
		
	}
	
	@Override	
	public JPanel createBackComponent() {
		// create room
		comp = new RoomComponent();
		return comp;
	}
	
	@Override
	public JLayeredPane createPicturePane() {
		//drag and drop component
		picpane = new PicturePane();
		return null;
	}
	
	@Override
	public void saveButtonPressed() {
		
	}
	
	@Override
	public void loadButtonPressed() {
		
	}
	
	@Override
	public void bedButtonPressed() {
		Furniture bed = shoppingList.getFurniture("bed");
		pics[count] = bed.getPicture();
		comp.addFurniture(pics[count]);
		count++;
	}


	private FurnitureFactory shoppingList = new FurnitureFactory();
	private RoomComponent comp;
	private PicturePane picpane;
	private DesignProject[] designs = new DesignProject[25];
	private File[] pics = new File[25];
	private int count = 0;
	
}