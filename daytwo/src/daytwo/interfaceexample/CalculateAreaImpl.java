package daytwo.interfaceexample;

public class CalculateAreaImpl implements CalculateArea {
    //implementation of abstract method present in Calculate Area interface
	@Override
	public int calculateArea(int length, int breadth) {
		//body of the method
		return length*breadth;
	}
	
	public void displayCalculateArea() {
		System.out.println("I am inside CalculateAreaImpl class");
	}

}
