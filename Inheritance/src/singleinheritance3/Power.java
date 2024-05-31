package singleinheritance3;

public class Power extends Number {
	public static void sqr(int n) {
		System.out.println("Square of "+n+" = "+(n*n));
	}
	
	public static void cube(int n) {
		System.out.println("Cube of "+n+ " = "+(n*n*n));
	}
	public static void main(String[] args) {
		Power p = new Power();
		p.sqr(p.n);
		p.cube(p.n);
	}
}
