/**
 * @author Arboy Magomba
 * @version 1.0
 * Project 12
 */

public class Driver {

	public static void main(String[] args) {
		// Create a legal Triangle object that has sides 5, 5, and 5.
		Triangle firstTriangle = new Triangle(5, 5, 5);
		
		// Print the sides of this object out using accessor methods other than toString.
		System.out.println("The three sides of the legal triangle are: " + firstTriangle.getSideA()
		+ " " + firstTriangle.getSideB() + " " +  firstTriangle.getSideC());
		
		// Use mutators to change this object so its sides are 9, 6, and 7.
		firstTriangle.setSideA(9);
		firstTriangle.setSideB(6);
		firstTriangle.setSideC(7);
		System.out.println("A was set to 9, then B to 6 and C to 7: " + firstTriangle.toString());
		
		// Line Space
		System.out.println();
		
		// Create a second Triangle object with sides 2, 2, and 10. This object is not in a 
		// legal state because 2 + 2 < 10. The constructor should modify it to create a legal Triangle.
		Triangle secondTriangle = new Triangle(2, 2, 10);
		
		// Print the sides of this object using toString.
		System.out.println("The illegal triangle contained: " + secondTriangle.toString());
		
		// Change side A of the illegal object to be 7. This is still illegal.
		secondTriangle.setSideA(7);
		
		// Print the sides of this object using toString.
		System.out.println("Changed side A to 7: " + secondTriangle.toString());
		
		// Change side B of the illegal object to be -10. This is still illegal.
		secondTriangle.setSideB(-10);
		
		// Print the sides of this object using toString.
		System.out.println("Changed side B to -10: " + secondTriangle.toString());
		
		// Change side C of the illegal object to be 21. This is still illegal.
		secondTriangle.setSideB(21);
		
		// Print the sides of this object using toString.
		System.out.println("Changed side C to 21: " + secondTriangle.toString());
	}

}
