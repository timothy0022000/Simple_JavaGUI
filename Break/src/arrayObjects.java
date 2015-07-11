public class arrayObjects {

	public static Circle[] makeCircleArray() {
		Circle[] circleArray = new Circle[5];

		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		return circleArray;
	}

	public static double sum(Circle[] circleArray) {
		double sum = 0;
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		return sum;
	}

	public static void printCircleArry(Circle[] circleArray) {

		System.out.printf("%s\t\t\t%s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%f\t\t%f\n", circleArray[i].radius,
					circleArray[i].getArea());
		}
		System.out
				.println("__________________________________________________________");
		System.out.printf("%s\t\t%f\n", "The total area of the circles is",
				sum(circleArray));
	}

	public static void main(String[] agrs) {
		Circle[] circleArray;

		circleArray = makeCircleArray();

		printCircleArry(circleArray);
	}

}
