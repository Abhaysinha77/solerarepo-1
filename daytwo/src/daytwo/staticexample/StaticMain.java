package daytwo.staticexample;

public class StaticMain {

	public static void main(String[] args) {
		Student student  = new Student();
		System.out.println(Student.age);
		
		student.setSalary(1000000);
		System.out.println(student.getSalary());
		//display();
		displayInfo();
	}
	
	void display() {
		System.out.println("I am non static method");
		displayInfo();
	}
	
	static void displayInfo() {
		//display();
		System.out.println("I am static display method");
	}
}
