
public class BarkRecognizer {
	
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer: Heard a bark!");
		if(door.getAllowedBark().equals(bark)) {
			door.openDoor();
		} else {
			System.out.println("This dog is not allowed");
		}
	}
}
