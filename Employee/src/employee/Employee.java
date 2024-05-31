package employee;

public class Employee {
	private String ename;
	private double salary;
	private int eid;
	private String join_date;
	private String cname;
	public Employee(String ename, double salary, int eid, String join_date, String cname) {
		this.ename = ename;
		this.salary = salary;
		this.eid = eid;
		this.join_date = join_date;
		this.cname = cname;
	}
	public String getEname(int eid) {
		if(this.eid == eid) {
			return ename;
		}
		else {
			return "Invalid Employee id";
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
	
	public String getJoin_date() {
		return join_date;
	}
	
	public String getCname() {
		return cname;
	}
	
	
	
}
