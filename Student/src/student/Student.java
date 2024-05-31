package student;

public class Student {
	private String name;
	private long phno;
	private int rollno;
	private double marks;
	private String coll_name;
	private long aadhar_no;
	public Student(String name, long phno, int rollno, double marks, String coll_name, long aadhar_no) {
		this.name = name;
		this.phno = phno;
		this.rollno = rollno;
		this.marks = marks;
		this.coll_name = coll_name;
		this.aadhar_no = aadhar_no;
	}
	
	public String getName(int rollno) {
		if(this.rollno == rollno) {
			return name;
		}
		else {
			return "Invalid roll number";
		}
		
	}
	
	public long getPhno() {
		
		return phno;
	}
	
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String getCollName() {
		return coll_name;
	}
	
	
}
