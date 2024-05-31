package arrayImplementations;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		char group[] = new char[8];
		
		//Initializing the array
		System.out.println("Enter 8 groups in the array");
		for(int i=0; i<group.length; i++) {
			group[i] = sc.next().charAt(0);
		}
		System.out.println();
		
		//printing the reference
		System.out.println(group);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+group.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<group.length;i++) {
			System.out.println("Element at index "+i+" = "+group[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<group.length;i++) {
			System.out.println(group[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = group.length-1; i>=0; i--) {
			System.out.println(group[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<group.length) {
			System.out.println(group[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=group.length-1;
		while(k>=0) {
			System.out.println(group[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(group[l]);
			l++;
		}while(l<group.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=group.length-1;
		do {
			System.out.println(group[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
				
		sc.close();
		
	}
}
