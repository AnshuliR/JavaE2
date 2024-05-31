package mulProg;
import java.util.Scanner;

public class MulJava {
	public static void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" = "+mul);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		mul(n1,n2);
		
	}
}
