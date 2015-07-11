
public class methods {

	public static double inchesIntoFeet(double inches){
		
		double feet  = inches * 12;
		
		return feet;
	}
	
	public static double feetIntoInches(double feet){
		
		double inches = feet / 12 ;
		
		return inches;
	}
	
	public static void main (String [] agrs ){
		System.out.println("Feet \t\t\t Inches");
		System.out.println("________________________________________");
		
		for (int i = 1; i <=10; i++){
			
			System.out.println(i + "\t\t\t" + inchesIntoFeet(i));
		}
		
		System.out.println();
		
		System.out.println("Inches \t\t\t Feet");
		System.out.println("________________________________________");
		
		for (int j = 12; j <= 60;j+=6){
			System.out.println(j + "\t\t\t " + feetIntoInches(j));
		}
	}
}
