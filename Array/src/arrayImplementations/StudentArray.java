package arrayImplementations;

import java.util.Scanner;

public class StudentArray {
	
		String name;
		int age;
		double marks;
		
		public StudentArray(String name, int age, double marks){
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public double getMarks() {
			return marks;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of students");
			int n = sc.nextInt();
			sc.nextLine();
			
			//creating the array
			StudentArray s[] = new StudentArray[n];
			
			//printing the reference variable of the array
			System.out.println(s);
			
			//printing number of elements present in the array
			System.out.println("Number of elements in the array = "+s.length);
			
			
			//Initializing the array
			for(int i = 0; i<n;i++) {
				System.out.println("Enter the details of student");
				System.out.println("Enter the name");
				String name = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter marks");
				double marks = sc.nextDouble();
				sc.nextLine();
				s[i] = new StudentArray(name,age,marks);
			}
			
			//printing the elements
			for(int i =0; i<s.length;i++) {
				System.out.print("Student "+i+" : ");
				System.out.print(s[i].getName()+" ");
				System.out.print(s[i].getAge()+" ");
				System.out.print(s[i].getMarks()+" ");
				System.out.println();
			}
			sc.close();
		}
}
				
		
			
		
		
		
		
		
		
		