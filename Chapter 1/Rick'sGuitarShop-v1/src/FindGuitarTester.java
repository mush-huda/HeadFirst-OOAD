
public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar desired = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
		Guitar guitar = inventory.search(desired);
		if(guitar != null) {
			System.out.println("Erin, you might like this:" + 
						guitar.getBuilder() + "" + guitar.getModel() + "" +
						guitar.getType() + "guitar :\n " +
						guitar.getBackWood() + "back " + 
						guitar.getTopWood() + "top. \nYou can have it for only" +
						guitar.getPrice() + "!");
		}else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		
		inventory.addGuitar("V95693", 1500, "Fender", "Stratocastor", "electrc", "Alder", "Alder");
		inventory.addGuitar("F95623", 1400, "Fender", "Stratocastor", "electrc", "Alder", "Alder");
	}
}
