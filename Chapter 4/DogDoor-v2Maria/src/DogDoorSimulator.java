
public class DogDoorSimulator {
	
	public static void main(String[] args) {
		
		DogDoor door = new DogDoor();
		door.setAllowedBarks(new Bark("Woof!"));
		door.setAllowedBarks(new Bark("Rawlf!"));
		door.setAllowedBarks(new Bark("Rowlf!"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		
		System.out.println("A small dog barks.");
		recognizer.recognize(new Bark("Yip!"));
		
		System.out.println("\nBruce barks to go outside.");
		recognizer.recognize(new Bark("Woof!"));
//		remote.pressButton();
		System.out.println("\nBruce has gone outside");
		System.out.println("\nBruce is all done ...");
		
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e) {}
		
		System.out.println("\nBut he has stuck outside.");
		System.out.println("\nA big dog barks at this moment.");
		recognizer.recognize(new Bark("Ruff!"));
		
		System.out.println("\nBruce starts barking again.");
		recognizer.recognize(new Bark("Rawlf!"));
//		System.out.println("Gina hears and grabs the remote.\n");
//		remote.pressButton();
		System.out.println("\nBruce is back inside.");
	}
}