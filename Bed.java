import java.io.File;

@SuppressWarnings("serial")
public class Bed implements Furniture{
	
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
	
	private File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\bed_newsize.png");
	private String name = "Bed";
	private double price= 6000;
}
