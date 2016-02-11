package models;

public class Drone {
	private boolean busy;
	private Location currentLocattion;
	private int remaingSteps;
	
	public Drone(boolean busy, Location currentLocattion, int remaingSteps) {
		super();
		this.busy = busy;
		this.currentLocattion = currentLocattion;
		this.remaingSteps = remaingSteps;
	}
	
	
	public boolean isBusy() {
		return busy;
	}
	public void setBusy(boolean busy) {
		this.busy = busy;
	}
	public Location getCurrentLocattion() {
		return currentLocattion;
	}
	public void setCurrentLocattion(Location currentLocattion) {
		this.currentLocattion = currentLocattion;
	}
	public int getRemaingSteps() {
		return remaingSteps;
	}
	public void setRemaingSteps(int remaingSteps) {
		this.remaingSteps = remaingSteps;
	}

}
