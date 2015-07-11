public class lab06_b {

	public static double footToMeter(double foot) {
		double meter = .305 * foot;

		return meter;
	}

	public static double meterToFoot(double meter) {

		double foot = .305 / meter;
		return foot;
	}

	public static void main(String[] agrs) {

		System.out.printf("%s%s", "Feet", "Meter");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%f%f", i, footToMeter(i));
		}

		System.out.println();

		System.out.printf("%s%s", "Meter", "Feet");

		for (int j = 20; j <= 65; j += 5) {
			System.out.printf("%f%f", j, meterToFoot(j));
		}
	}

}
