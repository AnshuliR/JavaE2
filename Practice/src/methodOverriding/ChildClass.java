package methodOverriding;

public class ChildClass extends MethodOver {
	@Override
	public void m1() {
		System.out.println("From child class");
	}
	public static void main(String[] args) {
		MethodOver m = new MethodOver();
		m.m1();
		ChildClass c = new ChildClass();
		c.m1();
		MethodOver pm = new ChildClass();
		pm.m1();
	}
}
