package exercises;

class Student {
	int rollno;
	int dob;
	static String name;
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollno = 111;
		s1.dob = 2761994;
		Student.name = "Karthik";
		System.out.println("Instance variables are called using object referece.");
		System.out.println("Roll Number: " + s1.rollno);
		System.out.println("dob: " + s1.dob);
		System.out.println("Statc variables are called using class reference.");
		System.out.println("Name: " + Student.name);

	}

}
