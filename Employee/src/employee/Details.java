package employee;

public class Details {
	public static void main(String[] args) {
		Employee e1 = new Employee("Bella", 20000.0, 101, "01-06-24" ,"Google");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname(123));
		System.out.println(e1.getEname(101));
		System.out.println(e1.getJoin_date());
		System.out.println(e1.getCname());
		System.out.println(e1.getSalary());
		System.out.println("Updated Salary after Increment");
		e1.setSalary(30000.0);
		System.out.println(e1.getSalary());
	}
}
