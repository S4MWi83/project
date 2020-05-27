import java.io.File;
public class Sink implements Furniture{
	
	@Override
	public Furniture getFurniture() {
		return this;}
	
	@Override
	public File getPicture() {
		return picture;
	}
	
	private File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\sink_down.png");
	
}