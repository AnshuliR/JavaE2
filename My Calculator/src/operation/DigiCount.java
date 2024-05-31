package operation;

public class DigiCount {
	public static void digitCount(int n) {
		int rem, count = 0;
		while(n>0) {
			rem = n%10;
			count++;
			n = n/10;
		}
		System.out.println("The count of the digit in "+n+" = "+count );
	}
	public static void main(String[] args) {
		digitCount(678);
	}
}