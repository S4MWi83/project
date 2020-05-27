import java.io.File;

public class DiningTable implements Furniture {
	
	@Override
	public Furniture getFurniture() {
		return this;}

	@Override
	public File getPicture() {
		
		return picture;
		

	}
	File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\diningtable_newsize.png");
}
