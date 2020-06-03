import java.io.File;

@SuppressWarnings("serial")
public class Chair implements Furniture {

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

	
	private File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\chair_newsize.png");
	private String name = "Chair";
	private double price= 299;

}