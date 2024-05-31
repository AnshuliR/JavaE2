package createProfile;
import java.util.Scanner;

public class CreateProfile {
	public static void createProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Who's watching?");
		int profile = 0;  //profile count
		int choice;
		do {
		System.out.println("Press 1 for creating a new profile.");
		System.out.println("Press 2 for already existing profile.");
		choice = sc.nextInt();
		switch(choice) {
		case 1:{
			if (profile<6) {
				System.out.println("Add a profile");
				System.out.println("Enter your name");
				String n = sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter your age");
				int age = sc.nextInt();
				System.out.println("Add three most liked movies or shows");
				String s = sc.nextLine();
				String s1 = sc.nextLine();
				String s2 = sc.nextLine();
				String s3 = sc.nextLine();
				profile++;
				System.out.println("Save and continue");
				
;			}
			else {
				System.out.println("Sorry, Cannot make any more profiles.");
			}
			break;
		}
		case 2:{
			if(profile>0) {
				System.out.println("Click on the profile");
			}
			else {
				System.out.println("No available profiles");
				choice = 0;
			}
			break;
		}
		default:{
			System.out.println("Invalid option");
		}
		}
		}while(choice!=2);
	}
	public static void main(String[] args) {
		createProfile();
		
	}
}
