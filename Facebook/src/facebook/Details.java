package facebook;

public class Details {
	public static void main(String[] args) {
		Facebook u1 = new Facebook("Anshu", "u01", 123);
		System.out.println(u1.getUser_name(732));
		System.out.println(u1.getUser_name(123));
		u1.setUser_name("MG");
		System.out.println(u1.getUser_name(123));
		u1.setPwd(143);
		System.out.println(u1.getUser_name(982));
		System.out.println(u1.getUser_name(143));
	}
	
}
