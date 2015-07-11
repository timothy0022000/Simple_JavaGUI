import java.util.Scanner;

public class Triangle {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {
		
		try{
		// prompt user
		System.out.print("Enter side one :");
		int side = input.nextInt();

		System.out.print("Enter side two :");
		int side2 = input.nextInt();

		System.out.print("Enter side three:");
		int side3 = input.nextInt();

		double area = triangleArea(side, side2, side3);
		boolean isTriangle = validTriangle(side, side2, side3);
		// valid triangle check
		if (isTriangle == true) {
			System.out.println("The area of the triangle is: " + area);
		} else {
			System.out.println("Error!!! This is not a valid triangle.");
		}
		
		}catch(Exception e ){
			System.out.print(e.getMessage());
		}

	}

	/* compute area of triangle along with int casting the result */
	public static double triangleArea(double s1, double s2, double s3) {
		// declare variables
		double s, area;
		// sum up all sides
		s = (s1 + s2 + s3) / 2.0;
		// compute area
		area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		area = (int) (area * 100) / 100;

		return area;
	}

	/* check valid triangle */
	public static boolean validTriangle(double s1, double s2, double s3) {

		if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
			return true;
		} else {
			return false;
		}

	}

}
