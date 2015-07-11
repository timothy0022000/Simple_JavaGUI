
public class Student {
	
	public static void main(String [] agrs){
		
		Student s1 = new Student ();
		s1.setName("Timothy");
		s1.setAge(25);
		s1.setCSstudent(false);
		s1.setGender("male");
		System.out.println(s1.toString());
	}
	
	String name;
	int age;
	boolean CSstudent;
	String gender;

	Student() {
		age = 18;
		CSstudent = false;
		gender = "male";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCSstudent() {
		return CSstudent;
	}

	public void setCSstudent(boolean cSstudent) {
		this.CSstudent = cSstudent;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return " name : " + name + "\n age : " + age + "\n gender : " + gender + 
		((CSstudent) ?  "\n" + name + " is a CS student " : "\n" + name + " is not a CS student ");
	}
}
