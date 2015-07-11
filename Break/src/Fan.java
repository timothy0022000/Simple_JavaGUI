public class Fan {

	public static void main(String[] agrs) {

		System.out.println("FAN 1");
		// fan1
		Fan f1 = new Fan();
		f1.setSpeed(FAST);
		f1.setRadius(10.0);
		f1.setColor("Yellow");
		f1.setOn(true);
		System.out.println(f1.toString());

		System.out.println();

		System.out.println("FAN 2");
		// fan 2
		Fan f2 = new Fan();
		f2.setSpeed(MEDIUM);
		f2.setRadius(5.0);
		f2.setColor("Blue");
		f2.setOn(false);
		System.out.println(f2.toString());

		System.exit(0);// close program
	}

	// speed settings
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	// default settings
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";

	Fan() {
	}

	// speed
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// on or off
	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	// radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// display string
	public String toString() {
		return " speed : " + speed + "\n color : " + color + "\n Radius : "
				+ radius + ((on) ? "\n Fan is on !!!" : "\n Fan is off!!!");
	}
}
