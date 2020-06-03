import java.io.File;
import java.io.Serializable;

public interface Furniture extends Serializable{
	
	Furniture getFurniture();
	File getPicture();
	String getName();
	double getPrice();
}