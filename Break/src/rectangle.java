+++/.import java.util.Scanner;//import Scanner 

public class rectangle {
	// declare variables
	double length;
	double width;

	rectangle() {
		length = 1.0;// set default
		width = 1.0;

	}

	rectangle(double newLength, double newWidth) {
		// Constructors
		this.length = newLength;
		this.width = newWidth;
	}

	// compute area
	double getArea() {
		return length * width;
	}

	public static void main(String[] agrs) {

		Scanner input = new Scanner(System.in);

		// prompt user
		System.out.print("Set width  : ");
		double num1 = input.nextDouble();

		System.out.print("Set length : ");
		double num2 = input.nextDouble();

		// build file
		rectangle r1 = new rectangle(num1, num2);
		// printout
		System.out.println();// white space

		printRectangle(r1);// invoke print method
	}

	// print method
	public static void printRectangle(rectangle r) {

		System.out.println("The area of a rectangle is :  " + r.getArea());
	}
}
