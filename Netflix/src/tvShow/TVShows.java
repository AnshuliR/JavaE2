package tvShow;
import java.util.Scanner;

public class TVShows {
	public static void tvShows() {
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
			System.out.println("Play: Outer Banks.");
			System.out.println("Play: The Night Agent.");
			System.out.println("Play: Berlin.");
			break;
		}
		case 2: {
			System.out.println("Play: YOU.");
			System.out.println("Play: The Good Doctor.");
			System.out.println("Play: Crash Landing On You.");
			break;
		}
		case 3: {
			System.out.println("Play: FRIENDS.");
			System.out.println("Play: Big Bang Theory.");
			System.out.println("Play: Man vs Bee.");
			break;
		}
		case 4: {
			System.out.println("Play: My Demon.");
			System.out.println("Play: Hidden Love.");
			System.out.println("Play: Little Things.");
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
		tvShows();
	}
}
