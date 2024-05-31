package arrayImplementations;

import java.util.Scanner;

public class DoubleArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		//creating the array
		double b1[] = new double[size];
		
		//storing the elements in the array
		System.out.println("Enter the elements in the array");
		for(int i = 0; i<size; i++) {
			b1[i] = sc.nextDouble();
		}
		
		//printing the reference variable of the array
		System.out.println(b1);
		
		//printing number of elements present in the array
		System.out.println("Number of elements in the array = "+b1.length);
		
		//printing the elements
		for(int i=0;i<b1.length;i++) {
			System.out.println("Element at index "+i+" = "+b1[i]);
		}
		
		//printing elements in forward direction
		System.out.println("Elements in forward direction");
		for(int i=0; i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
		//printing elements in backward direction
		System.out.println("Elements in backward direction");
		for(int i = b1.length-1; i>=0; i--) {
			System.out.println(b1[i]);
		}
		
		sc.close();
	}
}
