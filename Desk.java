import java.io.File;

public class Desk implements Furniture{

	@Override
	public File getPicture() {
		return picture;
	}
	
	File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\desk_newsize.png");
}
