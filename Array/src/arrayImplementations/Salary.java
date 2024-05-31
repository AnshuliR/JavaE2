package arrayImplementations;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		double salary[] = new double[5];
		
		//Initializing the array
		System.out.println("Enter 5 salaries in the array");
		for(int i=0; i<salary.length; i++) {
			salary[i] = sc.nextDouble();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(salary);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+salary.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<salary.length;i++) {
			System.out.println("Element at index "+i+" = "+salary[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<salary.length;i++) {
			System.out.println(salary[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = salary.length-1; i>=0; i--) {
			System.out.println(salary[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<salary.length) {
			System.out.println(salary[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=salary.length-1;
		while(k>=0) {
			System.out.println(salary[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(salary[l]);
			l++;
		}while(l<salary.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=salary.length-1;
		do {
			System.out.println(salary[m]);
			m--;
		}while(m>=0);
		System.out.println();
				
		sc.close();
		
	}
}
