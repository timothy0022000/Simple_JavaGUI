
public class students {

	public static void main (String [] agrs){
		
		students s1 = new students("Timothy Johnson", 26 , "Georgia Southern");
		
		System.out.println(s1.tostring());
		
	}
	String name;
	int age;
	String school;
	
	
	public students(String name,int age, String school){
		this.name = name;
		this.age = age;
		this.school = school;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	public String tostring(){
		return "Name :" + name + "\nAge :" + age + "\nSchool :" + school;
	}
	
}
