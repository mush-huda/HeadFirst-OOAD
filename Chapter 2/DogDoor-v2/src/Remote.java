import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	
	private DogDoor door;
	
	public Remote(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if(door.isOpen()) {
			door.closeDoor();
		} else {
			door.openDoor();
			
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() { 
							public void run() {
								door.closeDoor();
								timer.cancel();
							}
			}, 5000);
		}
	}
}
