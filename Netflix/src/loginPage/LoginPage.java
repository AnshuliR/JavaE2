package loginPage;
import java.util.Scanner;

public class LoginPage {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		//login details
		System.out.println("Welcome to Netflix");
		System.out.println("Sign In");
		System.out.println("Enter your email ");
		String email = sc.nextLine();
		System.out.println("Enter your password");
		String pass = sc.nextLine();
	}
	public static void main(String[] args) {
		
		login();
	}
}
