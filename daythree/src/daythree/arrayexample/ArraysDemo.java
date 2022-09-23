package daythree.arrayexample;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int numbers[] = {15,8,6,3,5,7};
		System.out.println(numbers);
		for(int n : numbers) {
			System.out.println(n);
		}
		System.out.println("*************************************");
		
		Arrays.sort(numbers);
		for(int n : numbers) {
			System.out.println(n);
		}
		System.out.println("*************************************");
		int nums[] = Arrays.copyOf(numbers, 6);
		for(int n : nums) {
			System.out.println(n);
		}
	}

}
