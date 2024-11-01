/**
 * @author Arboy Magomba
 * @version 1.0
 * Project 12
 */

import java.text.DecimalFormat;

public class Triangle {
	
	private double sideA;
	private double sideB;
	private double sideC;
			
	private static final DecimalFormat FORMATTER = new DecimalFormat("#.###"); 
	private static final double DEFAULT_SIDE = 1.0;
	
	public Triangle(double sideA, double sideB, double sideC) {
		
		if (isTriangle(sideA, sideB, sideC) == true)
		{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		}
		else if (isTriangle(sideA, sideB, sideC) == false)
		{
		this.sideA = DEFAULT_SIDE;
		this.sideB = DEFAULT_SIDE;
		this.sideC = DEFAULT_SIDE;
		}
		
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}

	public boolean setSideA(double sideA) {
		if (isTriangle(sideA, this.sideB, this.sideC) == true)
		{
			this.sideA = sideA;
			return true;
		}
		else {
			return false;
		}

	}

	public boolean setSideB(double sideB) {
		if (isTriangle(this.sideA, sideB, this.sideC) == true)
		{
			this.sideB = sideB;
			return true;
		}
		else {
			return false;
		}
	}
	

	public boolean setSideC(double sideC) {
		if (isTriangle(this.sideA, this.sideB, sideC) == true)
		{
			this.sideC = sideC;
			return true;
		}
		else {
			return false;
		}		
	}
	
	private static boolean isTriangle(double a, double b, double c) {
		
		if (a > 0.0 && b > 0.0 && c > 0.0 && a + b > c 
				&& a + c > b && b + c > a)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString() {
		
		return "Triangle" + "(" + FORMATTER.format(sideA) + ", " + FORMATTER.format(sideB) + ", " + FORMATTER.format(sideC) + ")";
	}
	
}
