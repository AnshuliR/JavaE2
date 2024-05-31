package methodOverloading;

public class Method1 {
	public static void m1() {
		System.out.println("No argument method");
	}
	public static void m1(int n) {
		System.out.println(n);
	}
	public static void m1(int n, double d) {
		System.out.println(n+" "+d);
	}
	public static void main(String[] args) {
		m1();
		m1(5);
		m1(4,2);
	}
}
