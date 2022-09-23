package daythree.stringexample;

public class StringComparison {

	// In Java we can compare String on the basis of content and reference
	// By using equals() method
	// By using == Operator
	// By compareTo() method --- in sorting

	public static void main(String[] args) {
		String str = new String("Hello");
		String s="Hello";
		String s1= new String("Hello");//str==s1 false    and s==str false
		System.out.println(s1==str);
		System.out.println(s==str); //Compares references not values
		System.out.println(s.equals(str));// Compares values of string of equality
		System.out.println(str.equals(s1));
		
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode()); //hashcode are same
		
		
	}

}
