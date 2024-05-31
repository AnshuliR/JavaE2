package operation;

public class Factor {
	public static void factor(int n) {
		System.out.println("The factors of "+n+" : ");
		for(int i =1; i<=(n/2);i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		factor(6);
	}
}
