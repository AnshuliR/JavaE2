package homePage;
import java.util.Scanner;

public class HomePage {
	public static void home() {
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
		System.out.println();
		System.out.println("Press 1 for Continue watching.");
		System.out.println("Press 2 for New Releases.");
		System.out.println("Press 3 for Trending Now.");
		System.out.println("Press 4 for Only on netflix.");
		System.out.println("Press 5 for Exit.");
		opt = sc.nextInt();
		switch(opt) {
		case 1: {
			System.out.println("Play: The Vampire Diaries.");
			System.out.println("Play: Murder Mubarak.");
			System.out.println("Play: FRIENDS.");
			break;
		}
		case 2: {
			System.out.println("Play: The Great Indian Kapil Show.");
			System.out.println("Play: The Tearsmith.");
			System.out.println("Play: Parasite The Grey.");
			break;
		}
		case 3: {
			System.out.println("Play: Bridgerton.");
			System.out.println("Play: Money Heist.");
			System.out.println("Play: The Railwaymen.");
			break;
		}
		case 4: {
			System.out.println("Play: Kho Gaye Hum Kahan.");
			System.out.println("Play: Greenhouse Academy.");
			System.out.println("Play: Kaala Pani.");
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
		home();
	}
}
