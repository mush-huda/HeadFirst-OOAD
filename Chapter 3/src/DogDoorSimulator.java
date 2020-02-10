
public class DogDoorSimulator {
	
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside \n");
		recognizer.recognize("Woof");
		
//		remote.pressButton();
		
		System.out.println("\nFido has gone outside");
		System.out.println("\nFido's all done ...");
		
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e) {}
		
		System.out.println("\nBut he has stuck outside");
		System.out.println("\nFido starts barking agian.");
		recognizer.recognize("Woof");
//		System.out.println("\nGina hears and grabs the remote.");
//		remote.pressButton();
		System.out.println("\nFido is back inside");
	}
}