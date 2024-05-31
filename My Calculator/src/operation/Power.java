package operation;

public class Power {
	public static void power(int a, int b) {
		int pow = 1;
		for(int i = 1; i<=b; i++) {
			
			pow = pow*a;
		}
		System.out.println(pow);
	}
	public static void main(String[] args) {
		power(3,2);
	}
}
