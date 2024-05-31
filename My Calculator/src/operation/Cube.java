package operation;

public class Cube {
	public static void cube(int n) {
		int cube = n*n*n;
		System.out.println("The cube of "+n+ " = "+cube);
	}
	public static void main(String[] args) {
		cube(4);
	}
}
