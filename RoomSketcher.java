
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class RoomSketcher extends Designer {
	
	public RoomSketcher() {}
	
	@Override	
	public JPanel createBackComponent() {
		comp = new RoomComponent();
		return comp;
	}
	
	@Override
	public JPanel createSaveLoadGUIComponent() {
		saveGUI = new SaveLoadGUI();
		return saveGUI;
	}
	
	@Override
	public JLayeredPane createPicturePane() {
		picpane = new PicturePane();
		return picpane;
	}
	
	@Override
	public void saveButtonPressed() {
		saveGUI.openWindow();
	}
	
	@Override
	public void loadButtonPressed() {
		int i = 1;
		for(DesignProject dp : designs) {
			System.out.println(Integer.toString(i) +  ". " + dp.getName());
			i++;
		}
		System.out.print("Choose design: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		picpane = designs.get(choice-1).getPane();
		picpane.revalidate();
	}
	
	@Override
	public void removeButtonPressed() {
		picpane.removeFurniture();
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
	public void diningTableButtonPressed() {
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
	
	@Override
	public void bathtubButtonPressed() {
		Furniture f = shoppingList.getFurniture("bathtub");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}

	@Override
	public void toiletButtonPressed() {
		Furniture f = shoppingList.getFurniture("toilet");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}

	@Override
	public void stoveButtonPressed() {
		Furniture f = shoppingList.getFurniture("stove");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}

	@Override
	public void coffeTableButtonPressed() {
		Furniture f = shoppingList.getFurniture("coffeetable");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}
	
	@Override
	public void sinkButtonPressed() {
		Furniture f = shoppingList.getFurniture("sink");
		pic = f.getPicture();
		picpane.addFurniture(pic);
	}

	private FurnitureFactory shoppingList = new FurnitureFactory();
	private RoomComponent comp;
	private PicturePane picpane;
	private SaveLoadGUI saveGUI;
	private ArrayList<DesignProject> designs = new ArrayList<DesignProject>();
	private File pic = new File("");
	
	
}