import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	
	public static void main(String[] arg) {
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec desired = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
									Wood.ALDER, Wood.ALDER);
		
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
		
		inventory.addGuitar("V95693", 1500, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
								Wood.ALDER, Wood.ALDER);
	
		inventory.addGuitar("F95623", 1400, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
			Wood.ALDER, Wood.ALDER);
	}

}
