package Package;
import java.util.Scanner;
public class Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
