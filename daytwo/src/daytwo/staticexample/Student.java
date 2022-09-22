package daytwo.staticexample;

public class Student {
	
	private String studentName;
	public static int age =18;
	private static int salary =15000;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	public static int getSalary() {
		return salary;
	}
	public static void setSalary(int salary) {
		Student.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}
	
	

}
