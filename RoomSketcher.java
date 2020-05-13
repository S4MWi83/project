
import javax.swing.JPanel;

public class RoomSketcher extends Designer {
	
	public RoomSketcher() {
	
	}
	
	@Override	
	public JPanel createCenterComponent() {
		// create room
		comp = new RoomComponent();
		comp.addMouseListener(comp);
		return comp;
	}
	
	@Override
	public void saveButtonPressed() {
		
	}
	
	@Override
	public void loadButtonPressed() {
		
	}


	private FurnitureFactory shoppingList;
	private RoomComponent comp;
	private DesignProject dp;
	
}