import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	
	private boolean open;
	private ArrayList<Bark> allowedBarks;
		
	public DogDoor() {
		this.allowedBarks = new ArrayList<Bark>();
		this.open = false;	
	}
	
	public void openDoor() {
		System.out.println("The dog door opens");
		open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() { 
						public void run() {
							closeDoor();
							timer.cancel();
						}
		}, 5000);
	}
	
	public void closeDoor() {
		System.out.println("The dog door closes");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void setAllowedBarks(Bark bark) {
		allowedBarks.add(bark);
	}
	
	public ArrayList<Bark> getAllowedBarks() {
		return allowedBarks;
	}

}
