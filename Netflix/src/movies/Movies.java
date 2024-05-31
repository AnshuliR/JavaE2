package movies;
import java.util.Scanner;

public class Movies {
	public static void movies() {
		Scanner sc = new Scanner(System.in);
		int opt;
		do{
		System.out.println();
		System.out.println("Genre:");
		System.out.println("Press 1 for Action.");
		System.out.println("Press 2 for Dramas.");
		System.out.println("Press 3 for Comedies.");
		System.out.println("Press 4 for Romance.");
		System.out.println("Press 5 for Exit.");
		opt = sc.nextInt();
		switch(opt) {
		case 1: {
			System.out.println("Play: Red Notice.");
			System.out.println("Play: Fighter.");
			System.out.println("Play: Damsel.");
			break;
		}
		case 2: {
			System.out.println("Play: OMG.");
			System.out.println("Play: Missing.");
			System.out.println("Play: Khufiya.");
			break;
		}
		case 3: {
			System.out.println("Play: The Dictator.");
			System.out.println("Play: Grown Ups.");
			System.out.println("Play: Murder Mystery.");
			break;
		}
		case 4: {
			System.out.println("Play: Purple Hearts.");
			System.out.println("Play: Pride & Prejudice.");
			System.out.println("Play: Along for the ride.");
			break;
		}
		case 5: {
			System.out.println("Thank you for Watching.");
			break;
		}
		default: {
			System.out.println("Invalid Option.");
		}
		}
		}while(opt!=5);
	}
	public static void main(String[] args) {
		movies();
	}
}
