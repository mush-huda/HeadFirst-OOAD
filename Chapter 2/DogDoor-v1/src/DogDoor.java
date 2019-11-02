
public class DogDoor {
	
	private boolean open;
		
	public DogDoor() {
		this.open = false;	
	}
	
	public void openDoor() {
		System.out.println("The dog door opens");
		open = true;
	}
	
	public void closeDoor() {
		System.out.println("The dog door closes");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}

}
