import java.io.File;
public class Toilet implements Furniture{
	@Override
	public File getPicture() {
		return picture;
	}
	private File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\toilet_down.png");
}