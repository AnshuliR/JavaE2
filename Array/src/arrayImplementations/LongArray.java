package arrayImplementations;

import java.util.Scanner;

public class LongArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		//creating the array
		long l1[] = new long[size];
		
		//storing the elements in the array
		System.out.println("Enter the elements in the array");
		for(int i = 0; i<size; i++) {
			l1[i] = sc.nextLong();
		}
		
		//printing the reference variable of the array
		System.out.println(l1);
		
		//printing number of elements present in the array
		System.out.println("Number of elements in the array = "+l1.length);
		
		//printing the elements
		for(int i=0;i<l1.length;i++) {
			System.out.println("Element at index "+i+" = "+l1[i]);
		}
		
		//printing elements in forward direction
		System.out.println("Elements in forward direction");
		for(int i=0; i<l1.length;i++) {
			System.out.println(l1[i]);
		}
		
		//printing elements in backward direction
		System.out.println("Elements in backward direction");
		for(int i = l1.length-1; i>=0; i--) {
			System.out.println(l1[i]);
		}
		
		sc.close();
	}
}
