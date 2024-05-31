package Inheritance;

public class Cauliflower extends Vegetable {
	double price = 25;
	public static void main(String[] args) {
		Vegetable v = new Cauliflower();
		System.out.println(v.origin);
		Cauliflower c = (Cauliflower)v;
		System.out.println(c.origin);
		System.out.println(c.price);
	}
}
