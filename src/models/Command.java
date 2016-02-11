package models;

public class Command {
	
	public enum CommandType {
	    L,D,W 
	}
	
	int drona;
	CommandType commandType;
	int warehouse;
	int productType;
	int productsCount;
	
	public Command(int drona, CommandType commandType, int warehouse, int productType, int productsCount) {
		this.drona = drona;
		this.commandType = commandType;
		this.warehouse = warehouse;
		this.productType = productType;
		this.productsCount = productsCount;
	}

	public int getDrona() {
		return drona;
	}

	public CommandType getCommandType() {
		return commandType;
	}

	public int getWarehouse() {
		return warehouse;
	}

	public int getProductType() {
		return productType;
	}

	public int getProductsCount() {
		return productsCount;
	}
	
	private String getCommandTypeAsString() {
		
		switch (commandType) {
		case D:
			return "D";
		case L:
			return "L";
		case W:
			return "W";

		default:
			return "";
		}
	}
	
	@Override
	public String toString() {
		return drona + " " + getCommandTypeAsString() + " " + warehouse + " " + productType + " " + productsCount;
	}
	
	
	
}
