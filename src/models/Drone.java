package models;

import java.util.ArrayList;

public class Drone {
	private boolean busy = false;
	private Location currentLocattion = new Location(1, 1);
	private int remaingSteps = 0;
	
	public Drone(boolean busy, Location currentLocattion, int remaingSteps) {
		super();
		this.busy = busy;
		this.currentLocattion = currentLocattion;
		this.remaingSteps = remaingSteps;
	}
	public Drone() {
	
	}
	public static ArrayList<Drone> createDefault(int quantity) {
		ArrayList<Drone> drone = new ArrayList<Drone>();
		for (int i = 0; i < quantity; i++) {
			drone.add(new Drone());
		}
		return drone;
		
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
