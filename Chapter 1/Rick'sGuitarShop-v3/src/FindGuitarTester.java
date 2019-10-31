import java.util.*;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar desired = new Guitar("", 0, Builder.FENDER, "Stratocastor", 
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars = inventory.search(desired);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars: ");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " +
						guitar.getBuilder() + " " + guitar.getModel() + " " +
						guitar.getType() + " guitar :\n " +
						guitar.getBackWood() + " back " + 
						guitar.getTopWood() + " top. \nYou can have it for only " +
						guitar.getPrice() + "Euros!\n-----");
            }
		}else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		
		inventory.addGuitar("V95693", 1500, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("F95623", 1400, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
