package arrayImplementations;

import java.util.Scanner;

public class FloatArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		//creating the array
		float f1[] = new float[size];
		
		//storing the elements in the array
		System.out.println("Enter the elements in the array");
		for(int i = 0; i<size; i++) {
			f1[i] = sc.nextFloat();
		}
		
		//printing the reference variable of the array
		System.out.println(f1);
		
		//printing number of elements present in the array
		System.out.println("Number of elements in the array = "+f1.length);
		
		//printing the elements
		for(int i=0;i<f1.length;i++) {
			System.out.println("Element at index "+i+" = "+f1[i]);
		}
		
		//printing elements in forward direction
		System.out.println("Elements in forward direction");
		for(int i=0; i<f1.length;i++) {
			System.out.println(f1[i]);
		}
		
		//printing elements in backward direction
		System.out.println("Elements in backward direction");
		for(int i = f1.length-1; i>=0; i--) {
			System.out.println(f1[i]);
		}
		
		sc.close();
	}
}
