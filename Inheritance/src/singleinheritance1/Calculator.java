package singleinheritance1;

public class Calculator extends Number {
	public static void sum(int n1, int n2) {
		System.out.println("Sum = "+(n1+n2));
	}
	public static void sub(int n1, int n2) {
		System.out.println("Difference = "+(n1-n2));
	}
	public static void mul(int n1, int n2) {
		System.out.println("Product = "+(n1*n2));
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(c.n1,c.n2);
		c.sub(c.n1,c.n2);
		c.mul(c.n1, c.n2);
	}
}
