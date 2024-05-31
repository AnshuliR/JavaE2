package netflixImplementation;
import java.util.Scanner;
import homePage.HomePage;
import createProfile.CreateProfile;
import loginPage.LoginPage;
import movies.Movies;
import myList.MyList;
import newAndPopular.NewAndPopular;
import tvShow.TVShows;

public class NetflixImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginPage.login();
		CreateProfile.createProfile();
		int opt;
		do {
		System.out.println("Press 1 for Home.");
		System.out.println("Press 2 for TV Shows.");
		System.out.println("Press 3 for Movies.");
		System.out.println("Press 4 for News & Popular.");
		System.out.println("Press 5 for MyList.");
		System.out.println("Press 6 for Exit");
		opt = sc.nextInt();
		switch(opt) {
		case 1: {
			HomePage.home();
			break;
		}
		case 2: {
			TVShows.tvShows();
			break;
		}
		case 3:{
			Movies.movies();
			break;
		}
		case 4: {
			NewAndPopular.newAndPopular();
			break;
		}
		case 5: {
			MyList.myList();
			break;
		}
		case 6: {
			System.out.println("Thank you for Watching.");
			break;
		}
		default: {
			System.out.println("Invalid Option.");
		}
		}
		}while(opt!=6);
	}
}
