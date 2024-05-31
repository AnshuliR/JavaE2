package whatsapp;

public class Data {
	public static void main(String[] args) {
		Whatsapp u1 = new Whatsapp(9988776655l, "Active", "Stay Focussed");
		System.out.println(u1.getPhno());
		u1.setPhno(9866574390l);
		System.out.println(u1.getPhno());
		//System.out.println(u1.getStatus(9866574390l));
		System.out.println(u1.getStatus(9866570008l));
		u1.setStatus("Inactive");
		System.out.println(u1.getStatus(9866574390l));
		System.out.println(u1.getBio());
		u1.setBio("Staying Focussed");
		System.out.println(u1.getBio());
	}
}
