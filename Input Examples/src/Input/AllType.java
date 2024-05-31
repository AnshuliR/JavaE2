package Input;
import java.util.Scanner;

public class AllType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		System.out.println("Enter the name");
		String s = sc.nextLine();
		s = sc.nextLine();
		System.out.println("Enter a double value");
		double d = sc.nextDouble();
		System.out.println(n);
		System.out.println(c);
		System.out.println(s);
		System.out.println(d);
	}
}
