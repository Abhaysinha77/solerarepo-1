package daytwo.interfaceexample;

public class CalculateAreaMain {

	public static void main(String[] args) {
	CalculateArea calculateArea = new CalculateAreaImpl();
	CalculateAreaImpl calArea = new CalculateAreaImpl();
	int result = calculateArea.calculateArea(10, 2);
	System.out.println(result);
	//Default method of an interface is called
	int  perimeter =calculateArea.calculatePerimeter(10, 2);
	
	System.out.println(perimeter);
	//Accessing static method of an interface
	CalculateArea.display();
	System.out.println(calArea.calculateArea(5, 2));
	System.out.println(calArea.calculatePerimeter(1, 2));
	//Not accessible
	//calculateArea.displayCalculateArea();
	calArea.displayCalculateArea();
	}

}
