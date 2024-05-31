package arrayImplementations;
import java.util.Scanner;
 
public class RollNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating an array
		int rollno[] = new int[7];
		
		//Initializing the array
		System.out.println("Enter the elements in the array");
		for(int i=0; i<rollno.length; i++) {
			rollno[i] = sc.nextInt();
		}
		System.out.println();
		
		//printing the reference
		System.out.println(rollno);
		System.out.println();
		
		
		//printing size of the array
		System.out.println("Number of elements in the array = "+rollno.length);
		System.out.println();
		
		
		//printing the elements with the help of index
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Element at index "+i+" = "+rollno[i]);
		}
		System.out.println();
		
		
		//printing elements in forward direction using for loop
		System.out.println("Elements in forward direction using for loop");
		for(int i=0; i<rollno.length;i++) {
			System.out.println(rollno[i]);
		}
		System.out.println();
				
		//printing elements in backward direction using for loop
		System.out.println("Elements in backward direction using for loop");
		for(int i = rollno.length-1; i>=0; i--) {
			System.out.println(rollno[i]);
		}
		System.out.println();
		
		//printing elements in forward direction using while loop
		System.out.println("Elements in forward direction using while loop");
		int j=0;
		while(j<rollno.length) {
			System.out.println(rollno[j]);
			j++;
		}
		System.out.println();
		
		//printing elements in backward direction using while loop
		System.out.println("Elements in backward direction using while loop");
		int k=rollno.length-1;
		while(k>=0) {
			System.out.println(rollno[k]);
			k--;
		}
		System.out.println();
		
		//printing elements in forward direction using do while loop
		System.out.println("Elements in forward direction using do while loop");
		int l=0;
		do {
			System.out.println(rollno[l]);
			l++;
		}while(l<rollno.length);
		System.out.println();
		
		//printing elements in backward direction using do while loop
		System.out.println("Elements in backward direction using do while loop");
		int m=rollno.length-1;
		do {
			System.out.println(rollno[m]);
			m--;
		}while(m>=0);
		System.out.println();
	
		
				
		sc.close();
		
	}
}
