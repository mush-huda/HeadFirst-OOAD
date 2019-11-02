
public class Remote {
	
	private DogDoor door;
	
	public Remote(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		if(door.isOpen()) {
			door.closeDoor();
		} else {
			door.openDoor();
		}
	}
}
