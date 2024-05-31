package arrayImplementations;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		String name[] = new String[10];
		
		//Initializing the array
		System.out.println("Enter 10 names in the array");
		for(int i=0; i<name.length; i++) {
			name[i] = sc.nextLine();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(name);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of names in the array = "+name.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<name.length;i++) {
			System.out.println("Element at index "+i+" = "+name[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = name.length-1; i>=0; i--) {
			System.out.println(name[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<name.length) {
			System.out.println(name[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=name.length-1;
		while(k>=0) {
			System.out.println(name[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(name[l]);
			l++;
		}while(l<name.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=name.length-1;
		do {
			System.out.println(name[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
		
				
		sc.close();
		
	}
}
