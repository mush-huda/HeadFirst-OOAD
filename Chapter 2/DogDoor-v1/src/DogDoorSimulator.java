
public class DogDoorSimulator {
	
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside");
		remote.pressButton();
		System.out.println("\nFido is outside");
		remote.pressButton();
		System.out.println("\nFido's all done and barking to come inside");
		remote.pressButton();
		System.out.println("\nFido is back inside");
		remote.pressButton();
	}
}