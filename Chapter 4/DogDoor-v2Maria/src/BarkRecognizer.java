import java.util.*;

public class BarkRecognizer {
	
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer: Heard a bark!");
		
		ArrayList<Bark> allowedBarks = door.getAllowedBarks();
		ListIterator<Bark> myIterator = allowedBarks.listIterator();
		
		while(myIterator.hasNext()) {
			Bark allowedBark = (Bark)myIterator.next();
			if(allowedBark.equals(bark)) {
				door.openDoor();
				return;
			}
		}
	    System.out.println("This dog is not allowed.");
	}
}
