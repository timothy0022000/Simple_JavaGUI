public class Points {
	// declare variables
	double x;
	double y;

	Points() {
		// default settings
		x = 0.0;
		y = 0.0;
	}

	public Points(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// X
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// Y
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// instance method
	public double distance(Points p2) {
		// declare variables
		double y1;
		double y2;
		double x1;
		double x2;
		double d;
		// compute distance
		x1 = x;
		x2 = p2.getX();
		y1 = y;
		y2 = p2.getY();
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return d;
	}

	// static method
	public static double distance(Points p1, Points p2) {
		// declare variables
		double y1;
		double y2;
		double x1;
		double x2;
		double d;
		// compute distance
		x1 = p1.getX();
		x2 = p2.getX();
		y1 = p1.getY();
		y2 = p2.getY();
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return d;
	}

	// main method
	public static void main(String[] agrs) {

		Points p1 = new Points();
		Points p2 = new Points(10.0, 30.5);
		
		printDisplay(p1, p2);

		System.exit(0);//exit program 
		
	}
	
	public static void printDisplay(Points a, Points b){
		
		// display
		System.out.println(" Point 1 : " + a.getX() + " , " + b.getY());
		System.out.println(" Point 2 : " + a.getX() + " , " + b.getY());

		System.out.println();// white space

		// display
		System.out.println("Static Distance Method "
				+ " \n The distance between the two points is : "
				+ Points.distance(a, b));
		System.out.println("Instance Distance Method "
				+ " \n The distance between the two points is : "
				+ a.distance(b));
	}

}
