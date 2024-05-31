package encapPractice;

public class Details {
	public static void main(String[] args) {
		Employee e1 = new Employee("Anshu",100000.00,101,"Google");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname(101));
		System.out.println(e1.getSalary());
		System.out.println(e1.getCname(101));
		System.out.println();
		
		e1.setEid(121);
		System.out.println(e1.getEid());
		System.out.println(e1.getEname(101));
		System.out.println(e1.getEname(121));
		e1.setSalary(200000);
		System.out.println(e1.getSalary());
		System.out.println(e1.getCname(101));
		System.out.println(e1.getCname(121));
	}
}
