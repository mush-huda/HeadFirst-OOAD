import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	
	public static void main(String[] arg) {
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
//		GuitarSpec desiredGuitar = new GuitarSpec(Builder.FENDER, "Stratocastor", 
//				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		
		MandolinSpec desiredMandolin = new MandolinSpec(Builder.TAYLOR, "No-Series", 
				Type.ACOUSTIC, Wood.MAHOGANY, Wood.ALDER, Style.F);
		
//		List<Guitar> matchingGuitars = inventory.search(desiredGuitar);
//		if(!matchingGuitars.isEmpty()) {
//			System.out.println("You might like these guitars: \n-----");
//			
//			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
//				Guitar guitar = (Guitar)i.next();
//				GuitarSpec spec = (GuitarSpec) guitar.getSpec();
//				System.out.println(spec.getBuilder() + " " + 
//						spec.getModel() + "\n" + 
//						spec.getType()  + " guitar \n" + 
//						"back wood: " +  spec.getBackWood() + " & " + 
//						"top wood: " +	spec.getTopWood() + 
//						"\nYou can have it for only " + guitar.getPrice() + "!\n-----");
//			}
//			
//		}else {
//			System.out.println("Sorry we have nothing for you.");
//			}
	
	
	List<Mandolin> matchingMandolins = inventory.search(desiredMandolin);
	if(!matchingMandolins.isEmpty()) {
		System.out.println("You might like these mandolins: \n-----");
		
		for (Iterator<Mandolin> i = matchingMandolins.iterator(); i.hasNext(); ) {
			Mandolin mandolin = (Mandolin)i.next();
			MandolinSpec spec = (MandolinSpec) mandolin.getSpec();
			System.out.println(spec.getBuilder() + " " + 
					spec.getModel() + "\n" + 
					spec.getType()  + "\n" + 
					spec.getStyle() + " mandolin \n" +
					"back wood: " +  spec.getBackWood() + " & " + 
					"top wood: " +	spec.getTopWood() + 
					"\nYou can have it for only " + mandolin.getPrice() + "!\n-----");
		}
		
	}else {
		System.out.println("Sorry we have nothing for you.");
		}
	
}
	
	private static void initializeInventory(Inventory inventory) {
		
//		inventory.addInstrument("V95693", 1500, new GuitarSpec(Builder.FENDER, 
//				"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
//	
//		inventory.addInstrument("F95623", 1400, new GuitarSpec(Builder.FENDER, 
//				"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
//		
//		inventory.addInstrument("F95623", 1400, new GuitarSpec(Builder.TAYLOR, 
//				"Academy", Type.ACOUSTIC, Wood.MAPLE, Wood.ROSEWOOD, 6));
//		
//		inventory.addInstrument("F95623", 1400, new GuitarSpec(Builder.GIBSON, 
//				"Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 12));
//		
//		inventory.addInstrument("F95623", 1400, new GuitarSpec(Builder.COLLINGS,
//				"D-Series", Type.ACOUSTIC, Wood.ALDER, Wood.ROSEWOOD, 12));
		
		inventory.addInstrument("M0089", 800, new MandolinSpec(Builder.COLLINGS,
				"No-Series", Type.ACOUSTIC, Wood.ALDER, Wood.ROSEWOOD, Style.A));
		
		inventory.addInstrument("M1090", 500, new MandolinSpec(Builder.TAYLOR,
				"No-Series", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ALDER, Style.F));
	}

}
