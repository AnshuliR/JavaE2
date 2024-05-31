package student;

public class Details {
	public static void main(String[] args) {
		Student s1 = new Student("Anshuli", 7723112190l, 5, 96.7, "GD Goenka", 2214551789l);
		System.out.println("Display the details of the student");
		System.out.println(s1.getName(10));
		System.out.println(s1.getName(5));
		System.out.println(s1.getPhno());
		System.out.println("Update new phone number");
		s1.setPhno(7784932038l);
		System.out.println(s1.getPhno());
		System.out.println(s1.getRollno());
		System.out.println(s1.getMarks());
		System.out.println("Update the final marks");
		s1.setMarks(98.3);
		System.out.println(s1.getMarks());
		System.out.println(s1.getCollName());
	}
}
