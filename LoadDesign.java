
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LoadDesign extends JPanel {
	/**
	Returns a serializable DataStructure containing name of design, ArrayList<Components> and ArrayList<Furniture> 
	@return DataStructure 
	*/
	public DataStucture fileChooser() {
		
		JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
        	try {
        		
	        	FileInputStream fi   = new FileInputStream(chooser.getSelectedFile());
	    		ObjectInputStream oi = new ObjectInputStream(fi);
	    		
	    		DataStucture data = (DataStucture) oi.readObject();
	    		
	    		oi.close();
				fi.close();
	    		
				return data;
				
	        } catch (FileNotFoundException e) {
				System.out.println("File not found");
			} catch (IOException e) {
				System.out.println("Error initializing stream");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}	    		                   
		}
        return null;
	}
}