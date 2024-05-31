package constructor;

public class Student {
	String name;
	int roll;
	Student(){
		System.out.println("Account is created");
	}
	Student(String name) {
		this();
		this.name = name;
		System.out.println(name);
	}
	public Student(String name, int roll) {
		this(name);
		this.roll = roll;
		System.out.println(name+" "+roll);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("ANSHU");
		Student s2 = new Student("Anshu",1);
		System.out.println();
		Student s3 = new Student("Anshu",1);
	}
	
}
