import java.io.File;

@SuppressWarnings("serial")
public class Wardrobe implements Furniture{
	
	@Override
	public Furniture getFurniture() {
		return this;
	}
	
	@Override
	public File getPicture() {
		return picture;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\wardrobe_newsize.png");
	private String name = "Wardrobe";
	private double price= 0;
}