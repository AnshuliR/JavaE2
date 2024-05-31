package packageImplementation;
import java.util.Scanner;
import additionProg.AdditionJava;
import subProg.SubtractionJava;
import mulProg.MulJava;
import divProg.DivisionJava;
import operation.DigiCount;
import operation.Square;
import operation.Cube;
import operation.Factorial;
import operation.Factor;
import operation.Power;

public class PackageImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		do 
		{
		System.out.println("Welcome to My Program.");
		System.out.println("Enter the options to perform operations:");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter 5 for Other Operations: ");
		System.out.println("Enter 6 for Exit.");
		opt = sc.nextInt();
		switch(opt) {
		case 1:
		{
			System.out.println("Enter two numbers");
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        AdditionJava.add(n1, n2);
	        break;
		}
		case 2:
		{
			System.out.println("Enter two numbers");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			SubtractionJava.subtraction(n1, n2);
			break;
		}
		case 3:
		{
			System.out.println("Enter two numbers");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			MulJava.mul(n1, n2);
			break;
		}
		case 4:
		{
			System.out.println("Enter two numbers");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			DivisionJava.div(n1,n2);
			break;
		}
		case 5:
		{
			System.out.println("Enter 1 for Count the digit.");
			System.out.println("Enter 2 for Square.");
			System.out.println("Enter 3 for Cube.");
			System.out.println("Enter 4 for Factorial.");
			System.out.println("Enter 5 for Factor.");
			System.out.println("Enter 6 for Power.");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
			{
				System.out.println("Enter the number");
				int n = sc.nextInt();
				DigiCount.digitCount(n);
				break;
			}
			case 2:
			{
				System.out.println("Enter the number");
				int n = sc.nextInt();
				Square.square(n);
				break;
			}
			case 3:
			{
				System.out.println("Enter the number");
				int n = sc.nextInt();
				Cube.cube(n);
				break;
			}
			case 4:
			{
				System.out.println("Enter the number");
				int n = sc.nextInt();
				Factorial.factorial(n);
				break;
			}
			case 5:
			{
				System.out.println("Enter the number");
				int n = sc.nextInt();
				Factor.factor(n);
				break;
			}
			case 6:
			{
				System.out.println("Enter two numbers");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				Power.power(n1, n2);
				break;
			}
			default:
				System.out.println("Invalid option");
			}
			break;
		}
		case 6:
		{
			System.out.println("Thank you.");
			System.out.println("For more program, Contanct Anshuli.");
			break;
		}
		default:
		{
			System.out.println("Invalid option");
		}
		}
		}while(opt != 6);
	}
}
