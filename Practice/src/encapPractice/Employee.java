package encapPractice;

public class Employee {
	private String ename;
	private double salary;
	private int eid;
	private String cname;
	
	public Employee(String ename, double salary, int eid, String cname) {
		this.ename = ename;
		this.salary = salary;
		this.eid = eid;
		this.cname = cname;
		
	}
	
	public String getEname(int eid) {
		if(this.eid == eid) {
			return ename;
		}
		else {
			return "Invalid employee id";
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getCname(int eid) {
		if(this.eid==eid) {
			return cname;
		}
		else {
			return "Invalid employee id";
		}
	}
	
}
