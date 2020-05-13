
public class FurnitureFactory {

	public Furniture getFurniture(String furniture) {
		if(furniture == null)
			return null;
		if(furniture.equalsIgnoreCase("BED"))
			return new Bed();
		else if(furniture.equalsIgnoreCase("KITCHENTABLE"))
			return new KitchenTable();
		else if(furniture.equalsIgnoreCase("DESK"))
			return new Desk();
		else if(furniture.equalsIgnoreCase("WARDROBE"))
			return new Wardrobe();
		else if(furniture.equalsIgnoreCase("COFFETABLE"))
			return new CoffeTable();
		else if(furniture.equalsIgnoreCase("REFRIGERATOR"))
			return new Refrigerator();
		else if(furniture.equalsIgnoreCase("CHAIR"))
			return new Chair();
		else if(furniture.equalsIgnoreCase("SOFA"))
			return new Sofa();
		else if(furniture.equalsIgnoreCase("BEDSIDETABLE"))
			return new BedsideTable();
		else if(furniture.equalsIgnoreCase("BATHTUB"))
			return new Bathtub();
		
		return null;
	}
}
