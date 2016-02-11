package models;

public class Location {

	int col;
	int row;
	
	public Location(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
	
	public int distanceToOtherLocation(Location otherLocation) {
		
		return (int)Math.sqrt(Math.pow((otherLocation.getRow() - this.getRow()), 2) +  Math.pow((otherLocation.getCol() - this.getCol()), 2));
	}
	
}
