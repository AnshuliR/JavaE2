package abstractionPrac;

public class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("Abstraction withe the help of abstract class");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		Parent p = new Child();
		p.m1();
	}
}
