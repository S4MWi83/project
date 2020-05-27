import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class DataStucture implements Serializable{
	
	public DataStucture(){
		
	}
	
	public DataStucture(String name, ArrayList<Component> list){
		this.name = name;
		this.list = list;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Component> getList(){
		return list;
	}

	private String name = null;
	private ArrayList<Component> list = new ArrayList<Component>();
	
}