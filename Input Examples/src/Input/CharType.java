package Input;
import java.util.Scanner;

public class CharType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char a = sc.next().charAt(0);
		System.out.println(a);
		System.out.println("Enter a character");
		char b = sc.next().charAt(1);
		System.out.println(b);
	}
}
