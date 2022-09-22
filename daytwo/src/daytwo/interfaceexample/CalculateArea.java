package daytwo.interfaceexample;

public interface CalculateArea {
	public static final int x =10;
	//abstract method-- without body
	public int calculateArea(int length, int breadth);
	
	default int calculatePerimeter(int length, int breadth) {
		return length+breadth;
	}

	static void display() {
		System.out.println("I am a static method display in an interface");
	}
	
	
}
