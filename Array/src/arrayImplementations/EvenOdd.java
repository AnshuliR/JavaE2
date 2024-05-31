package arrayImplementations;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of two arrays");
		int size = sc.nextInt();
		
		//creating firsts array
		int a1[] = new int[size];
		//creating second array
		int a2[] = new int[size];
		
		//Initializing elements in first array
		System.out.println("Enter the elements in first array");
		for(int i=0; i<a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.println();
		
		//Printing even elements from the first array
		System.out.println("Even elements in the first array are:");
		for(int i=0; i<a1.length; i++) {
			if(a1[i]%2 == 0) {
				System.out.println(a1[i]);
			}
		}
		System.out.println();
		
		//Printing number of odd elements in the first array
		int odd = 0;
		for(int i=0; i<a1.length; i++) {
			if(a1[i]%2 != 0) {
				odd++;
			}
		}
		System.out.println("Number of odd elements in the array is: "+odd);
		System.out.println();
		
		//Storing first array elements in second array in reverse order
		int j = a2.length-1;
		for(int i=0; i<a1.length; i++) {
			a2[j] = a1[i];
			j--;
		}
		System.out.println("Elements in the second array are: ");
		for(int i=0; i<a2.length; i++) {
			System.out.println(a2[i]);
		}
		System.out.println();
		
		
		//Printing even index's elements
		System.out.println("Elements at even index are:");
		for(int i=0; i<a1.length; i++) {
			if(i%2 == 0) {
				System.out.println("Element at index "+i+" = "+a1[i]);
			}
		}
	}
}
