package arrayImplementations;

import java.util.Scanner;

public class PhoneNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		long ph_no[] = new long[3];
		
		//Initializing the array
		System.out.println("Enter 3 phone numbers in the array");
		for(int i=0; i<ph_no.length; i++) {
			ph_no[i] = sc.nextLong();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(ph_no);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+ph_no.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<ph_no.length;i++) {
			System.out.println("Element at index "+i+" = "+ph_no[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<ph_no.length;i++) {
			System.out.println(ph_no[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = ph_no.length-1; i>=0; i--) {
			System.out.println(ph_no[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<ph_no.length) {
			System.out.println(ph_no[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=ph_no.length-1;
		while(k>=0) {
			System.out.println(ph_no[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(ph_no[l]);
			l++;
		}while(l<ph_no.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=ph_no.length-1;
		do {
			System.out.println(ph_no[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
				
		sc.close();
		
	}
}
