import java.io.File;

public class Chair implements Furniture {

	@Override
	public Furniture getFurniture() {
		return this;}
	
	@Override
	public File getPicture() {
		return picture;}

	
	File picture = new File("C:\\Users\\samue\\eclipse-workspace\\Project - aoop\\src\\pictures\\chair_newsize.png");
	int x,y;

}