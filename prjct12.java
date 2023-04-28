/*The Triangle class contains:


Three double data fields named side1, side2, and side3

A default constructor that creates a triangle with three sides of length 1.0

A constructor that creates a triangle with specified values for side1, side2, and side3

Accessor methods for all three data fields

A method called getArea() that returns the area of a triangle

A method named getPerimeter() that returns the perimeter of the triangle



Test your Triangle class in a Drive program (in the same file) that prompts the user to enter the three sides of the triangle, the color, and whether or not the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties. Then, it should display the area, perimeter, color, and filled value. */
import java.util.Scanner;

public class Driver{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side 1 of triangle:");
		double side1 = input.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		double side2 = input.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		double side3 = input.nextDouble();
		System.out.print("Enter color of triangle:");
		String color = input.next();
		System.out.print("Enter whether triangle is filled (yes/no):");
		boolean filled = (input.next().equals("yes") ? true : false);
		Triangle t1 = new Triangle(side1, side2, side3, color, filled);
		System.out.println("Area: " + t1.getArea());
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Color: "+color);
		System.out.println("Filled?: "+filled);
	}

}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;


	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
		this(1, 1, 1);
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}


	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, the get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}