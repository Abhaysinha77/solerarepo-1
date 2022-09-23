package daythree.arrayexample;

/**
 * 
 * @author UD SYSTEMS
 *
 * An array is a collection of elements of same type
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		//Declare an array
		int[] intArr;
		double[] doubleArr;
		double num = 1.0;
		doubleArr = new double[3];
		intArr = new int[5];
		
		System.out.println(intArr[0]);
		System.out.println(doubleArr[0]);
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		//intArr[5] = 6;
		
		System.out.println(intArr);
		System.out.println(intArr.toString());
		
		System.out.println(intArr[0]);
		System.out.println(intArr[2]);
		
		System.out.println("***************************************");
		//intArr[5]  ---  0 1 2 3 4
		//1 2 3 4 5
		
		for(int index=0; index<intArr.length;index++) {
			System.out.println(intArr[index]);
		}
		
		for (int j = 0; j < doubleArr.length; j++) {

			doubleArr[j] = num;
			num++;
		}
		System.out.println("***************************");
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("***************************");
		int age[] = { 18, 17, 20, 25, 23 };

		System.out.println("***************************");
		for (int a : age) {
			System.out.println(a);
		}
		
		System.out.println("*********Array of objects******************");
		Person person = new Person();
		person.setPersonId(420);
		person.setPersonName("Pandey");
		
		Person[] personArr= new Person[5];
		personArr[0] = new Person(1,"Lokesh");
		personArr[1] = new Person(2,"ARUN");
		personArr[2] = new Person(3,"Rashmika");
		personArr[3] = new Person(4,"Allu Arjun");
		personArr[4] = person;
		
		for(Person persn: personArr) {
			System.out.println(persn);
		}
		
		
	}
}
