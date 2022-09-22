package daytwo.interfaceexample;

public class CalculateAreaImpl implements CalculateArea {

	@Override
	public int calculateArea(int length, int breadth) {
		
		return length*breadth;
	}
	
	public void displayCalculateArea() {
		System.out.println("I am inside CalculateAreaImpl class");
	}

}
