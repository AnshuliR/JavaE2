package interfacePrac;

public class Child implements Parent {
	public void m1() {
		System.out.println("Abstraction with the help of interface");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		Parent p = new Child();
		p.m1();
	}
}
