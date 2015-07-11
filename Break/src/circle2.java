public class circle2 {

	// declare variables
	private double radius;

	circle2() {
		// create default
		radius = 1.0;

	}

	circle2(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {

		this.radius = radius;
	}

	public double computePermeter() {

		return 2 * Math.PI * radius;
	}

	public static void main(String[] agrs) {

		circle2 c1 = new circle2(5.5);

		System.out.println("The permeter of the circle is  "
				+ c1.computePermeter());
	}
}
