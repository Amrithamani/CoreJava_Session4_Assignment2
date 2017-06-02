package session4;

public class Shirt {

	// initialize private variables we need to use

	private int collarSize;

	private int sleeveLength;

	private String shirtMaterial;

	// creating default constructor 1

	public Shirt() {

		this.setCollarSize(14);// setting 14 value to the collarSize

		this.setSleeveLength(23);// setting 23 value to the sleeveLength

		this.setShirtMaterial("Cotton");
		// setting Cotton String to the shirtMaterial

	}

	// creating parameterized constructor 2
	public Shirt(int collarSize, int sleeveLength) {

		this.setCollarSize(collarSize);// setting value to the collarSize

		this.setSleeveLength(sleeveLength);// setting value to the sleeveLength

		this.setShirtMaterial("Cotton");
		// setting Cotton String to the shirtMaterial

	}

	// Using Encapsulation concept

	// creating getter method for collarSize

	public int getCollarSize() {
		return collarSize;
	}

	// creating setter method for collarSize

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	// creating getter method for sleeveLength

	public int getSleeveLength() {
		return sleeveLength;
	}

	// creating setter method for sleeveLength

	public void setSleeveLength(int sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	// creating getter method for shirtMaterial

	public String getShirtMaterial() {
		return shirtMaterial;
	}

	// creating setter method for shirtMaterial

	public void setShirtMaterial(String shirtMaterial) {
		this.shirtMaterial = shirtMaterial;
	}

	// creating displayInformation method for the member variables

	public void displayInformation() {

		System.out.println("The Shirt Collar Size is " + collarSize);
		// prints The Shirt Collar Size is "collarSize:value"

		System.out.println("The Shirt Sleeve Length is " + sleeveLength);
		// prints The Shirt Sleeve Length is "sleeveLength:value"

		System.out.println("The Shirt Material is " + shirtMaterial);
		// prints The Shirt Material is Cotton

	}

}
