import java.io.File;
@SuppressWarnings("serial")
public class CoffeeTable implements Furniture {
	
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
	
	private File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\coffetable_down.png");
	private String name = "Coffe table";
	private double price= 750;
}