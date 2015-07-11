
public class Circle {

	double radius;
	
	Circle (){
		radius  = 1.0;
	}
	
	Circle (double newRadius){
		//radius = newRadius;
		this.radius = newRadius;
	}
	
	double getArea(){
		return Math.PI * Math.pow(radius,2);
	}
	
	public static void main (String []agrs){
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.0);
		
		System.out.println("The area of circle one is " + c1.getArea() );
		System.out.println("The area of circle two is " + c2.getArea() );
		
		System.exit(0);
	}
}
