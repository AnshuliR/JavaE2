package hybridinheritance;

public class Average extends Data {
	public static void avg(int n1, int n2) {
		System.out.println("Average = "+((n1+n2)/2));
	}
	public static void main(String[] args) {
		Average a = new Average();
		a.avg(a.n1,a.n2);
	}
}
