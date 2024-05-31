package arrayImplementations;

import java.util.Scanner;

public class EmpId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		int empid[] = new int[4];
		
		//Initializing the array
		System.out.println("Enter 4 employee id in the array");
		for(int i=0; i<empid.length; i++) {
			empid[i] = sc.nextInt();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(empid);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+empid.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<empid.length;i++) {
			System.out.println("Element at index "+i+" = "+empid[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<empid.length;i++) {
			System.out.println(empid[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = empid.length-1; i>=0; i--) {
			System.out.println(empid[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<empid.length) {
			System.out.println(empid[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=empid.length-1;
		while(k>=0) {
			System.out.println(empid[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(empid[l]);
			l++;
		}while(l<empid.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=empid.length-1;
		do {
			System.out.println(empid[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
		
				
		sc.close();
		
	}
}
