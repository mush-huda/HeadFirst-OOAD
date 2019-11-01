import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	
	public static void main(String[] arg) {
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec desired = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
									Wood.ALDER, Wood.ALDER, 6);
		//guitar chara guitar spec
		
		List<Guitar> matchingGuitars = inventory.search(desired);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("You might like these guitars: \n-----");
			
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println(spec.getBuilder() + " " + 
						spec.getModel() + "\n" + 
						spec.getType()  + " guitar \n" + 
						"back wood: " +  spec.getBackWood() + " & " + 
						"top wood: " +	spec.getTopWood() + 
						"\nYou can have it for only " + guitar.getPrice() + "!\n-----");
			}
			
		}else {
			System.out.println("Sorry we have nothing for you.");
			}
	
	}
	
	
	private static void initializeInventory(Inventory inventory) {
		
		inventory.addGuitar("V95693", 1500, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
								Wood.ALDER, Wood.ALDER, 12));
	
		inventory.addGuitar("F95623", 1400, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
			Wood.ALDER, Wood.ALDER, 6));
		
		inventory.addGuitar("F95623", 1400, new GuitarSpec(Builder.TAYLOR, "Academy", Type.ACOUSTIC,
				Wood.MAPLE, Wood.ROSEWOOD, 6));
		
		inventory.addGuitar("F95623", 1400, new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC,
				Wood.MAHOGANY, Wood.MAHOGANY, 12));
		
		inventory.addGuitar("F95623", 1400, new GuitarSpec(Builder.COLLINGS, "D-Series", Type.ACOUSTIC,
				Wood.ALDER, Wood.ROSEWOOD, 12));
	}

}
