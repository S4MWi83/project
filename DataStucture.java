import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class DataStucture implements Serializable{
	
	public DataStucture(){
		
	}
	
	public DataStucture(String name, ArrayList<Component> list1, ArrayList<Furniture> list2){
		this.name  = name;
		this.list1 = list1;
		this.list2 = list2;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Component> getLabelList(){
		return list1;
	}
	
	public ArrayList<Furniture> getFurnitureList(){
		return list2;
	}

	private String name = null;
	private ArrayList<Component> list1 = new ArrayList<Component>();
	private ArrayList<Furniture> list2 = new ArrayList<Furniture>();
	
}