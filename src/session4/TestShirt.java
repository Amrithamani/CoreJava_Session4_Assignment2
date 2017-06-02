package session4;

public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shirt obj1 = new Shirt();// creating obj1 for Shirt class

		Shirt obj2 = new Shirt(15, 25);
		// creating obj2 for Shirt class by passing values

		Shirt obj3 = new Shirt(17, 30);
		// creating obj3 for Shirt class by passing values

		obj1.displayInformation();
		// calling method in Shirt by obj1

		obj2.displayInformation();
		// calling method in Shirt by obj2

		obj3.displayInformation();
		// calling method in Shirt by obj3

	}

}
