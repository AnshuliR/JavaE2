package arrayImplementations;

import java.util.Scanner;

public class Opinion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		boolean opinion[] = new boolean[7];
		
		//Initializing the array
		System.out.println("Enter 7 opinions in the array");
		for(int i=0; i<opinion.length; i++) {
			opinion[i] = sc.nextBoolean();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(opinion);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+opinion.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<opinion.length;i++) {
			System.out.println("Element at index "+i+" = "+opinion[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<opinion.length;i++) {
			System.out.println(opinion[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = opinion.length-1; i>=0; i--) {
			System.out.println(opinion[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<opinion.length) {
			System.out.println(opinion[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=opinion.length-1;
		while(k>=0) {
			System.out.println(opinion[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(opinion[l]);
			l++;
		}while(l<opinion.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=opinion.length-1;
		do {
			System.out.println(opinion[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
				
		sc.close();
		
	}
}
