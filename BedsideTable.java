import java.io.File;

public class BedsideTable implements Furniture {

	@Override
	public File getPicture() {
		
		return picture;

	}
	
	File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\nightstand_newsize.png");
}
