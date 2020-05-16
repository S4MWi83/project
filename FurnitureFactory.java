public class FurnitureFactory {
	public Furniture getFurniture(String furniture) {
		if(furniture == null)
			return null;
		if(furniture.equalsIgnoreCase("BED"))
			return new Bed();
		else if(furniture.equalsIgnoreCase("DININGTABLE"))
			return new DiningTable();
		else if(furniture.equalsIgnoreCase("DESK"))
			return new Desk();
		else if(furniture.equalsIgnoreCase("WARDROBE"))
			return new Wardrobe();
		else if(furniture.equalsIgnoreCase("COFFEETABLE"))
			return new CoffeeTable();
		else if(furniture.equalsIgnoreCase("CHAIR"))
			return new Chair();
		else if(furniture.equalsIgnoreCase("SOFA"))
			return new Sofa();
		else if(furniture.equalsIgnoreCase("BEDSIDETABLE"))
			return new BedsideTable();
		else if(furniture.equalsIgnoreCase("BATHTUB"))
			return new Bathtub();
		else if(furniture.equalsIgnoreCase("STOVE"))
			return new Stove();
		else if(furniture.equalsIgnoreCase("TOILET"))
			return new Toilet();
		else if(furniture.equalsIgnoreCase("SINK"))
			return new Sink();
		return null;
	}
}